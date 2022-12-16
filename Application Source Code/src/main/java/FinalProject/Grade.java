/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author brend
 */
public class Grade {
    
    private String NewGradeFile = "C:\\FinalProject\\Grades.csv"; //Works Like A Sharable Array List
    private String EditedGradeFile = "C:\\FinalProject\\EditedGrade.csv";
    private String AssignmentType;
    private String AssignmentName;
    private Integer AssignmentPoints;
    private String StudentName;
    private String StudentClass;
    private Double ScoredPoints;
    private String GradeLetter;
    
    
    Grade(String StudentClass, String AssignmentType, String AssignmentName, String StudentName, Double ScoredPoints, int AssignmentPoints, String GradeLetter) {
        this.AssignmentType = AssignmentType;
        this.AssignmentName = AssignmentName;
        this.AssignmentPoints = AssignmentPoints;
        this.StudentName = StudentName;
        this.StudentClass = StudentClass;
        this.ScoredPoints = ScoredPoints;
        this.GradeLetter = GradeLetter;
    }

    public String getAssignmentType() {
        return this.AssignmentType;
    }

    public String getAssignmentName() {
        return this.AssignmentName;
    }

    public Integer getAssignmentPoints() {
        return this.AssignmentPoints;
    }

    public String getStudentName() {
        return this.StudentName;
    }

    public String getStudentClass() {
        return this.StudentClass;
    }

    public Double getScoredPoints() {
        return this.ScoredPoints;
    }

    public String getGradeLetter() {
        return this.GradeLetter;
    }

    //Creating a new grade file:
    public void CreateGradeFile() {
        try {
            File File = new File(NewGradeFile);
            File.delete();
            File.createNewFile();
        } catch (IOException Error) {
        }
    }

    //Adding a new grade:
    public boolean AddGrade() {
        try {
            FileWriter writer = new FileWriter(NewGradeFile, true);
            writer.write(StudentClass);

            //Separator
            writer.write(",");

            writer.write(AssignmentType);

            //Separator
            writer.write(",");

            writer.write(AssignmentName);

            //Separator
            writer.write(",");

            writer.write(StudentName);

            //Separator
            writer.write(",");

            writer.write(String.valueOf(ScoredPoints));

            //Separator
            writer.write(",");

            writer.write(String.valueOf(AssignmentPoints));

            //Separator
            writer.write(",");

            writer.write(GradeLetter);

            //New line space
            writer.write("\n");

            writer.flush();
            writer.close();
            return true;
            
        } catch (IOException Error) {
            return false;
  
        }
    }

    //Rewrites to the same line instead of appending and creating a new line.
    public boolean AddEditedGrade() {
        try {
            FileWriter writer = new FileWriter(EditedGradeFile, false);
            writer.write(StudentClass);

            //Separator
            writer.write(",");

            writer.write(AssignmentType);

            //Separator
            writer.write(",");

            writer.write(AssignmentName);

            //Separator
            writer.write(",");

            writer.write(StudentName);

            //Separator
            writer.write(",");

            writer.write(String.valueOf(ScoredPoints));

            //Separator
            writer.write(",");

            writer.write(String.valueOf(AssignmentPoints));

            //Separator
            writer.write(",");

            writer.write(GradeLetter);

            writer.flush();
            writer.close();
            return true;

        } catch (IOException Error) {
            return false;

        }
    }
    
}
