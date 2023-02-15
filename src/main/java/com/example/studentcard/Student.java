package com.example.studentcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Student {

    private String firstName;
    private String lastName;
    private int studentNumber;
    private List<String> activities;

    public Student (String firstName, String lastName, int studentNumber, List<String> activities)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);
        setActivities(activities);
    }

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

    public void setFirstName(String firstName){
        firstName = firstName.toUpperCase();

        if (firstName.length() < 2) {
            throw new IllegalArgumentException("Names must be at least 2 letters long");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        lastName = lastName.toUpperCase();

        if (lastName.length() < 2) {
            throw new IllegalArgumentException("Names must be at least 2 letters long");
        }
        this.lastName = lastName;
    }

    public void setStudentNumber(int studentNumber){
        if (studentNumber < 10000000 || studentNumber > 999999999) {
            throw new IllegalArgumentException("Not valid number");
        }
        this.studentNumber = studentNumber;
    }

    public void setActivities(List<String>activities) {
        this.activities = activities;
    }




}


