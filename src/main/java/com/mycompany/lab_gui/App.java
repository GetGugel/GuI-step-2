package com.mycompany.lab_gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;





/**
 * JavaFX App
 */
public class App extends Application {
    Label label;
    Label label2;
    TextField tf;
    TextField tf2;

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

       label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
       label2 = new Label("=");
       label2.setLayoutX(400);label2.setLayoutY(300);
        
        
        Button btn1 = new Button("Click me");
        btn1.setLayoutX(50); btn1.setLayoutY(50);
        btn1.setOnAction(V->{//V or anything (the button)
        label.setText("I Clicked the btn"+((Button) V.getSource()).getText());
        label.setText("I Clicked the btn");
        
            
        });
        
        Button btn2 = new Button("Click me");
        btn2.setLayoutX(400); btn2.setLayoutY(250);
        btn2.setOnAction(this::processBttn2);
       
        tf = new TextField("");
        tf.setLayoutX(250); tf.setLayoutY(250);
        
        tf2 = new TextField("");
        tf2.setLayoutX(250); tf2.setLayoutY(300);
        
        
        Group gp = new Group(label,label2, btn1, btn2,tf,tf2);
        var scene = new Scene(gp, 640, 480);
        stage.setScene(scene);
        stage.setTitle("GUI Demo 2");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private void processBttn2(ActionEvent arg0) {
        String cntnt=tf.getText().trim();////.trim will clean the string
        String cntnt2=tf2.getText().trim();
        int nm = Integer.parseInt(cntnt);
        int nm2 = Integer.parseInt(cntnt2);
        label2.setText(""+(nm+nm2));
        label.setTextFill(Color.RED);
    }

}