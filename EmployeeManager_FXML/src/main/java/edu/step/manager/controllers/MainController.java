package edu.step.manager.controllers;

import edu.step.manager.dao.EmployeeDao;
import edu.step.manager.handlers.AddDialogCloseHandler;
import edu.step.manager.handlers.TableViewCallback;
import edu.step.manager.handlers.TableViewChangeListener;
import edu.step.manager.model.*;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;


public class MainController implements Initializable {

    @FXML
    private TableView<Employee> tableView;

    @FXML
    private TableColumn<Employee, Integer> idColumn;

    @FXML
    private TableColumn<Employee, String> nameColumn;

    @FXML
    private TableColumn<Employee, String> surnameColumn;

    @FXML
    private TableColumn<Employee, LocalDate> birthdateColumn;

    @FXML
    private TableColumn<Department, String> departmentColumn;

    @FXML
    private TableColumn<Profession, String> functionColumn;

    @FXML
    private TableColumn<Address, String> addressColumn;

    @FXML
    private TableColumn<Gender, Enum> genderColumn;

    @FXML
    private TableColumn<Employee, String> idnpColumn;

    private EmployeeDao dao = new EmployeeDao();

    private final ObservableList<Employee> employeeData = FXCollections.observableArrayList(
            new TableViewCallback());

    @FXML
    void openAddDialog(ActionEvent event) throws IOException, SQLException {
        // Open Add dialog
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/add.fxml"));
        AnchorPane container = loader.load();
        AddController addController = loader.getController();
        Scene scene = new Scene(container);
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setScene(scene);
        stage.setOnCloseRequest(ev -> {
            System.out.println("Are you sure you want to quit the application?");
        });
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
        Employee emp = addController.getResult();
        // Salvam in baza de date
        dao.createWithResources(emp);
        this.employeeData.add(emp);
    }

    @FXML
    void openDeleteDialog(ActionEvent event) throws SQLException {
        int selectedRow = tableView.getSelectionModel().getSelectedIndex();
        if(selectedRow != -1) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure?");
            alert.setTitle("Please confirm");
            Optional<ButtonType> optionalButton = alert.showAndWait();
            if(optionalButton.get() == ButtonType.OK){
                dao.deleteWithResources(employeeData.get(selectedRow).getId());
                this.employeeData.remove(selectedRow);
            }
        }

    }

    @FXML
    void openEditDialog(ActionEvent event) throws IOException {
        int selectedRow = tableView.getSelectionModel().getSelectedIndex();
        if(selectedRow != -1) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/edit.fxml"));
            AnchorPane container = loader.load();
            EditController editController = loader.getController();
            editController.setData(employeeData.get(selectedRow));
            Scene scene = new Scene(container);
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();

            this.employeeData.get(selectedRow).setName(editController.getData().getName());
            this.employeeData.get(selectedRow).setSurname(editController.getData().getSurname());
            this.employeeData.get(selectedRow).setBirthdate(editController.getData().getBirthdate());
            this.employeeData.get(selectedRow).setIdnp(editController.getData().getIdnp());
            this.employeeData.get(selectedRow).setAddressObjectProperty(editController.getData().getAddressObjectProperty());
            this.employeeData.get(selectedRow).setGender(editController.getData().getGender());
            this.employeeData.get(selectedRow).setDepartmentObjectProperty(editController.getData().getDepartmentObjectProperty());
            this.employeeData.get(selectedRow).setProfessionObjectProperty(editController.getData().getProfessionObjectProperty());
        }

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        List<Employee> emps = null;
        try {
            emps = dao.readWithResources();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        employeeData.addAll(emps);
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        surnameColumn.setCellValueFactory(new PropertyValueFactory<>("surname"));
        birthdateColumn.setCellValueFactory(new PropertyValueFactory<>("birthdate"));
        idnpColumn.setCellValueFactory(new PropertyValueFactory<>("idnp"));
        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<>("address"));
        functionColumn.setCellValueFactory(new PropertyValueFactory<>("profession"));
        genderColumn.setCellValueFactory(new PropertyValueFactory<>("gender"));

        this.employeeData.addAll(emps);
        tableView.setItems(employeeData);
        tableView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        this.employeeData.addListener((ListChangeListener<Employee>) change -> {
            while (change.next()){
                if(change.wasAdded()) {
                    for (int i = change.getFrom(); i < change.getTo(); i++) {
                        System.out.println("Added");
                        System.out.println(employeeData.get(i));
                        try {
                            dao.createWithResources(employeeData.get(i));
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
                else if(change.wasUpdated()){
                    for (int i = change.getFrom(); i < change.getTo(); i++) {
                        System.out.println("Updated");
                        System.out.println(employeeData.get(i));
                        try {
                            dao.updateWithResources(employeeData.get(i));
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
                else if(change.wasRemoved()){
                    for(Employee emp: change.getRemoved()) {
                        System.out.println("removed: " + emp);
                        try {
                            dao.deleteWithResources(emp.getId());
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
    }
}

