
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Optional;


public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Calculator_FXML");

        AnchorPane pane = FXMLLoader.load(getClass().getResource("view.fxml"));
        primaryStage.setScene(new Scene(pane));

        primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {

                if(event.getCode() == KeyCode.ESCAPE) {

                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to quit the application?");
                    alert.setTitle("Exit confirmation");
                    Optional<ButtonType> optionalBtn = alert.showAndWait();
                    if(optionalBtn.get() == ButtonType.OK){System.exit(0);}
                }
            }
        });
        primaryStage.show();
    }
}
