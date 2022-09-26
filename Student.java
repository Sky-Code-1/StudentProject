//package com.example.studentproject;
//import javafx.application.Application;
//import javafx.scene.control.*;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.Priority;
//import javafx.scene.layout.VBox;
//
//import java.util.Scanner;
//public interface Student {
//    public default VBox create(int n){
//        RadioMenuItem[] A = new RadioMenuItem[n];
//        RadioMenuItem[] B = new RadioMenuItem[n];
//        RadioMenuItem[] C = new RadioMenuItem[n];
//        RadioMenuItem[] D = new RadioMenuItem[n];
//        RadioMenuItem[] E = new RadioMenuItem[n];
//        RadioMenuItem[] F = new RadioMenuItem[n];
//        RadioMenuItem[] one = new RadioMenuItem[n];
//        RadioMenuItem[] two = new RadioMenuItem[n];
//        RadioMenuItem[] thr = new RadioMenuItem[n];
//        RadioMenuItem[] fou = new RadioMenuItem[n];
//        RadioMenuItem[] fiv = new RadioMenuItem[n];
//        RadioMenuItem[] six = new RadioMenuItem[n];
//        ToggleGroup[] creditGroup = new ToggleGroup[n];
//        ToggleGroup[] gradeGroup = new ToggleGroup[n];
//        for (int a = 0; a < n; a++) {
//            A[a] = new RadioMenuItem("A");
//            B[a] = new RadioMenuItem("B");
//            C[a] = new RadioMenuItem("D");
//            D[a] = new RadioMenuItem("C");
//            E[a] = new RadioMenuItem("E");
//            F[a] = new RadioMenuItem("F");
//            one[a] = new RadioMenuItem("1");
//            two[a] = new RadioMenuItem("2");
//            thr[a] = new RadioMenuItem("3");
//            fou[a] = new RadioMenuItem("4");
//            fiv[a] = new RadioMenuItem("5");
//            six[a] = new RadioMenuItem("6");
//            creditGroup[a] = new ToggleGroup();
//            A[a].setToggleGroup(creditGroup[a]);
//            B[a].setToggleGroup(creditGroup[a]);
//            C[a].setToggleGroup(creditGroup[a]);
//            D[a].setToggleGroup(creditGroup[a]);
//            E[a].setToggleGroup(creditGroup[a]);
//            F[a].setToggleGroup(creditGroup[a]);
//            gradeGroup[a] = new ToggleGroup();
//            one[a].setToggleGroup(gradeGroup[a]);
//            two[a].setToggleGroup(gradeGroup[a]);
//            thr[a].setToggleGroup(gradeGroup[a]);
//            fou[a].setToggleGroup(gradeGroup[a]);
//            fiv[a].setToggleGroup(gradeGroup[a]);
//            six[a].setToggleGroup(gradeGroup[a]);
//        }
//        VBox vbox = new VBox();
//        Menu[] grade = new Menu[n];
//        Menu[] credit = new Menu[n];
//        MenuBar[] bar = new MenuBar[n];
//        HBox[] box = new HBox[n];
//        int i = 0;
//        for (Menu x: grade) {
//            x = new Menu("Select Grade");
//            x.getItems().addAll(A[i],B[i],C[i],D[i],E[i],F[i]);
//            i++;
//        }
//        i = 0;
//        for (Menu x: credit) {
//            x = new Menu("Select Course Credit");
//            x.getItems().addAll(one[i],two[i],thr[i],fou[i],fiv[i],six[i]);
//            i++;
//        }
//        for(int j = 0; j < n; j++){
//            bar[j].getMenus().addAll(credit[j],grade[j]);
//            HBox.setHgrow(bar[j], Priority.ALWAYS);
//            box[j].getChildren().add(bar[j]);
//            vbox.getChildren().add(box[j]);
//        }
//        return vbox;
//    }
//    public void action();
//}

