package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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

    Label selectionMsg = new Label("Choose your Gender");
    public static void main(String[] args) { Application.launch(args); }
    @Override public void start(Stage stage) { CheckBox fordCbx = new CheckBox("Male");
    CheckBox audiCbx = new CheckBox("Female"); audiCbx.setAllowIndeterminate(true);
 fordCbx.selectedProperty().addListener(new ChangeListener<Boolean>() {
     public void changed(ObservableValue<? extends Boolean> ov, final Boolean value, final Boolean newValue) {
         if(newValue != null && newValue) {
             printMessage("Your Selection: Male"); } } });
 audiCbx.selectedProperty().addListener(new ChangeListener<Boolean>() {
     public void changed(ObservableValue<? extends Boolean> ov, final Boolean value, final Boolean newValue) {
         if(newValue != null && newValue) {
             printMessage("Your Selection: Female"); } } });


    audiCbx.indeterminateProperty().addListener(new ChangeListener<Boolean>() { public void changed(ObservableValue<? extends Boolean> ov,
        final Boolean value, final Boolean newValue)
        { if(newValue != null && newValue) { printMessage("Your indeterminate Selection: Male"); } }
    });

    VBox root = new VBox();
    root.getChildren().addAll(selectionMsg, fordCbx, audiCbx);
            root.setSpacing(20);
    root.setMinSize(350, 250);

    root.setStyle("-fx-padding: 10;" +
            "-fx-border-style: solid inside;" +
            "-fx-border-width: 7;" +
            "-fx-border-insets: 5;" +
            "-fx-border-radius: 5;" +
            "-fx-border-color: aqua;");
    // Create the Scene
    Scene scene = new Scene(root);
// Add the scene to the Stage
stage.setScene(scene);
// Set the title of the Stage
stage.setTitle("A CheckBox Example");
// Display the Stage
stage.show();
}
    // Helper Method
    public void printMessage(String message)
    {
// Set the Text of the Label
        selectionMsg.setText(message);
    }


}
