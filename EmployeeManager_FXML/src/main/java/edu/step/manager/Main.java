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

        stage.show();

        EmployeeDao dao = new EmployeeDao();


        //read
        for(Employee emp : dao.readWithResources()){
            System.out.println(emp);
        };

    }
}
