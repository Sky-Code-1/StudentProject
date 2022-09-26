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

public class StudentCgpaCalc extends Application {

    Menu[] grade;
    Menu[] credit;
    MenuBar[] bar;
    HBox[] box;
    MenuBar[] bars;

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
        VBox vbox;
        if(n <= 10)
            vbox = new VBox(12);
        else
            vbox = new VBox(6);
        grade = new Menu[n];
        credit = new Menu[n];
        bar = new MenuBar[n];
        box = new HBox[n];
        bars = new MenuBar[n];
        double i = 20;
        double j;
        double k = 320;
        if(n <= 10)
            j = 10;
        else
            j = 6;

        for(int p = 0; p < n; p++){
            grade[p] = new Menu("Select Grade");
            grade[p].getItems().addAll(A[p],B[p],C[p],D[p],E[p],F[p]);
            credit[p] = new Menu("Select Course Credit");
            credit[p].getItems().addAll(one[p],two[p],thr[p],fou[p],fiv[p],six[p]);
            bar[p] = new MenuBar();
            bars[p] = new MenuBar();
            box[p] = new HBox(20);
            box[p].setAlignment(Pos.CENTER);
            bar[p].getMenus().add(grade[p]);
            bars[p].getMenus().add(credit[p]);
            //bar[p].setAlignment(Pos.CENTER);
            box[p].getChildren().addAll(bar[p],bars[p]);
            bar[p].setPrefWidth(80);
            bars[p].setPrefWidth(120);
            box[p].setManaged(false);
            box[p].relocate(i,j);
            box[p].resize(270,60);
            HBox.setHgrow(bar[p], Priority.ALWAYS);
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
    public String calcCgpa(int n) {
        int i = 0;
        double sum = 0;
        int y = 0;
        switch (n) {
            case 4: {
                for (Menu x : grade) {
                    String c = credit[i].getText();
                    String g = x.getText();
                    double credits = 0;
                    if (g == "Select Grade" || c == "Select Course Credit") {
                        sum += 0;
                        credits += 0;
                    } else if (g == "A" && c != "Select Course Credit") {
                        credits += Double.parseDouble(c);
                        sum += (4 * credits);
                        y += credits;
                    } else if (g == "B" && c != "Select Course Credit") {
                        credits += Double.parseDouble(c);
                        sum += (3 * credits);
                        y += credits;
                    } else if (g == "C" && c != "Select Course Credit") {
                        credits += Double.parseDouble(c);
                        sum += (2 * credits);
                        y += credits;
                    } else if (g == "D" && c != "Select Course Credit") {
                        credits += Double.parseDouble(c);
                        sum += (1 * credits);
                        y += credits;
                    } else if (g == "E" && c != "Select Course Credit") {
                        credits += Double.parseDouble(c);
                        sum += (0.5 * credits);
                        y += credits;
                    } else if (g == "F" && c != "Select Course Credit") {
                        credits += Double.parseDouble(c);
                        sum += (0 * credits);
                        y += credits;
                    } else {
                    }
                    ;
                    i++;
                }
                break;
            }
                default: {
                    for (Menu x : grade) {
                        String c = credit[i].getText();
                        String g = x.getText();
                        double credits = 0;
                        if (g == "Select Grade" || c == "Select Course Credit") {
                            sum += 0;
                            credits += 0;
                        } else if (g == "A" && c != "Select Course Credit") {
                            credits += Double.parseDouble(c);
                            sum += (5 * credits);
                            y += credits;
                        } else if (g == "B" && c != "Select Course Credit") {
                            credits += Double.parseDouble(c);
                            sum += (4 * credits);
                            y += credits;
                        } else if (g == "C" && c != "Select Course Credit") {
                            credits += Double.parseDouble(c);
                            sum += (3 * credits);
                            y += credits;
                        } else if (g == "D" && c != "Select Course Credit") {
                            credits += Double.parseDouble(c);
                            sum += (2 * credits);
                            y += credits;
                        } else if (g == "E" && c != "Select Course Credit") {
                            credits += Double.parseDouble(c);
                            sum += (1 * credits);
                            y += credits;
                        } else if (g == "F" && c != "Select Course Credit") {
                            credits += Double.parseDouble(c);
                            sum += (0 * credits);
                            y += credits;
                        } else {
                        }
                        ;
                        i++;
                    }
                }
            }
        double cgpa = sum / y;
        return "" + cgpa;
        }
    public static void main(String[] args) {
        launch(args);
    }
    private int n = 0;
    public void action(){
        n = 5;
    }
    public void actions(){
        n = 4;
    }
    public void exit(){
        Platform.exit();
    }
    @Override
    public void start(Stage primaryStage) {
        StudentPg page1 = new StudentPg();
        StudentPg3 page2 = new StudentPg3();
      VBox vbox = create(10);
            Pane pane = new Pane();
        Font font = Font.font("Gabriola", FontPosture.REGULAR, 28);
        Menu menu = new Menu("Menu");
        MenuItem five = new MenuItem("5.0 CGPA Calculator");
        MenuItem four = new MenuItem("4.0 CGPA Calculator");
        MenuItem exit = new Menu("Exit");
        exit.setOnAction(e -> exit());
        five.setOnAction(e -> { action();
        primaryStage.setTitle("5.0 Simple Cgpa Calculator");});
        four.setOnAction(e -> { actions();
            primaryStage.setTitle("4.0 Simple Cgpa Calculator");});
        MenuItem one = new MenuItem("Customized One Session CGPA Calculator");
        MenuItem full = new MenuItem("Customized Full Programme CGPA Calculator");
        one.setOnAction(e -> {primaryStage.setScene(page1.page());});
        full.setOnAction(e -> {primaryStage.setScene(page2.page());});
        menu.getItems().addAll(five,new SeparatorMenuItem(),four,new SeparatorMenuItem(),one,new SeparatorMenuItem(),full,new SeparatorMenuItem(),exit);
        MenuBar ber = new MenuBar();
        ber.getMenus().add(menu);
              TextField cgpa1, cgpa2, c1, c2;
            Label label = new Label("Full Session Cgpa");
            Button cgpa = new Button("Calculate Cgpa");
            cgpa1 = new TextField();
            cgpa2 = new TextField();
            c2 = new TextField();
            c1 = new TextField();
            cgpa1.setPromptText("1st Semester Cgpa");
            cgpa2.setPromptText("2nd Semester Cgpa");
            c1.setPromptText("Total Credit");
            c2.setPromptText("Total Credit");
            pane.getChildren().addAll(cgpa1, cgpa2, c1, c2, label, cgpa);
            cgpa1.setPrefSize(114, 40);
            cgpa2.setPrefSize(114, 40);
            c1.setPrefSize(89, 40);
            c2.setPrefSize(89, 40);
            cgpa1.relocate(1, 11);
            cgpa2.relocate(1, 86);
            c1.relocate(125, 11);
            c2.relocate(125, 86);
            label.setFont(font);
            label.setStyle("-fx-background-color: yellow");
            label.setPrefSize(152, 45);
            label.relocate(35, 156);
            label.setAlignment(Pos.CENTER);
            cgpa.relocate(62, 205);

            VBox box = new VBox(15);
        box.setAlignment(Pos.CENTER);
        box.setPrefSize(172,108);
        Label lab = new Label("Semester's Cgpa");
        lab.setStyle("-fx-background-color: yellow");
        lab.setFont(font);
        lab.setAlignment(Pos.CENTER);
        lab.setPrefSize(170,45);
        Button but = new Button("Calculate Cgpa");
        but.setPrefSize(98,25);
        box.getChildren().addAll(lab,but);
         pane.setManaged(false);
         pane.setPrefSize(221,252);
         Pane root = new Pane();
         root.setPrefSize(538,431);
        Image pic = new Image(getClass().getResourceAsStream("pure-concrete.jpg"));
        ImageView pci = new ImageView(pic);
         root.getChildren().addAll(pci,ber,vbox,box,pane);
         ber.relocate(10,0);
         vbox.relocate(0,10);
         box.relocate(336,298);
         pane.relocate(317,37);
         Scene scene = new Scene(root);
         primaryStage.setScene(scene);
        page1.back.setOnAction(e -> {
            primaryStage.setScene(scene);
            primaryStage.setTitle("Simple Cgpa Calculator");
        });
        primaryStage.setMaxWidth(550);
        page2.back.setOnAction(e -> {
            primaryStage.setScene(scene);
            primaryStage.setTitle("Simple Cgpa Calculator");
        });
        page1.pro.setOnAction(e -> {
            AnchorPane roof = page1.two();
            roof.getChildren().addAll(ber,box,pane);
            n = Integer.parseInt(page1.gpa.getText());
            primaryStage.setTitle("Customized Cgpa Calculator for a Session");
            Scene scenary = new Scene(roof);
//            vbox = create(Integer.parseInt(page1.select.getText()));
            primaryStage.setScene(scenary);
        });
        but.setOnAction(e -> lab.setText(calcCgpa(n)));
         primaryStage.setTitle("Simple Cgpa Calculator");
//         primaryStage.setResizable(false);
         primaryStage.show();
    }
}