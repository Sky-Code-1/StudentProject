package com.example.studentproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.RadioButton;
import javafx.scene.control.RadioMenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentDemoTwo extends Application {
   @FXML
   RadioMenuItem [] A = new RadioMenuItem[10];
    @FXML
   RadioMenuItem [] B = new RadioMenuItem[10];
    @FXML
   RadioMenuItem [] C = new RadioMenuItem[10];
    @FXML
   RadioMenuItem [] D = new RadioMenuItem[10];
    @FXML
   RadioMenuItem [] E = new RadioMenuItem[10];
    @FXML
   RadioMenuItem [] F = new RadioMenuItem[10];
    @FXML
    Menu[] grade = new Menu[10];
    public void instant(){
        int i = 0;
        for(RadioMenuItem x: A){
            x = new RadioMenuItem("A");
            B[i] = new RadioMenuItem("B");
            C[i] = new RadioMenuItem("C");
            D[i] = new RadioMenuItem("D");
            E[i] = new RadioMenuItem("E");
            F[i] = new RadioMenuItem("F");
            grade[i] = new Menu("Select Grade");
       i++;
        }
    }
    @FXML
    public void instantialize(){
        instant();
    }
    @FXML
    public void onAction(ActionEvent e){
        String txt = ((RadioMenuItem)e.getSource()).getText();
        ((RadioMenuItem)e.getSource()).getParentMenu().setText(txt);
    }
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader load = new FXMLLoader(StudentDemoTwo.class.getResource("mode.fxml"));
        Scene scene = new Scene(load.load());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
