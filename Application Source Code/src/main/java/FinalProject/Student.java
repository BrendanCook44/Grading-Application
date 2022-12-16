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
public class Student {
    
    private String Name;
    private String StudentClass;
    private String NewStudentFile = "C:\\FinalProject\\Students.csv";
    private String EditedStudentFile = "C:\\FinalProject\\EditedStudent.csv";
    
    Student(String Name, String ClassName) {
        this.Name = Name;
        this.StudentClass = ClassName;
    }
    
    public String Name() {
        return this.Name;
    }
    
    public String StudentClass() {
        return this.StudentClass;
    }
    
    //Creating a new file:
    public void CreateStudentFile() {
        try {
            File File = new File(NewStudentFile);
            File.delete();
            File.createNewFile();
        } catch(IOException Error) {
        }
    }
    
    //Adding a new student:
    public boolean AddStudent() {
        try {
            FileWriter writer = new FileWriter(NewStudentFile, true);
            writer.write(Name());
            
            //Separator
            writer.write(",");
            
            writer.write(StudentClass());
            
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
    public boolean AddEditedStudent() {
        try {
            FileWriter writer = new FileWriter(EditedStudentFile, false);
            writer.write(Name());
            
            //Separator
            writer.write(",");
            
            writer.write(StudentClass());
            
            writer.flush();
            writer.close();
            return true;
            
        } catch (IOException Error) {
            return false;
            
        }
    }
}
    
    
    
    

    
    

