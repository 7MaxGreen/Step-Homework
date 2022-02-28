package edu.step.manager;

import edu.step.manager.dao.EmployeeDao;
import edu.step.manager.model.Employee;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane container = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));
        stage.setScene(new Scene(container));
        stage.setTitle("Employee manager FX");
        stage.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>(){

            @Override
            public void handle(KeyEvent event) {
                System.out.println("Handler");
            }
        });

        EmployeeDao dao = new EmployeeDao();
        LocalDate.of(2033, 11, 07);
        //save
//        dao.create(new Employee("Al", "Pacino"));
//        dao.create(new Employee("Morgan", "Freeman"));
//        dao.create(new Employee("Daniel", "Day-Lewis"));
//        dao.create(new Employee("Samuel", "L.Jackson"));
//        dao.create(new Employee("Benicio", "Del Toro"));
        dao.createWithResources(new Employee(33, "Christian", "Bale"));

        //read
        for(Employee emp : dao.readWithResources()){
            System.out.println(emp);
        };

        //update
//        dao.updateWithResources(3,"Negreanu", "Daniel");

        //delete
        dao.deleteWithResources(10);

        stage.show();
    }
}
