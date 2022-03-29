package edu.step.manager.controllers;

import edu.step.manager.model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.time.LocalDate;

public class EditController {


    @FXML
    private TextField idTextField;

    @FXML
    private TextField nameTextField;

    @FXML
    private DatePicker birthdatePicker;

    @FXML
    private TextField surnameTextField;

    @FXML
    private TextField departmentTextField;

    @FXML
    private TextField functionTextField;

    @FXML
    private TextField genderTextField;

    @FXML
    private TextField streetNameTextField;

    @FXML
    private TextField streetNumberTextField;

    @FXML
    private TextField houseNumberTextField;

    @FXML
    private TextField apartNumberTextField;

    @FXML
    private TextField idnpTextField;

    private Employee data;

    public void setData(Employee data) {
        this.data = data;
        idTextField.setText(String.valueOf(data.getId()));
        nameTextField.setText(data.getName());
        surnameTextField.setText(data.getSurname());
        idnpTextField.setText(data.getIdnp());
        birthdatePicker.setValue(data.getBirthdate());
        departmentTextField.setText(data.getDepartmentObjectProperty().getDepartmentName());
        functionTextField.setText(data.getProfessionObjectProperty().getProfessionName());
        genderTextField.setText(data.getGender().toString());
        streetNameTextField.setText(data.getAddressObjectProperty().getStreetName());
        streetNumberTextField.setText(String.valueOf(data.getAddressObjectProperty().getStreetNumber()));
        houseNumberTextField.setText(String.valueOf(data.getAddressObjectProperty().getHouseNumber()));
        apartNumberTextField.setText(String.valueOf(data.getAddressObjectProperty().getApartmentNumber()));

    }

    public Employee getData() {
        return data;
    }

    @FXML
    void cancel(ActionEvent event) {
        closeWindow(event);
    }

    @FXML
    void save(ActionEvent event) {
//        Integer id, String name, String surname, LocalDate birthdate, Department departmentObjectProperty, Profession
//        professionObjectProperty, Address addressObjectProperty, Gender gender, String idnp


        this.data.setName(nameTextField.getText());
        this.data.setSurname(surnameTextField.getText());
        this.data.setId(Integer.parseInt(idTextField.getText()));
        this.data.setDepartmentObjectProperty(new Department(departmentTextField.getText()));
        this.data.setProfessionObjectProperty(new Profession(functionTextField.getText()));
        this.data.setBirthdate(birthdatePicker.getValue());
        this.data.setAddressObjectProperty(new Address(streetNameTextField.getText(),
                                                       Integer.parseInt(streetNumberTextField.getText()),
                                                       Integer.parseInt(houseNumberTextField.getText()),
                                                       Integer.parseInt(apartNumberTextField.getText())));
        this.data.setGender(Gender.valueOf(genderTextField.getText()));
        this.data.setIdnp(idnpTextField.getText());

        closeWindow(event);
    }

    private void closeWindow(ActionEvent event) {
        Node button = (Node) event.getSource();
        Stage stage = (Stage) button.getScene().getWindow();
        stage.close();
    }

}
