package com.example.studentcard;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class StudentCardController implements Initializable {

    @FXML
    private ImageView image;

    @FXML
    private ListView<String> list;

    @FXML
    private Label nameLabel;

    @FXML
    private Button nextButton;

    @FXML
    private Label studentNumberLabel;


    /**
     * This is creating an array list called students to be filled with
     * Student objects (Each made up of all our instance variables)
     */
    private Student[] students;

    /**
     * This creates an index of the array list
     */
    private int index;

    /**
     * This method is where the activities list is populated with items,
     * and the students array is populated with student instances
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List<String> activities1 = Arrays.asList("Golf", "Football", "Baseball");
        List<String> activities2 = Arrays.asList("Swimming", "Skiing", "Basketball");
        List<String> activities3 = Arrays.asList("Hiking", "Music", "School");
        students = new Student[]{
                new Student("joe", "smith", 200529232, activities1, new Image(Student.class.getResourceAsStream("images/joseph-gonzalez-iFgRcqHznqg-unsplash.jpg"))),
                new Student("mike", "wilson", 200528373, activities2, new Image(Student.class.getResourceAsStream("images/jurica-koletic-7YVZYZeITc8-unsplash.jpg"))),
                new Student("sam", "johnson", 200293992, activities3, new Image(Student.class.getResourceAsStream("images/podpros-GEnCnYhA1J4-unsplash.jpg")))
        };

        /**
         * This is to set the index of the array to 0
         */
        index = 0;

        /**
         * This is using a method to show a student card with info
         * and image
         */
        showStudent();
    }

    /**
     * This method uses the nextButton in the view to move through student
     * objects in the array (going back to the first image when
     * all objects have been clicked through)
     * @param event
     */
    @FXML
    void next(ActionEvent event) {
        if(index != 3) {
            showStudent();
            index = (index + 1);
        }
        else{
            index=0;
        }
    }

    /**
     * This showStudent method displays the student instances depending
     * on where we are in the index of the students array in the view
     */
    private void showStudent() {
        /**
         * The displayStudent finds what index we are at in the array
         */
        Student displayStudent = students [index];
        /**
         * This displays the image of the displayStudent in the imageView
         */
        image.setImage(displayStudent.getImage());
        /**
         * This displays the first name and last name of the displayStudent
         * with a space between them in the label of the view
         */
        nameLabel.setText(displayStudent.getFirstName() + " " + displayStudent.getLastName());
        /**
         * This displays the student number to its corresponding label in the view with
         * the String.valueOf converting it to a string with a value of the int studentNumber
         */
        studentNumberLabel.setText(String.valueOf(displayStudent.getStudentNumber()));
        /**
         * This getItems() method gets all the current items in the activities list and
         * replaces them with setAll() to the activities of the displayStudent
         */
        list.getItems().setAll(displayStudent.getActivities());
    }

}





