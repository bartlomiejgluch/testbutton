package someProgram;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class App extends Application {

    Button button;

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage)throws Exception {
        primaryStage.setTitle("Program Bartłomieja");
        button = new Button();
        button.setText("Click me");

        button.setOnAction(e -> System.out.println("Oooooo don't click me"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
