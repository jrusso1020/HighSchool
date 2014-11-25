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

public class HelloWorldGui extends JFrame{
    JPanel pane;
    JButton clickBT;
    JLabel helloLB;
    
    public HelloWorldGui(){
        super("First JFrame");
        
        clickBT= new JButton("Click me");
        helloLB= new JLabel("HELLO WORLD");
        pane= new JPanel();
        pane.setLayout(new GridLayout(2,1));
        pane.add(helloLB);
        pane.add(clickBT);
        setContentPane(pane);
    }
    
    public static void main(String[] args){
        HelloWorldGui frame= new HelloWorldGui();
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
