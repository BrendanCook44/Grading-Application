package FinalProject;

import java.io.*;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author brend
 */
public class Assignment {

    private String AssignmentType;
    private String AssignmentName;
    private int TotalPoints;
    private String TestFile = "C:\\FinalProject\\Tests.csv"; //Works Like A Sharable Array List
    private String HomeworkFile = "C:\\FinalProject\\Homework.csv"; //Works Like A Sharable Array List
    private String EditedAssignmentFile = "C:\\FinalProject\\EditedAssignment.csv";
            

    Assignment(String AssignmentType, String AssignmentName, int TotalPoints) {
        this.AssignmentType = AssignmentType;
        this.AssignmentName = AssignmentName;
        this.TotalPoints = TotalPoints;
    }

    public String getAssignmentType() {
        return this.AssignmentType;
    }

    public String getAssignmentName() {
        return this.AssignmentName;
    }

    public Integer getAssignmentPoints() {
        return this.TotalPoints;
    }

    //Creating a new test file:
    public void CreateTestFile() {
        try {
            File File = new File(TestFile);
            File.delete();
            File.createNewFile();
        } catch (IOException Error) {
        }
    }

    //Creating a new homework file:
    public void CreateHomeworkFile() {
        try {
            File File = new File(HomeworkFile);
            File.delete();
            File.createNewFile();
        } catch (IOException Error) {
        }
    }

    //Adding a new assignment:
    public boolean AddAssignment() {
        try {

            switch (getAssignmentType()) {

                case "Test" -> {
                    FileWriter TestWriter = new FileWriter(TestFile, true);
                    TestWriter.write(AssignmentName);
                    TestWriter.write(",");
                    TestWriter.write(String.valueOf(TotalPoints));

                    //New line space
                    TestWriter.write("\n");

                    TestWriter.flush();
                    TestWriter.close();
                    return true;
                }

                case "Homework" -> {
                    FileWriter HomeworkWriter = new FileWriter(HomeworkFile, true);
                    HomeworkWriter.write(AssignmentName);
                    HomeworkWriter.write(",");
                    HomeworkWriter.write(String.valueOf(TotalPoints));

                    //New line space
                    HomeworkWriter.write("\n");

                    HomeworkWriter.flush();
                    HomeworkWriter.close();
                    return true;
                }

                default -> {
                    return false;
                }

            }

        } catch (IOException Error) {
            return false;
        }

    }
    
    //Rewrites to the same line instead of appending and creating a new line
    public boolean AddEditedAssignment() {
        try {

            switch (getAssignmentType()) {

                case "Test" -> {
                    FileWriter TestWriter = new FileWriter(EditedAssignmentFile, false);
                    TestWriter.write(AssignmentType);
                    TestWriter.write(",");
                    TestWriter.write(AssignmentName);
                    TestWriter.write(",");
                    TestWriter.write(String.valueOf(TotalPoints));


                    TestWriter.flush();
                    TestWriter.close();
                    return true;
                }

                case "Homework" -> {
                    FileWriter HomeworkWriter = new FileWriter(EditedAssignmentFile, false);
                    HomeworkWriter.write(AssignmentType);
                    HomeworkWriter.write(",");
                    HomeworkWriter.write(AssignmentName);
                    HomeworkWriter.write(",");
                    HomeworkWriter.write(String.valueOf(TotalPoints));


                    HomeworkWriter.flush();
                    HomeworkWriter.close();
                    return true;
                }

                default -> {
                    return false;
                }

            }

        } catch (IOException Error) {
            return false;
        }

    }


}
