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

public class HelloJFrame extends JFrame{
    JPanel pane;
    JButton submitBT;
    JLabel nameLB;
    JTextField nameTF;
    
    public HelloJFrame(){
        super("First JFrame");
        
        submitBT= new JButton("SUBMIT");
        nameLB= new JLabel("Enter Your Name: ");
        nameTF= new JTextField();
        pane= new JPanel();
        pane.setLayout(new GridLayout(3,1));
        pane.add(nameLB);
        pane.add(nameTF);
        pane.add(submitBT);
        setContentPane(pane);
    }
    
    public static void main(String[] args){
        HelloJFrame frame= new HelloJFrame();
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
