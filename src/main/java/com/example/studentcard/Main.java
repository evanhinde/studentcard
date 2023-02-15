package com.example.studentcard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        List<String> activities = Arrays.asList("Golf", "Football", "Baseball");
        Student student1 = new Student("Evan"," Hinde",200529232, activities);
        System.out.println("First Name: " + student1.getFirstName());
        System.out.println("Last Name: " + student1.getLastName());
        System.out.println("Student Number: " + student1.getStudentNumber());
        System.out.println("Activities: " + student1.getActivities());
    }
}