package com.example.studentproject;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;
public class StudentGpa extends Application {
    private RadioMenuItem[] A;
    private RadioMenuItem[] B;
    private RadioMenuItem[] C;
    private RadioMenuItem[] D;
    private RadioMenuItem[] E;
    private RadioMenuItem[] F;
    private RadioMenuItem[] one;
    private RadioMenuItem[] two;
    private RadioMenuItem[] thr;
    private RadioMenuItem[] fou;
    private RadioMenuItem[] fiv;
    private RadioMenuItem[] six;
    private Label cgpa = new Label("Full Session Cgpa");
    private Font font = Font.font("Gabriola", FontPosture.REGULAR,28);
    private Button calc = new Button("Calculate");

    Menu[] grade;
    Menu[] credit;
    MenuBar[] bar;
    HBox[] box;
    MenuBar[] bars;
    Menu menu = new Menu("Menu");
    public VBox create(int n){
         A = new RadioMenuItem[n];
         B = new RadioMenuItem[n];
         C = new RadioMenuItem[n];
         D = new RadioMenuItem[n];
         E = new RadioMenuItem[n];
         F = new RadioMenuItem[n];
         one = new RadioMenuItem[n];
         two = new RadioMenuItem[n];
         thr = new RadioMenuItem[n];
         fou = new RadioMenuItem[n];
         fiv = new RadioMenuItem[n];
         six = new RadioMenuItem[n];
        ToggleGroup[] creditGroup = new ToggleGroup[n];
        ToggleGroup[] gradeGroup = new ToggleGroup[n];
        for (int a = 0; a < n; a++) {
            A[a] = new RadioMenuItem("A");
            B[a] = new RadioMenuItem("B");
            C[a] = new RadioMenuItem("C");
            D[a] = new RadioMenuItem("D");
            E[a] = new RadioMenuItem("E");
            F[a] = new RadioMenuItem("F");
            one[a] = new RadioMenuItem("1");
            two[a] = new RadioMenuItem("2");
            thr[a] = new RadioMenuItem("3");
            fou[a] = new RadioMenuItem("4");
            fiv[a] = new RadioMenuItem("5");
            six[a] = new RadioMenuItem("6");
            gradeGroup[a] = new ToggleGroup();
            A[a].setToggleGroup(gradeGroup[a]);
            B[a].setToggleGroup(gradeGroup[a]);
            C[a].setToggleGroup(gradeGroup[a]);
            D[a].setToggleGroup(gradeGroup[a]);
            E[a].setToggleGroup(gradeGroup[a]);
            F[a].setToggleGroup(gradeGroup[a]);
            creditGroup[a] = new ToggleGroup();
            one[a].setToggleGroup(creditGroup[a]);
            two[a].setToggleGroup(creditGroup[a]);
            thr[a].setToggleGroup(creditGroup[a]);
            fou[a].setToggleGroup(creditGroup[a]);
            fiv[a].setToggleGroup(creditGroup[a]);
            six[a].setToggleGroup(creditGroup[a]);
        }
        VBox vbox = new VBox(12);
      //  vbox.setBackground(pci);
         grade = new Menu[n];
         credit = new Menu[n];
         bar = new MenuBar[n];
         box = new HBox[n];
         bars = new MenuBar[n];
        double i = 20;
        double j = 30;
        double k = 320;
        for(int p = 0; p < n; p++){
             grade[p] = new Menu("Select Grade");
             grade[p].getItems().addAll(A[p],B[p],C[p],D[p],E[p],F[p]);
             credit[p] = new Menu("Select Course Credit");
             credit[p].getItems().addAll(one[p],two[p],thr[p],fou[p],fiv[p],six[p]);
             bar[p] = new MenuBar();
             bars[p] = new MenuBar();
             box[p] = new HBox(20);
             box[p].setAlignment(Pos.CENTER);
//             box[p].setPrefWidth(600);
             bar[p].getMenus().add(grade[p]);
            bars[p].getMenus().add(credit[p]);
             //bar[p].setAlignment(Pos.CENTER);
             box[p].getChildren().addAll(bar[p],bars[p]);
             bar[p].setPrefWidth(80);
             bars[p].setPrefWidth(120);
           // bar[p].setPrefWidth(100);
           // bars[p].setPrefWidth(100);
//             bars[p].setManaged(false);
//             bar[p].setManaged(false);
//            bar[p].relocate(i,j);
//            bars[p].relocate(k,j);
            box[p].setManaged(false);
            box[p].relocate(i,j);
            box[p].resize(270,60);
             HBox.setHgrow(bar[p],Priority.ALWAYS);
             HBox.setHgrow(bars[p],Priority.ALWAYS);
             vbox.getChildren().add(box[p]);
             j += 40;
        }
        int y = 0;
           for (Menu x: grade){
               A[y].setOnAction(e->x.setText("A"));
               B[y].setOnAction(e->x.setText("B"));
               C[y].setOnAction(e->x.setText("C"));
               D[y].setOnAction(e->x.setText("D"));
               E[y].setOnAction(e->x.setText("E"));
               F[y].setOnAction(e->x.setText("F"));
               y += 1;
           }
             y = 0;
           for (Menu x: credit){
               one[y].setOnAction(e->x.setText("1"));
               two[y].setOnAction(e->x.setText("2"));
               thr[y].setOnAction(e->x.setText("3"));
               fou[y].setOnAction(e->x.setText("4"));
               fiv[y].setOnAction(e->x.setText("5"));
               six[y].setOnAction(e->x.setText("6"));
               y += 1;
           }
        return vbox;
    }
    public String calcCgpa(){
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
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        try{
            cgpa.setFont(font);
            cgpa.setStyle("-fx-background-color: yellow");
            cgpa.setAlignment(Pos.CENTER);
            cgpa.setManaged(false);
            cgpa.resize(153,45);
            cgpa.relocate(20,20);
            VBox boa = new VBox(10,cgpa,calc);
            calc.setOnAction(e -> cgpa.setText(calcCgpa()));
            boa.setManaged(false);
            boa.resize(200,200);
            boa.setAlignment(Pos.CENTER);
        MenuItem five = new MenuItem("5.0 CGPA Calculator");
        MenuItem four = new MenuItem("4.0 CGPA Calculator");
        MenuItem one = new MenuItem("Customized One Session CGPA Calculator");
        MenuItem full = new MenuItem("Customized Full Programme CGPA Calculator");
        menu.getItems().addAll(five,new SeparatorMenuItem(),four,new SeparatorMenuItem(),one,new SeparatorMenuItem(),full);
        MenuBar ber = new MenuBar();
        ber.getMenus().add(menu);
    //    bar.setManaged(false);
    //    bar.resize(70,30);
        HBox barBox = new HBox(ber);
        barBox.setManaged(false);
        barBox.resize(65,25);
     //   StudentGpa gpa = new StudentGpa();
        VBox box = create(10);
//        box.setPrefWidth(600);
//        box.setPrefHeight(400);
        box.setAlignment(Pos.CENTER);
            Image pic = new Image(getClass().getResourceAsStream("pure-concrete.jpg"));
            ImageView pci = new ImageView(pic);
            box.setManaged(false);
        Pane root = new Pane(pci);
//        root.setStyle("-fx-background-image: water_drops.jpg.jpg");
        root.getChildren().add(barBox);
        barBox.relocate(5,5);
        root.getChildren().addAll(box,boa);
        boa.relocate(350,200);
        box.resize(320,350);
        box.relocate(10,0);
        Button exit = new Button("exit");
//        exit.setOnAction(e -> Platform.exit());
        double x = box.getWidth();
        double y = box.getHeight();
//        root.getChildren().add(exit);
 //       exit.relocate(x/2,(y-20));
        Scene scene = new Scene(root,550,450);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Student CGPA Calculator");
        primaryStage.show();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            Platform.exit();
        }
    }
}