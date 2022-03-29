package edu.step.manager.controllers;

import edu.step.manager.model.*;
import javafx.beans.property.ObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.time.LocalDate;

public class AddController {

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


    private Employee result;

    public Employee getResult() {
        return result;
    }

    @FXML
    void cancel(ActionEvent event) {
        closeWindow(event);
    }

    @FXML
    void save(ActionEvent event) {

        if (idTextField.getText() != null && !idTextField.getText().isEmpty() &&
            nameTextField.getText() != null && !nameTextField.getText().isEmpty() && nameTextField.getText().length() < 3 &&
            surnameTextField.getText() != null && !surnameTextField.getText().isEmpty() && surnameTextField.getText().length() < 3 &&
            birthdatePicker.getValue() != null && !birthdatePicker.getValue().isBefore(LocalDate.of(1940, 31, 12)) &&
            departmentTextField.getText() != null && !departmentTextField.getText().isEmpty() && departmentTextField.getText().length() < 3 &&
            functionTextField.getText() != null && !functionTextField.getText().isEmpty() && functionTextField.getText().length() < 3 &&
            genderTextField.getText() != null && !genderTextField.getText().isEmpty() && genderTextField.getText().equals(Gender.values().toString()) &&
            streetNameTextField.getText() != null && !streetNameTextField.getText().isEmpty() &&
            streetNumberTextField.getText() != null && !streetNumberTextField.getText().isEmpty() &&
            houseNumberTextField.getText() != null && !houseNumberTextField.getText().isEmpty() &&
            apartNumberTextField.getText() != null && !apartNumberTextField.getText().isEmpty() &&
            idnpTextField.getText() != null && !idnpTextField.getText().isEmpty() && idnpTextField.getText().length() < 13) {

            Integer id = Integer.parseInt(idTextField.getText());
            String name = nameTextField.getText();
            String surname = surnameTextField.getText();
            LocalDate date =  birthdatePicker.getValue();
            String departmentName = departmentTextField.getText();
            String functionName = functionTextField.getText();
            String gender = genderTextField.getText();
            String streetName = streetNameTextField.getText();
            Integer streetNumber = Integer.parseInt(streetNumberTextField.getText());
            Integer houseNumber = Integer.parseInt(houseNumberTextField.getText());
            Integer apartNumber = Integer.parseInt(apartNumberTextField.getText());


            String idnp = idnpTextField.getText();

            result = new Employee(id, name, surname, date,
                     new Department(departmentName),
                     new Profession(functionName),
                     new Address(streetName, streetNumber, houseNumber, apartNumber),
                     Gender.valueOf(gender),
                     idnp);

            closeWindow(event);
        }
    }

    private void closeWindow(ActionEvent event) {
        Node button = (Node) event.getSource();
        Stage stage = (Stage) button.getScene().getWindow();
        stage.close();
    }


}
