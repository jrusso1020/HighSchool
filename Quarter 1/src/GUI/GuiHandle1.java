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

public class GuiHandle1 extends JFrame{
    JPanel pane;
    JLabel nameLB;
    JLabel ageLB;
    JLabel addressLB;
    JTextField nameTF;
    JTextField ageTF;
    JTextField addressTF;
    JButton submitBT;
    JButton cancelBT;
    
    public GuiHandle1(){
        super("First JFrame");
        
        nameLB= new JLabel("Enter Name: ");
        ageLB= new JLabel("Enter Age: ");
        addressLB= new JLabel("Enter Address: ");
        nameTF= new JTextField();
        ageTF= new JTextField();
        addressTF= new JTextField();
        submitBT= new JButton("Submit");
        myListener submit= new myListener();
        submitBT.addActionListener(submit);
        cancelBT= new JButton("Cancel");
        myListener2 cancel= new myListener2();
        cancelBT.addActionListener(cancel);
        pane=new JPanel();
        pane.setLayout(new GridLayout(4,2));
        pane.add(nameLB);
        pane.add(nameTF);
        pane.add(ageLB);
        pane.add(ageTF);
        pane.add(addressLB);
        pane.add(addressTF);
        pane.add(submitBT);
        pane.add(cancelBT);
        setContentPane(pane);
    }
    
    public class myListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            pane=null;
            pane=new JPanel();
            pane.setLayout(new GridLayout(3,2));
            nameLB.setText("Name: ");
            ageLB.setText("Age: ");
            addressLB.setText("Address: ");
            JLabel name= new JLabel(nameTF.getText());
            JLabel age= new JLabel(ageTF.getText());
            JLabel address= new JLabel(addressTF.getText());
            pane.add(nameLB);
            pane.add(name);
            pane.add(ageLB);
            pane.add(age);
            pane.add(addressLB);
            pane.add(address);
            setContentPane(pane);
        }
        
    }
    public class myListener2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
          nameTF.setText("");
          ageTF.setText("");
          addressTF.setText("");
        }
        
    }
    
     public static void main(String[] args){
        GuiHandle1 frame= new GuiHandle1();
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
