package com.example.studentproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.RadioMenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentGpaCalc extends Application {
//    @FXML
//    RadioMenuItem one = new RadioMenuItem("1");
//   @FXML
//    Menu gradeMenu = new Menu("Select Grade");
//   @FXML
//    Menu gradeMenu1 = new Menu("Select Grade");
//   @FXML
//    Menu gradeMenu2 = new Menu("Select Grade");
//   @FXML
//    Menu gradeMenu3 = new Menu("Select Grade");
//   @FXML
//    Menu gradeMenu4 = new Menu("Select Grade");
//   @FXML
//    Menu gradeMenu5 = new Menu("Select Grade");
//   @FXML
//    Menu gradeMenu6 = new Menu("Select Grade");
//   @FXML
//    Menu gradeMenu7 = new Menu("Select Grade");
//   @FXML
//    Menu gradeMenu8 = new Menu("Select Grade");
//   @FXML
//    Menu gradeMenu9 = new Menu("Select Grade");
//   public void radioButton(ActionEvent e){
//       String no = ((RadioMenuItem)e.getSource()).getText();
//       gradeMenu.setText(no);
// @FXML
// private Menu gradeMenu0,gradeMenu1,gradeMenu2,gradeMenu3,gradeMenu4,gradeMenu5,gradeMenu6,gradeMenu7,gradeMenu8,gradeMenu9;
   private Menu[] grade = new Menu[10];

   private Menu[] credit = new Menu[10];
//   @FXML
//   public void instantiate(){
//       instant();
//   }

    @FXML
    private Menu grade0,grade1,grade2,grade3,grade4,grade5,grade6,grade7,grade8,grade9;
    @FXML
    private Menu credit0,credit1,credit2,credit3,credit4,credit5,credit6,credit7,credit8,credit9;

    Label lab = new Label();
   public void instant(){
       credit[0] = credit0;
       credit[1] = credit1;
       credit[2] = credit2;
       credit[3] = credit3;
       credit[4] = credit4;
       credit[5] = credit5;
       credit[6] = credit6;
       credit[7] = credit7;
       credit[8] = credit8;
       credit[9] = credit9;
       grade[0] = grade0;
       grade[1] = grade1;
       grade[2] = grade2;
       grade[3] = grade3;
       grade[4] = grade4;
       grade[5] = grade5;
       grade[6] = grade6;
       grade[7] = grade7;
       grade[8] = grade8;
       grade[9] = grade9;
   }
   @FXML
   private Button calc;
   @FXML
   private Label label;
   public void setCalc(){
       calc.setOnAction(e->label.setText(calcCgpa()));
          }

   public String calcCgpa(){
       instant();
        int i = 0;
        double sum = 0;
        int y = 0;
        for(Menu x: grade){
            String c = credit[i].getText();
            String g = x.getText();
            double credits = 0;
            if(g == "Select Grade" || c == "Select Course Credit"){
                sum += 0;
                credits += 0;
            }
            else if(g == "A" && c != "Select Course Credit"){
                credits += Double.parseDouble(c);
                sum += (5 * credits);
                y += credits;
            }
            else if(g == "B" && c != "Select Course Credit"){
                credits += Double.parseDouble(c);
                sum += (4 * credits);
                y += credits;
            }
            else if(g == "C" && c != "Select Course Credit"){
                credits += Double.parseDouble(c);
                sum += (3 * credits);
                y += credits;
            }
            else if(g == "D" && c != "Select Course Credit"){
                credits += Double.parseDouble(c);
                sum += (2 * credits);
                y += credits;
            }
            else if(g == "E" && c != "Select Course Credit"){
                credits += Double.parseDouble(c);
                sum += (1 * credits);
                y += credits;
            }
            else if (g == "F" && c != "Select Course Credit"){
                credits += Double.parseDouble(c);
                sum += (0 * credits);
                y += credits;
            }
            else{
            };
            i++;
        }
        double cgpa = sum/y;
        return "" + cgpa;
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
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("gpaDemoOne.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Simple CGPA Calculator");
        stage.setScene(scene);
        stage.show();
    }
}
