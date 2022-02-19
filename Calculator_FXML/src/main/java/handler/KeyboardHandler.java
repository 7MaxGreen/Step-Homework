package handler;

import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.Optional;


public class KeyboardHandler implements EventHandler<KeyEvent> {
    @Override
    public void handle(KeyEvent event) {


        if(event.getCode() == KeyCode.ESCAPE) {

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to quit the application?");
            alert.setTitle("Exit confirmation");
            Optional<ButtonType> optionalBtn = alert.showAndWait();
            if(optionalBtn.get() == ButtonType.OK){System.exit(0);}
        }
    }
}

