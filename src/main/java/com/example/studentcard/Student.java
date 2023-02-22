package com.example.studentcard;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Student {
    /**
     * These are instance variables that are private and stored
     */
    private String firstName;
    private String lastName;
    private int studentNumber;
    private List<String> activities;
    private Image image;

    /**
     * This is a constructor that's called when creating an instance of an object
     * @param firstName
     * @param lastName
     * @param studentNumber
     * @param activities
     * @param image
     */
    public Student (String firstName, String lastName, int studentNumber, List<String> activities, Image image)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);
        setActivities(activities);
        setImage(image);
    }

    /**
     * These are get methods that return the instance variables when called
     * @return
     */
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getStudentNumber()
    {
        return studentNumber;
    }
    public List<String> getActivities() {
        return activities;
    }
    public Image getImage()
    {
        return image;
    }

    /**
     * This is a set method that validates the first name so that
     * it is switched to capital letter first and throw an illegal exception
     * if it is not at least two letters long
     * @param firstName
     */
    public void setFirstName(String firstName){
        if (firstName.length() < 2) {
            throw new IllegalArgumentException("Names must be at least 2 letters long");
        }
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        this.firstName = firstName;
    }

    /**
     * This is a set method that validates the last name so that
     * it is switched to capital letter first and throw an illegal exception
     * if it is not at least two letters long
     * @param lastName
     */
    public void setLastName(String lastName){

        if (lastName.length() < 2) {
            throw new IllegalArgumentException("Names must be at least 2 letters long");
        }
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        this.lastName = lastName;
    }

    /**
     * This is a set method for the student number that validates a certain range
     * that it should be in, or it will throw an IAE
     * @param studentNumber
     */
    public void setStudentNumber(int studentNumber){
        if (studentNumber < 10000000 || studentNumber > 999999999) {
            throw new IllegalArgumentException("Not valid number");
        }
        this.studentNumber = studentNumber;
    }

    /**
     * This is a set method for activities that assigns it to the activities list
     * @param activities
     */
    public void setActivities(List<String>activities) {
        this.activities = activities;
    }

    /**
     * This is a set method for the image that assigns an image to the image variable
     * @param image
     */
    public void setImage(Image image){
        this.image = image;
    }





}
