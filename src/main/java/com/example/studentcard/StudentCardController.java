package com.example.studentcard;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class StudentCardController implements Initializable {

    @FXML
    private ImageView image;

    @FXML
    private Label nameLabel;

    @FXML
    private Button nextButton;

    @FXML
    private Label studentNumberLabel;

    @FXML
    void next(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List<String> activities = Arrays.asList("Golf", "Football", "Baseball");
        Student student = new Student("Joe", "Smith", 200529232, activities);
        image.setImage(new Image(Student.class.getResourceAsStream("images/joseph-gonzalez-iFgRcqHznqg-unsplash.jpg")));
        nameLabel.setText(student.getFirstName() + " " + student.getLastName());
        studentNumberLabel.setText(String.valueOf(student.getStudentNumber()));
    }

}


