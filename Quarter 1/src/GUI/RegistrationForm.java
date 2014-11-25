/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author James.Russo
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame{
    JPanel pane;
    JLabel nameLB;
    JLabel courseLB;
    JLabel courseIDLB;
    JTextField nameTF;
    JTextField courseTF;
    JTextField courseIDTF;
    JButton submitBT;
    JButton resetBT;
    public RegistrationForm(){
        super("First JFrame");
        
        nameLB= new JLabel("Enter Name: ");
        courseLB= new JLabel("Enter Course Name: ");
        courseIDLB= new JLabel("Enter Course ID: ");
        nameTF= new JTextField();
        courseTF= new JTextField();
        courseIDTF= new JTextField();
        submitBT= new JButton("Submit");
        resetBT= new JButton("Reset");
        pane= new JPanel();
        pane.setLayout(new GridLayout(4,2));
        pane.add(nameLB);
        pane.add(nameTF);
        pane.add(courseLB);
        pane.add(courseTF);
        pane.add(courseIDLB);
        pane.add(courseIDTF);
        pane.add(submitBT);
        pane.add(resetBT);
        setContentPane(pane);
                
    }
    public static void main(String[] args){
        RegistrationForm frame= new RegistrationForm();
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
