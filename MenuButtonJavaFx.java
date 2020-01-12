package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {


    Label messageLbl = new Label("Choose your car!");
    public static void main(String[] args) { Application.launch(args);

    }
    @Override public void start(Stage stage) {
        MenuItem ford = new MenuItem("BSSE 08");
        ford.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent e) { printMessage("Welcome to BSSE 08"); } });
 MenuItem audi = new MenuItem("BSSE 09");
 audi.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent e) { printMessage("Welcome to BSSE 09"); }
    });

 MenuItem ferrari = new MenuItem("BSSE 10");
 ferrari.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent e) { printMessage("Welcome to BSSE 10"); }
});
 MenuItem porsche = new MenuItem("BSSE 11");
 porsche.setOnAction(new EventHandler<ActionEvent>() { @Override public void handle(ActionEvent e) { printMessage("Welcome to BSSE 11"); }
        });

 MenuButton cars = new MenuButton("Select");
 cars.getItems().addAll(ford, audi, ferrari, porsche);

 VBox root = new VBox();
 root.getChildren().addAll(cars, messageLbl);
 root.setMinSize(350, 250);

 root.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;" + "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
 Scene scene = new Scene(root);
 stage.setScene(scene);
 stage.setTitle("A MenuButton Example");
         stage.show();
        }
 public void printMessage(String message) {  messageLbl.setText(message); }


        }
