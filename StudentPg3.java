package com.example.studentproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentPg3 extends Application {
    RadioMenuItem[] courseNo = new RadioMenuItem[4];
    RadioMenuItem[] gradeNo = new RadioMenuItem[2];
    private ToggleGroup session = new ToggleGroup();
    private ToggleGroup grad = new ToggleGroup();
    public Button back = new Button("Back");
    public Button pro = new Button("Proceed");
    private void act(ActionEvent e){
        String a = ((RadioMenuItem)e.getSource()).getText();
        ((RadioMenuItem)e.getSource()).getParentMenu().setText(a);
    }
    public Scene page(){
        Image mag = new Image(getClass().getResourceAsStream("pure-concrete.jpg"));
        ImageView gam = new ImageView(mag);
        Menu select = new Menu("Number of Sessions");
        MenuBar bar = new MenuBar();
        int i = 3;
        String x = "" + i;
        VBox box = new VBox(20);
        for (RadioMenuItem item: courseNo) {
            item = new RadioMenuItem(x);
            select.getItems().add(item);
            item.setToggleGroup(session);
            item.setOnAction(this::act);
            i++;
            x = ""+i;
        }
        gradeNo[0] = new RadioMenuItem("4");
        gradeNo[1] = new RadioMenuItem("5");
        gradeNo[0].setToggleGroup(grad);
        gradeNo[1].setToggleGroup(grad);
        gradeNo[0].setOnAction(this::act);
        gradeNo[1].setOnAction(this::act);
        Menu gpa = new Menu("Total Cgpa Value");
        MenuBar gpaBar = new MenuBar();
        gpa.getItems().addAll(gradeNo[0],gradeNo[1]);
        gpaBar.getMenus().add(gpa);
        bar.getMenus().add(select);
        bar.setStyle("-fx-background-color: yellow");
        gpaBar.setStyle("-fx-background-color: yellow");
        box.setAlignment(Pos.CENTER);
//        box.setManaged(false);
        bar.setPrefSize(140,28);
        gpaBar.setPrefSize(140,28);
        bar.relocate(183,35);
        gpaBar.relocate(183,89);
        Pane pane = new Pane();
        pane.getChildren().addAll(gam,back,pro,bar,gpaBar);
//        if(select.getText().equals("Number Of Course") || gpa.getText().equals("Total Cgpa Value"))
//            pro.setDisable(true);
//        else
//            pro.setDisable(false);
        box.setPrefSize(330,77);
        box.relocate(104,59);
        back.relocate(14,392);
        pro.relocate(461,392);
        pane.setPrefSize(538,431);
        Scene scene = new Scene(pane);
        return scene;
    }
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
