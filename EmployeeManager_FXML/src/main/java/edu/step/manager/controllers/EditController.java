package edu.step.manager.controllers;

import edu.step.manager.model.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditController {

    @FXML
    private TextField idTextField;

    @FXML
    private TextField nameTextField;

    @FXML
    private DatePicker birthdatePicker;

    private Employee data;

    public void setData(Employee data) {
        this.data = data;
        idTextField.setText(String.valueOf(data.getId()));
        nameTextField.setText(data.getName());
        birthdatePicker.setValue(data.getBirthdate());
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
        this.data = new Employee(Integer.parseInt(idTextField.getText()),
                nameTextField.getText(),
                birthdatePicker.getValue());
        closeWindow(event);
    }

    private void closeWindow(ActionEvent event) {
        Node button = (Node) event.getSource();
        Stage stage = (Stage) button.getScene().getWindow();
        stage.close();
    }


}
