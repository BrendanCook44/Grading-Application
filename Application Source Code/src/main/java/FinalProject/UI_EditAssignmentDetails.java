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
public class UI_EditAssignmentDetails extends javax.swing.JFrame {

    /**
     * Creates new form Grades
     */
    public UI_EditAssignmentDetails() {
        initComponents();
        UpdateChosenAssignmentFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Add_Assignment_Label = new javax.swing.JLabel();
        Home_Button = new javax.swing.JButton();
        Assignment_Type_Label = new javax.swing.JLabel();
        Assignment_Name_Label = new javax.swing.JLabel();
        Edited_Assignment_Name = new javax.swing.JTextField();
        Edited_Assignment_Points = new javax.swing.JTextField();
        Submit_Button = new javax.swing.JButton();
        Edited_Assignment_Type_Box = new javax.swing.JComboBox<>();
        Points_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Add_Assignment_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add_Assignment_Label.setText("Edit Assignment Info");

        Home_Button.setText("Home");
        Home_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_ButtonActionPerformed(evt);
            }
        });

        Assignment_Type_Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Assignment_Type_Label.setText("Type:");

        Assignment_Name_Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Assignment_Name_Label.setText("Name:");

        Edited_Assignment_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Edited_Assignment_Points.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Submit_Button.setText("Submit");
        Submit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_ButtonActionPerformed(evt);
            }
        });

        Edited_Assignment_Type_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Test", "Homework" }));

        Points_Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Points_Label.setText("Points:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Assignment_Type_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Points_Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Assignment_Name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Edited_Assignment_Type_Box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Edited_Assignment_Name)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Home_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Submit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Edited_Assignment_Points, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63))
            .addComponent(Add_Assignment_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Add_Assignment_Label)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Assignment_Type_Label)
                    .addComponent(Edited_Assignment_Type_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edited_Assignment_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Assignment_Name_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edited_Assignment_Points, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Points_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Submit_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(Home_Button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Home_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_ButtonActionPerformed
        super.dispose();
        new UI_Home().setVisible(true);
    }//GEN-LAST:event_Home_ButtonActionPerformed

    private void Submit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_ButtonActionPerformed

        //Grab New Information
        String editedAssignmentType = Edited_Assignment_Type_Box.getSelectedItem().toString();
        String editedAssignmentName = Edited_Assignment_Name.getText();
        Integer editedAssignmentPoints = Integer.parseInt(Edited_Assignment_Points.getText());

        if (editedAssignmentName.isEmpty() || Edited_Assignment_Points.getText().isEmpty()) {
            HelpfulFunctions.showMessage("Empty field detected. Please fill out all necessary fields.");
        } else if (!Edited_Assignment_Points.getText().matches("^[0-9]+$")) {
            HelpfulFunctions.showMessage("Only enter whole numbers in the points field.");
        } else {

            Assignment newAssignmentInfo = new Assignment(editedAssignmentType, editedAssignmentName, editedAssignmentPoints);
            Assignment chosenAssignment = GetChosenAssignmentInfo();
            Assignment currentAssignment = null;

            //Delete the chosen assignment
            if (chosenAssignment.getAssignmentType().equals("Test")) {

                ArrayList<Assignment> testList = GetLatestTestData();

                //find user selected assignment and remove from the test list
                for (int i = 0; i < testList.size(); i++) {
                    if (testList.get(i).getAssignmentName().equals(chosenAssignment.getAssignmentName())) {
                        currentAssignment = testList.get(i);

                        //Recreate test file and remove user selected assignment from list
                        currentAssignment.CreateTestFile();
                        testList.remove(i);
                    }
                }

                //Add other non-selected assignments in list to newly created file
                for (int i = 0; i < testList.size(); i++) {
                    currentAssignment = testList.get(i);
                    currentAssignment.AddAssignment();
                }

                //Add edited info to newly created file
                if (newAssignmentInfo.AddAssignment()) {
                    HelpfulFunctions.showMessage(chosenAssignment.getAssignmentName() + " has been edited.");
                    super.dispose();
                    new UI_Home().setVisible(true);
                }

            } else {

                ArrayList<Assignment> homeworkList = GetLatestHomeworkData();

                //find user selected assignment and remove from the test list
                for (int i = 0; i < homeworkList.size(); i++) {
                    if (homeworkList.get(i).getAssignmentName().equals(chosenAssignment.getAssignmentName())) {
                        currentAssignment = homeworkList.get(i);

                        //Recreate test file and remove user selected assignment from list
                        currentAssignment.CreateHomeworkFile();
                        homeworkList.remove(i);
                    }
                }

                //Add other non-selected assignments in list to newly created file
                for (int i = 0; i < homeworkList.size(); i++) {
                    currentAssignment = homeworkList.get(i);
                    currentAssignment.AddAssignment();
                }

                //Add edited info to newly created file
                if (newAssignmentInfo.AddAssignment()) {
                    HelpfulFunctions.showMessage(chosenAssignment.getAssignmentName() + " has been edited.");
                    super.dispose();
                    new UI_Home().setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_Submit_ButtonActionPerformed

    void UpdateChosenAssignmentFields() {
        File editedAssignmentDir = new File("C:\\FinalProject\\EditedAssignment.csv");
        Assignment editedAssignment = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(editedAssignmentDir));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] result = line.split(",");
                editedAssignment = new Assignment(result[0], result[1], Integer.parseInt(result[2]));
            }

            reader.close();
        } catch (IOException e) {

        }
        
        String AssignmentType = editedAssignment.getAssignmentType();
        String AssignmentName = editedAssignment.getAssignmentName();
        Integer AssignmentPoints = editedAssignment.getAssignmentPoints();
        
        Edited_Assignment_Type_Box.setSelectedItem(AssignmentType);
        Edited_Assignment_Name.setText(AssignmentName);
        Edited_Assignment_Points.setText(AssignmentPoints.toString());
        
    }
    
    Assignment GetChosenAssignmentInfo() {
        File editedAssignmentDir = new File("C:\\FinalProject\\EditedAssignment.csv");
        Assignment EditedAssignment = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(editedAssignmentDir));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] result = line.split(",");
                EditedAssignment = (new Assignment(result[0], result[1], Integer.parseInt(result[2])));
            }

            reader.close();
        } catch (IOException e) {

        }

        return EditedAssignment;

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
                //Only name [0] and points [1] are added to the CSV file - No need to write type to the homework file
                HomeworkList.add(new Assignment("Homework", result[0], Integer.parseInt(result[1])));
            }

            reader.close();
        } catch (IOException e) {

        }
        return HomeworkList;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_Assignment_Label;
    private javax.swing.JLabel Assignment_Name_Label;
    private javax.swing.JLabel Assignment_Type_Label;
    private javax.swing.JTextField Edited_Assignment_Name;
    private javax.swing.JTextField Edited_Assignment_Points;
    private javax.swing.JComboBox<String> Edited_Assignment_Type_Box;
    private javax.swing.JButton Home_Button;
    private javax.swing.JLabel Points_Label;
    private javax.swing.JButton Submit_Button;
    // End of variables declaration//GEN-END:variables
}
