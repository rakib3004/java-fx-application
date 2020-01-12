package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {


    Label selectionMsg = new Label("Choose your Gender");
    public static void main(String[] args)
    {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage)
    {
// Create the Text Fields
        TextField firstNameFld = new TextField();
        TextField lastNameFld = new TextField();

// Create the Labels
        Label firstNameLbl = new Label("_Name:");
        Label lastNameLbl = new Label("_Email");

// Bind the Label to the according Field
        firstNameLbl.setLabelFor(firstNameFld);
// Set mnemonic parsing to the Label
        firstNameLbl.setMnemonicParsing(true);
// Bind the Label to the according Field
        lastNameLbl.setLabelFor(lastNameFld);
// Set mnemonic parsing to the Label
        lastNameLbl.setMnemonicParsing(true);

        GridPane root = new GridPane();
// Add the Labels and Fields to the GridPane
        root.addRow(0, firstNameLbl, firstNameFld);
        root.addRow(1, lastNameLbl, lastNameFld);

// Set the Size of the GridPane
        root.setMinSize(550, 50);



      //  Scene scene = new Scene(root);
// Add the scene to the Stage
        //stage.setScene(scene);

        CheckBox fordCbx = new CheckBox("Male");
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

        VBox root1 = new VBox();
        root1.getChildren().addAll(root,selectionMsg, fordCbx, audiCbx);



        root1.setMinSize(550, 450);
        root1.setSpacing(15);

        root1.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 7;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: aqua;");

        // Create the Scene

        // Create the Scene
        Scene scene1 = new Scene(root1);
// Add the scene to the Stage
        stage.setScene(scene1);
// Set the title of the Stage
        stage.setTitle("Students Information");
// Display the Stage
        stage.show();






/*
* Set the padding of the GridPane
* Set the border-style of the GridPane
* Set the border-width of the GridPane
* Set the border-insets of the GridPane
* Set the border-radius of the GridPane
* Set the border-color of the GridPane
JavaFX Programming Cookbook 6 / 219
*/

    }
    public void printMessage(String message)
    {
// Set the Text of the Label
        selectionMsg.setText(message);
    }

}
