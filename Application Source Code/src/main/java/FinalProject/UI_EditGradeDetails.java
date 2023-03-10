package FinalProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author brend
 */
public class UI_EditGradeDetails extends javax.swing.JFrame {

    /**
     * Creates new form Grades
     */
    public UI_EditGradeDetails() {
        initComponents();
        UpdateSelectionBoxStudentItems();
        UpdateChosenGradeFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Add_Grades_Label = new javax.swing.JLabel();
        Assignment_Type_Label = new javax.swing.JLabel();
        Edited_Grade_Assignment_Type_Box = new javax.swing.JComboBox<>();
        Assignment_Name_Label = new javax.swing.JLabel();
        Edited_Grade_Assignment_Name_Box = new javax.swing.JComboBox<>();
        Submit_Button = new javax.swing.JButton();
        Home_Button = new javax.swing.JButton();
        Select_Assignment_Label = new javax.swing.JLabel();
        Edited_Grade_Points_Scored = new javax.swing.JTextField();
        Points_Scored_Label = new javax.swing.JLabel();
        Student_Selection_Box = new javax.swing.JComboBox<>();
        Select_Student_Label = new javax.swing.JLabel();
        Student_Name_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Add_Grades_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add_Grades_Label.setText("Edit Grade Info");

        Assignment_Type_Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Assignment_Type_Label.setText("Type:");

        Edited_Grade_Assignment_Type_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Test", "Homework" }));
        Edited_Grade_Assignment_Type_Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edited_Grade_Assignment_Type_BoxActionPerformed(evt);
            }
        });

        Assignment_Name_Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Assignment_Name_Label.setText("Name:");

        Submit_Button.setText("Submit");
        Submit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_ButtonActionPerformed(evt);
            }
        });

        Home_Button.setText("Home");
        Home_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_ButtonActionPerformed(evt);
            }
        });

        Select_Assignment_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Select_Assignment_Label.setText("Select Assignment:");

        Edited_Grade_Points_Scored.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Points_Scored_Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Points_Scored_Label.setText("Scored:");

        Select_Student_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Select_Student_Label.setText("Select Student:");

        Student_Name_Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Student_Name_Label.setText("Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Home_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Student_Name_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Select_Student_Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Student_Selection_Box, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Add_Grades_Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Select_Assignment_Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Assignment_Type_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Assignment_Name_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Points_Scored_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Submit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Edited_Grade_Assignment_Name_Box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Edited_Grade_Assignment_Type_Box, 0, 104, Short.MAX_VALUE)
                                .addComponent(Edited_Grade_Points_Scored, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)))))
                .addGap(0, 70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Add_Grades_Label)
                .addGap(18, 18, 18)
                .addComponent(Select_Student_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Student_Selection_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Student_Name_Label))
                .addGap(18, 18, 18)
                .addComponent(Select_Assignment_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edited_Grade_Assignment_Type_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Assignment_Type_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edited_Grade_Assignment_Name_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Assignment_Name_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edited_Grade_Points_Scored, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Points_Scored_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Submit_Button)
                .addGap(43, 43, 43)
                .addComponent(Home_Button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Edited_Grade_Assignment_Type_BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edited_Grade_Assignment_Type_BoxActionPerformed
        String selectedType = (String) Edited_Grade_Assignment_Type_Box.getSelectedItem();

        if (selectedType == "Test") {
            UpdateSelectionBoxTestItems();
        } else {
            UpdateSelectionBoxHomeworkItems();
        }

    }//GEN-LAST:event_Edited_Grade_Assignment_Type_BoxActionPerformed

    private void Submit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_ButtonActionPerformed
  
        //Grab New Information
        String selectedAssignmentType = (String) Edited_Grade_Assignment_Type_Box.getSelectedItem();
        String selectedAssignmentName = (String) Edited_Grade_Assignment_Name_Box.getSelectedItem();
        Integer selectedAssignmentPoints;
        String selectedStudent = (String) Student_Selection_Box.getSelectedItem();
        String studentClass;
        Grade chosenGrade = GetChosenGradeInfo();
        Grade selectedGradeObject = null;
        Assignment AssignmentSelected = null;
        Student StudentSelected = null;
        

        if (selectedAssignmentName == null || selectedStudent == null || Edited_Grade_Points_Scored.getText().isEmpty()) {
            HelpfulFunctions.showMessage("Empty field detected. Please fill out all necessary fields.");
        } else {

            ArrayList<Grade> gradeList = GetLatestGradeData();

            for (int i = 0; i < gradeList.size(); i++) {
                if (gradeList.get(i).getAssignmentName().equals(chosenGrade.getAssignmentName()) && gradeList.get(i).getStudentName().equals(chosenGrade.getStudentName()) && gradeList.get(i).getAssignmentType().equals(chosenGrade.getAssignmentType())) {
                    selectedGradeObject = gradeList.get(i);

                    //Recreate grade file without adding the removed grade
                    selectedGradeObject.CreateGradeFile();
                    gradeList.remove(i);
                }
            }

            //Add other grades in list to newly created file
            for (int i = 0; i < gradeList.size(); i++) {
                    selectedGradeObject = gradeList.get(i);
                    selectedGradeObject.AddGrade();
                }

            Double scoredPoints = Double.valueOf(Edited_Grade_Points_Scored.getText());
            
            if (selectedAssignmentType == "Test") {
                ArrayList<Assignment> CurrentTestList = GetLatestTestData();

                //Extract Chosen Assignment Details To Add To Grade
                for (int i = 0; i < CurrentTestList.size(); i++) {
                    if (CurrentTestList.get(i).getAssignmentName().equals(selectedAssignmentName)) {
                        AssignmentSelected = CurrentTestList.get(i);
                        break;
                    }
                }

                //Extract assignment points
                selectedAssignmentPoints = AssignmentSelected.getAssignmentPoints();

                if (scoredPoints > selectedAssignmentPoints || scoredPoints < 0) {
                    HelpfulFunctions.showMessage("Please enter a valid score for this assignment. (Value between 0 and " + selectedAssignmentPoints + ")");
                } else {

                    ArrayList<Student> CurrentStudentList = CreateLatestStudentList();

                    //Extract Chosen Student Details To Add To Grade
                    for (int i = 0; i < CurrentStudentList.size(); i++) {
                        if (CurrentStudentList.get(i).Name().equals(selectedStudent)) {
                            StudentSelected = CurrentStudentList.get(i);
                            break;
                        }
                    }

                    studentClass = StudentSelected.StudentClass();

                    //Add All Information To Create New Grade Item
                    Grade GradeSelected = new Grade(studentClass, selectedAssignmentType, selectedAssignmentName, selectedStudent, scoredPoints, selectedAssignmentPoints, calculateLetterGrade((scoredPoints / selectedAssignmentPoints) * 100));
                    //Write To Grades.csv
                    if (GradeSelected.AddGrade()) {
                        HelpfulFunctions.showMessage("The grade for " + chosenGrade.getAssignmentName() + " for student " + chosenGrade.getStudentName() + " has been edited.");
                        super.dispose();
                        new UI_Home().setVisible(true);

                    } else {
                        HelpfulFunctions.showMessage("An error has occured.");
                    }
                }

            } else {
                ArrayList<Assignment> CurrentHomeworkList = GetLatestHomeworkData();

                //Extract Chosen Assignment Details To Add To Grade
                for (int i = 0; i < CurrentHomeworkList.size(); i++) {
                    if (CurrentHomeworkList.get(i).getAssignmentName().equals(selectedAssignmentName)) {
                        AssignmentSelected = CurrentHomeworkList.get(i);
                        break;
                    }
                }

                //Extract assignment points
                selectedAssignmentPoints = AssignmentSelected.getAssignmentPoints();

                if (scoredPoints > selectedAssignmentPoints || scoredPoints < 0) {
                    HelpfulFunctions.showMessage("Please enter a valid score for this assignment. (Value between 0 and " + selectedAssignmentPoints + ")");
                } else {

                    ArrayList<Student> CurrentStudentList = CreateLatestStudentList();

                    //Extract Chosen Student Details To Add To Grade
                    for (int i = 0; i < CurrentStudentList.size(); i++) {
                        if (CurrentStudentList.get(i).Name().equals(selectedStudent)) {
                            StudentSelected = CurrentStudentList.get(i);
                            break;
                        }
                    }

                    studentClass = StudentSelected.StudentClass();

                    //Add All Information To Create New Grade Item
                    Grade GradeSelected = new Grade(studentClass, selectedAssignmentType, selectedAssignmentName, selectedStudent, scoredPoints, selectedAssignmentPoints, calculateLetterGrade((scoredPoints / selectedAssignmentPoints) * 100));

                    //Write To Grades.csv
                    if (GradeSelected.AddGrade()) {
                        HelpfulFunctions.showMessage("The grade for " + chosenGrade.getAssignmentName() + " for student " + chosenGrade.getStudentName() + " has been edited.");
                        super.dispose();
                        new UI_Home().setVisible(true);

                    } else {
                        HelpfulFunctions.showMessage("An error has occured.");
                    }
                }
            }
        }
    }//GEN-LAST:event_Submit_ButtonActionPerformed

    private void Home_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_ButtonActionPerformed
        super.dispose();
        new UI_Home().setVisible(true);
    }//GEN-LAST:event_Home_ButtonActionPerformed

    void UpdateChosenGradeFields() {
     File editedGradeDir = new File("C:\\FinalProject\\EditedGrade.csv");
        Grade editedGrade = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(editedGradeDir));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] result = line.split(",");
                editedGrade = new Grade(result[0], result[1], result[2], result[3], Double.parseDouble(result[4]), Integer.parseInt(result[5]), result[6]);
            }

            reader.close();
        } catch (IOException e) {

        }
        
        String StudentName = editedGrade.getStudentName();
        String AssignmentType = editedGrade.getAssignmentType();
        String AssignmentName = editedGrade.getAssignmentName();
        Double PointsScored = editedGrade.getScoredPoints();
        
        Student_Selection_Box.setSelectedItem(StudentName);
        Edited_Grade_Assignment_Type_Box.setSelectedItem(AssignmentType);
        Edited_Grade_Assignment_Name_Box.setSelectedItem(AssignmentName);
        Edited_Grade_Points_Scored.setText(PointsScored.toString());
    }
    
    Grade GetChosenGradeInfo() {
        File editedGradeDir = new File("C:\\FinalProject\\EditedGrade.csv");
        Grade editedGrade = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(editedGradeDir));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] result = line.split(",");
                editedGrade = new Grade(result[0], result[1], result[2], result[3], Double.parseDouble(result[4]), Integer.parseInt(result[5]), result[6]);
            }

            reader.close();
        } catch (IOException e) {

        }

        return editedGrade;

    }
    
    ArrayList GetLatestGradeData() {
        File GradeDir = new File("C:\\FinalProject\\Grades.csv"); //Path for test file
        ArrayList<Grade> GradeList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(GradeDir));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] result = line.split(",");
                GradeList.add(new Grade(result[0], result[1], result[2], result[3], Double.parseDouble(result[4]), Integer.parseInt(result[5]), result[6]));
            }

            reader.close();
        } catch (IOException e) {

        }
        return GradeList;

    }
    
    
    void UpdateSelectionBoxTestItems() {

        File TestDir = new File("C:\\FinalProject\\Tests.csv"); //Path for test file
        Edited_Grade_Assignment_Name_Box.removeAllItems();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(TestDir));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] result = line.split(",");
                Edited_Grade_Assignment_Name_Box.addItem(result[0]);
            }

            reader.close();
        } catch (IOException e) {

        }
    }

    void UpdateSelectionBoxHomeworkItems() {

        File HomeworkDir = new File("C:\\FinalProject\\Homework.csv"); //Path for homework file
        Edited_Grade_Assignment_Name_Box.removeAllItems();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(HomeworkDir));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] result = line.split(",");
                Edited_Grade_Assignment_Name_Box.addItem(result[0]);
            }

            reader.close();
        } catch (IOException e) {

        }
    }
    
    //Populate box with all students
    void UpdateSelectionBoxStudentItems() {

        File studentDir = new File("C:\\FinalProject\\Students.csv");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(studentDir));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] result = line.split(",");
                Student_Selection_Box.addItem(result[0]);
            }

            reader.close();
        } catch (IOException e) {

        }
    }
    
    ArrayList GetLatestTestData() {
        File TestDir = new File("C:\\FinalProject\\Tests.csv"); //Path for test file
        ArrayList<Assignment> TestList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(TestDir));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] result = line.split(",");
                //Only name [0] and points [1] are added to the CSV file - No need to write type to the test file
                TestList.add(new Assignment("Test", result[0], Integer.parseInt(result[1])));
            }

            reader.close();
        } catch (IOException e) {

        }
        return TestList;

    }

    ArrayList GetLatestHomeworkData() {

        File HomeworkDir = new File("C:\\FinalProject\\Homework.csv"); //Path for homework file
        ArrayList<Assignment> HomeworkList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(HomeworkDir));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] result = line.split(",");
                HomeworkList.add(new Assignment("Homework", result[0], Integer.parseInt(result[1])));
            }

            reader.close();
        } catch (IOException e) {

        }
        return HomeworkList;

    }
    
    ArrayList CreateLatestStudentList() {
        File studentDir = new File("C:\\FinalProject\\Students.csv");
        ArrayList<Student> studentList = new ArrayList<Student>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(studentDir));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] result = line.split(",");
                studentList.add(new Student(result[0], result[1]));
            }

            reader.close();
        } catch (IOException e) {

        }
        return studentList;
    }

    String calculateLetterGrade(double gradePercentage) {

        if (gradePercentage >= 90) {
            return "A";
        } else if (gradePercentage >= 80) {
            return "B";
        } else if (gradePercentage >= 70) {
            return "C";
        } else if (gradePercentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_Grades_Label;
    private javax.swing.JLabel Assignment_Name_Label;
    private javax.swing.JLabel Assignment_Type_Label;
    private javax.swing.JComboBox<String> Edited_Grade_Assignment_Name_Box;
    private javax.swing.JComboBox<String> Edited_Grade_Assignment_Type_Box;
    private javax.swing.JTextField Edited_Grade_Points_Scored;
    private javax.swing.JButton Home_Button;
    private javax.swing.JLabel Points_Scored_Label;
    private javax.swing.JLabel Select_Assignment_Label;
    private javax.swing.JLabel Select_Student_Label;
    private javax.swing.JLabel Student_Name_Label;
    private javax.swing.JComboBox<String> Student_Selection_Box;
    private javax.swing.JButton Submit_Button;
    // End of variables declaration//GEN-END:variables
}
