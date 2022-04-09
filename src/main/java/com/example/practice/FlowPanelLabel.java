package com.example.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPanelLabel extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("FlowLabel");

        Label label = new Label("Label 0 ");
        Label label1 = new Label("Label 1 ");
        Label label2 = new Label("Label 2 " );

        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().add(label);
        flowPane.getChildren().add(label1);
        flowPane.getChildren().add(label2);


        Scene scene = new Scene(flowPane, 200, 200);
        stage.setScene(scene);
        stage.show();
    }
}
