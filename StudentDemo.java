package com.example.studentproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.RadioMenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentDemo extends Application {
  @FXML
  RadioMenuItem A = new RadioMenuItem("A");
  @FXML
   RadioMenuItem B = new RadioMenuItem("A");
  @FXML
   RadioMenuItem C = new RadioMenuItem("A");
  @FXML
   RadioMenuItem D = new RadioMenuItem("A");
  @FXML
   RadioMenuItem E = new RadioMenuItem("A");
  @FXML
   RadioMenuItem F = new RadioMenuItem("A");
  @FXML
   Menu grade = new Menu("Select Grade");
    public RadioMenuItem[] M = new RadioMenuItem[3];

//    public void make(){
//      for( @FXML
//  public void initialize(){
//      make();
//  }RadioMenuItem x: M) {
//                  x = new RadioMenuItem("A");
//                  x.setOnAction(this::onAction);
//      }
//  }
  @FXML
   MenuBar grades = new MenuBar();
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
     FXMLLoader root = new FXMLLoader(StudentDemo.class.getResource("demo.fxml"));
     Scene scene = new Scene(root.load());
     primaryStage.setScene(scene);
     primaryStage.show();
    }
}
