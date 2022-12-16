/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProject;

/**
 *
 * @author brend
 */
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author brend
 */
public class HelpfulFunctions {

    static void showMessage(String message) {
        JFrame frame = new JFrame("Message");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(100,100));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        JOptionPane.showMessageDialog(frame, message);
    }
}
