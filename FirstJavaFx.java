package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {




    @Override
    public void start(Stage primaryStage) throws Exception{
        Button btn = new Button();
        btn.setText("Who is the legend??");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Md. Rakib Trofder");
            }
        });
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(btn);
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(stackPane, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
