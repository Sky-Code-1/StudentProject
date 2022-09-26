package com.example.studentproject;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class Studentpgw extends StudentCgpaCalc {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button bun = new Button("calculate");
        Label labs = new Label();
        Font font = Font.font("Gabriola", FontPosture.REGULAR,28);
        labs.setStyle("-fx-background-color: yellow");
        labs.setFont(font);
        bun.setOnAction(e -> labs.setText(calcCgpa(5)));
        HBox hbox = new HBox(20,bun,labs);
        VBox box = create(12);
        AnchorPane pane = new AnchorPane(box);
        BorderPane root = new BorderPane(pane);
        hbox.setAlignment(Pos.CENTER);
        root.setBottom(hbox);
        Scene scene = new Scene(root,300,500);
        primaryStage.setScene(scene);
     primaryStage.show();
    }
}
