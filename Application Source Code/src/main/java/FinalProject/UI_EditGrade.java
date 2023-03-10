package FinalProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author brend
 */
public class UI_EditGrade extends javax.swing.JFrame {

    /**
     * Creates new form Grades
     */
    public UI_EditGrade() {
        initComponents();
        UpdateSelectionBoxStudentItems();
        UpdateSelectionBoxGradedTestItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Edit_Grades_Label = new javax.swing.JLabel();
        Select_Student_Label = new javax.swing.JLabel();
        Student_Selection_Box = new javax.swing.JComboBox<>();
        Student_Name_Label = new javax.swing.JLabel();
        Select_Assignment_Label = new javax.swing.JLabel();
        Graded_Assignment_Type_Box = new javax.swing.JComboBox<>();
        Assignment_Type_Label = new javax.swing.JLabel();
        Assignment_Name_Label = new javax.swing.JLabel();
        Graded_Assignment_Name_Box = new javax.swing.JComboBox<>();
        Home_Button = new javax.swing.JButton();
        Edit_Button = new javax.swing.JButton();
        Delete_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Edit_Grades_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Edit_Grades_Label.setText("Edit Grades");

        Select_Student_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Select_Student_Label.setText("Select Student:");

        Student_Selection_Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_Selection_BoxActionPerformed(evt);
            }
        });

        Student_Name_Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Student_Name_Label.setText("Name:");

        Select_Assignment_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Select_Assignment_Label.setText("Select Graded Assignment:");

        Graded_Assignment_Type_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Test", "Homework" }));
        Graded_Assignment_Type_Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Graded_Assignment_Type_BoxActionPerformed(evt);
            }
        });

        Assignment_Type_Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Assignment_Type_Label.setText("Type:");

        Assignment_Name_Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Assignment_Name_Label.setText("Name:");

        Home_Button.setText("Home");
        Home_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_ButtonActionPerformed(evt);
            }
        });

        Edit_Button.setText("Edit");
        Edit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_ButtonActionPerformed(evt);
            }
        });

        Delete_Button.setText("Delete");
        Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Edit_Grades_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Select_Student_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Assignment_Type_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Assignment_Name_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Graded_Assignment_Name_Box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Graded_Assignment_Type_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Home_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Student_Name_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Student_Selection_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Select_Assignment_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Edit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Edit_Grades_Label)
                .addGap(18, 18, 18)
                .addComponent(Select_Student_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Student_Selection_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Student_Name_Label))
                .addGap(18, 18, 18)
                .addComponent(Select_Assignment_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Graded_Assignment_Type_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Assignment_Type_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Graded_Assignment_Name_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Assignment_Name_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit_Button)
                    .addComponent(Delete_Button))
                .addGap(71, 71, 71)
                .addComponent(Home_Button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Graded_Assignment_Type_BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Graded_Assignment_Type_BoxActionPerformed
        String selectedType = (String) Graded_Assignment_Type_Box.getSelectedItem();

        if (selectedType == "Test") {
            UpdateSelectionBoxGradedTestItems();
        } else {
            UpdateSelectionBoxGradedHomeworkItems();
        }
    }//GEN-LAST:event_Graded_Assignment_Type_BoxActionPerformed

    private void Home_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_ButtonActionPerformed
        super.dispose();
        new UI_Home().setVisible(true);
    }//GEN-LAST:event_Home_ButtonActionPerformed

    private void Edit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_ButtonActionPerformed

        String selectedType = (String) Graded_Assignment_Type_Box.getSelectedItem();
        String selectedAssignment = (String) Graded_Assignment_Name_Box.getSelectedItem();
        String selectedStudent = (String) Student_Selection_Box.getSelectedItem();
        Grade selectedGradeObject = null;

        if (selectedAssignment == null) {
            HelpfulFunctions.showMessage("Please select a grade to edit.");
        } else {
        
            File gradeDir = new File("C:\\FinalProject\\Grades.csv");
            ArrayList<Grade> gradeList = new ArrayList<>();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(gradeDir));
                String line = "";
                boolean found = false;
                while (found == false) {
                    line = reader.readLine();
                    String[] result = line.split(",");
                    if (result[2].equals(selectedAssignment) && result[3].equals(selectedStudent) && result[1].equals(selectedType)) {
                        gradeList.add(new Grade(result[0], result[1], result[2], result[3], Double.parseDouble(result[4]), Integer.parseInt(result[5]), result[6]));
                        found = true;
                    }
                }

                reader.close();
            } catch (IOException e) {

            }

            selectedGradeObject = gradeList.get(0);

            //Write Selected Assignment To EditedAssignment.CSV To Be Referenced By Next Screen
            if (selectedGradeObject.AddEditedGrade()) {
                super.dispose();
                new UI_EditGradeDetails().setVisible(true);
            } else {
                HelpfulFunctions.showMessage("An error has occured.");
            }
        }
    }//GEN-LAST:event_Edit_ButtonActionPerformed

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonActionPerformed

        String selectedType = (String) Graded_Assignment_Type_Box.getSelectedItem();
        String selectedAssignment = (String) Graded_Assignment_Name_Box.getSelectedItem();
        String selectedStudent = (String) Student_Selection_Box.getSelectedItem();
        Grade selectedGradeObject = null;

        if (selectedAssignment == null) {
            HelpfulFunctions.showMessage("Please select a grade to delete.");
        } else {

                ArrayList<Grade> gradeList = GetLatestGradeData();

                for (int i = 0; i < gradeList.size(); i++) {
                    if (gradeList.get(i).getAssignmentName().equals(selectedAssignment) && gradeList.get(i).getStudentName().equals(selectedStudent) && gradeList.get(i).getAssignmentType().equals(selectedType)) {
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

                HelpfulFunctions.showMessage("The grade for " + selectedAssignment + " for student " + selectedStudent + " has been deleted.");
                super.dispose();
                new UI_Home().setVisible(true);

            }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_Delete_ButtonActionPerformed

    private void Student_Selection_BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_Selection_BoxActionPerformed
        String selectedType = (String) Graded_Assignment_Type_Box.getSelectedItem();
        
        if (selectedType == "Test") {
            UpdateSelectionBoxGradedTestItems();
        } else {
            UpdateSelectionBoxGradedHomeworkItems();
        }
        
    }//GEN-LAST:event_Student_Selection_BoxActionPerformed

    // Populate box with students
    void UpdateSelectionBoxStudentItems() {

        File gradedStudentDir = new File ("C:\\FinalProject\\Grades.csv");
        ArrayList<String> StudentNames = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(gradedStudentDir));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] result = line.split(",");
                StudentNames.add(result[3]);
            }
            
             //Remove duplicate names for multiple grades containing the same student name:
             StudentNames = (ArrayList<String>) StudentNames.stream().distinct().collect(Collectors.toList());

             //Add all unique students to selection box:
            for (int i = 0; i < StudentNames.size(); i++) {
             Student_Selection_Box.addItem(StudentNames.get(i));
            }


            reader.close();
        } catch (IOException e) {

        }
    }
    
    //Populate box with graded test items for selected student
    void UpdateSelectionBoxGradedTestItems() {

        File gradesDir = new File("C:\\FinalProject\\Grades.csv");
        Graded_Assignment_Name_Box.removeAllItems();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(gradesDir));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] result = line.split(",");
                //Only show the graded tests for the selected student:
                if ("Test".equals(result[1]) && Student_Selection_Box.getSelectedItem().toString().equals(result[3]))  {
                    Graded_Assignment_Name_Box.addItem(result[2]);
                }
            }

            reader.close();
        } catch (IOException e) {

        }
    }

    //Populate box with graded homework items for selected student
    void UpdateSelectionBoxGradedHomeworkItems() {

        File gradesDir = new File("C:\\FinalProject\\Grades.csv");
        Graded_Assignment_Name_Box.removeAllItems();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(gradesDir));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] result = line.split(",");
                //Only show the graded homework assignments for the selected student:
                if ("Homework".equals(result[1]) && Student_Selection_Box.getSelectedItem().toString().equals(result[3])) {
                    Graded_Assignment_Name_Box.addItem(result[2]);
                }

            }

            reader.close();
        } catch (IOException e) {

        }
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

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Assignment_Name_Label;
    private javax.swing.JLabel Assignment_Type_Label;
    private javax.swing.JButton Delete_Button;
    private javax.swing.JButton Edit_Button;
    private javax.swing.JLabel Edit_Grades_Label;
    private javax.swing.JComboBox<String> Graded_Assignment_Name_Box;
    private javax.swing.JComboBox<String> Graded_Assignment_Type_Box;
    private javax.swing.JButton Home_Button;
    private javax.swing.JLabel Select_Assignment_Label;
    private javax.swing.JLabel Select_Student_Label;
    private javax.swing.JLabel Student_Name_Label;
    private javax.swing.JComboBox<String> Student_Selection_Box;
    // End of variables declaration//GEN-END:variables
}
