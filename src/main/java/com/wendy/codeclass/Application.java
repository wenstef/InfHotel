package com.wendy.codeclass;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("hello-view.fxml"));
        FlowPane root = new FlowPane();

        FlowPane sidebar = new FlowPane();
        sidebar.setPrefSize(100, 600);
        sidebar.setStyle("-fx-background-color: #28bdb1");

        double sidebarWidth = sidebar.getPrefWidth();
        Label label = new Label ("InfHotel");
        label.setPrefSize (sidebarWidth, 50);
        label.setStyle("-fx-background-color: #ffffff");
        label.setAlignment(Pos.CENTER);


        sidebar.getChildren().add(label);
        root.getChildren().add(sidebar);




        Scene scene = new Scene(root, 1024, 600);
        stage.setTitle("InfHotel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}