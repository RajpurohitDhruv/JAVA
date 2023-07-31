// package com.example.javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class prac10 extends Application {
    public void start(Stage stage){
        stage.setTitle("Event Registration form by GEC, Bhavnagar");
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(40,40,40,40));
        Label l1 = new Label("Full Name:");
        Label l2 = new Label("Middle name:");
        Label l3 = new Label("Last Name:");
        Label l4 = new Label("Want to Participate in:");
        Label l5 = new Label("Your current semester:");
        Label l6 = new Label("Select your college:");
        gridPane.add(l1,0,0);
        gridPane.add(l2,0,1);
        gridPane.add(l3,0,2);
        gridPane.add(l4,0,3);
        gridPane.add(l5,0,4);
        gridPane.add(l6,0,5);
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        textField1.getText();
        textField2.getText();
        textField3.getText();
        gridPane.add(textField1,1,0);
        gridPane.add(textField2,1,1);
        gridPane.add(textField3,1,2);
        CheckBox checkBox1 = new CheckBox("Technical Event");
        CheckBox checkBox2 = new CheckBox("Cultural Event");
        HBox hBox1 = new HBox();
        hBox1.getChildren().addAll(checkBox1,checkBox2);
//        gridPane.add(checkBox1,1,3);
//        gridPane.add(checkBox2,2,3);
        gridPane.add(hBox1,1,3);
        gridPane.setHgap(10);
        ToggleGroup toggleGroup = new ToggleGroup();
        RadioButton radioButton2 = new RadioButton("2nd");
        radioButton2.setToggleGroup(toggleGroup);
        RadioButton radioButton4 = new RadioButton("4th");
        radioButton4.setToggleGroup(toggleGroup);
        RadioButton radioButton6 = new RadioButton("6th");
        radioButton6.setToggleGroup(toggleGroup);
        RadioButton radioButton8 = new RadioButton("8th");
        radioButton8.setToggleGroup(toggleGroup);
        HBox hBox2 = new HBox();
        hBox2.getChildren().addAll(radioButton2, radioButton4, radioButton6, radioButton8);
        gridPane.add(hBox2,1,4);
//        gridPane.add(radioButton2,1,4);
//        gridPane.add(radioButton4,2,4);
//        gridPane.add(radioButton6,3,4);
//        gridPane.add(radioButton8,4,4);

        String[] colleges = {"GEC Bhavnagar","GEC Gandhinagar","GEC Rajkot","GEC Surat","LD Engineering"};
        ComboBox<String> comboBox = new ComboBox<>(FXCollections.observableArrayList(colleges));
        comboBox.setValue(colleges[0]);
        gridPane.add(comboBox,1,5);
        Button submit = new Button("Submit Details");
        gridPane.add(submit,3,6);
        gridPane.setVgap(10);
        System.out.println(textField1.getText());
        System.out.println(textField2.getText());
        System.out.println(textField3.getText());

        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.show();

        submit.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent mouseEvent) {
                System.out.println("Your details are as below : \n");
                System.out.print("Your Full Name : ");
                System.out.print(textField1.getText()+" ");
                System.out.print(textField2.getText()+" ");
                System.out.println(textField3.getText()+".\n");

                if(checkBox1.isSelected() && checkBox2.isSelected()){
                    System.out.println("You want to participate in "+checkBox1.getText()+" and "+checkBox2.getText()+".\n");
                }
                else if(checkBox1.isSelected()){
                    System.out.println("You want to participate in "+checkBox1.getText()+".\n");
                }
                else if(checkBox2.isSelected()){
                    System.out.println("You want to participate in "+checkBox2.getText()+".\n");
                }

                if(radioButton2.isSelected()){
                    System.out.println("Your are currently in "+radioButton2.getText()+" sem.\n");
                }
                if(radioButton4.isSelected()){
                    System.out.println("Your are currently in "+radioButton4.getText()+" sem.\n");
                }
                if(radioButton6.isSelected()){
                    System.out.println("Your are currently in "+radioButton6.getText()+ " sem.\n");
                }
                if(radioButton8.isSelected()){
                    System.out.println("Your are currently in "+radioButton8.getText()+" sem.\n");
                }
                System.out.println("Your college is "+comboBox.getValue()+".\n");

            }
        });
    }
    public static void main(String[] args){
        Application.launch();
    }
}
