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

public class GuiHandle3 extends JFrame{
    JPanel pane;
    JLabel nameLB;
    JTextField nameTF;
    JLabel addressLB;
    JTextField addressTF;
    JLabel productLB;
    JTextField productTF;
    JLabel qualityLB;
    JTextField qualityTF;
    JLabel typeCCLB;
    JTextField typeCCTF;
    JLabel CCnumberLB;
    JTextField CCnumberTF;
    JButton submitBT;
    JLabel blankLB;
    JButton resetBT;
    JLabel question1LB;
    JLabel answer1LB;
    JLabel question2LB;
    JLabel answer2LB;
    JLabel question3LB;
    JLabel answer3LB;
    JLabel question4LB;
    JLabel answer4LB;
    JLabel question5LB;
    JLabel answer5LB;
    JLabel question6LB;
    JLabel answer6LB;
    
    public GuiHandle3(){
        super("First JFrame");
        
        nameLB=new JLabel("Name: ");
        nameTF= new JTextField();
        addressLB= new JLabel("Address: ");
        addressTF= new JTextField();
        productLB= new JLabel("Product Name: ");
        productTF= new JTextField();
        qualityLB= new JLabel("Product Quality: ");
        qualityTF= new JTextField();
        typeCCLB= new JLabel("Type of Credit Card: ");
        typeCCTF= new JTextField();
        CCnumberLB= new JLabel("Credit Card Number: ");
        CCnumberTF= new JTextField();
        submitBT= new JButton("Submit");
        GuiHandle3.myListener submit= new GuiHandle3.myListener();
        submitBT.addActionListener(submit);
        blankLB= new JLabel("");
        resetBT= new JButton("Reset");
        GuiHandle3.myListener2 reset= new GuiHandle3.myListener2();
        resetBT.addActionListener(reset);
        question1LB= new JLabel("");
        question2LB= new JLabel("");
        question3LB= new JLabel("");
        question4LB= new JLabel("");
        question5LB= new JLabel("");
        question6LB= new JLabel("");
        answer1LB= new JLabel("");
        answer2LB= new JLabel("");
        answer3LB= new JLabel("");
        answer4LB= new JLabel("");
        answer5LB= new JLabel("");
        answer6LB= new JLabel("");
        pane= new JPanel();
        pane.setLayout(new GridLayout(9,3));
        pane.add(nameLB);
        pane.add(addressLB);
        pane.add(productLB);
        pane.add(nameTF);
        pane.add(addressTF);
        pane.add(productTF);
        pane.add(qualityLB);
        pane.add(typeCCLB);
        pane.add(CCnumberLB);
        pane.add(qualityTF);
        pane.add(typeCCTF);
        pane.add(CCnumberTF);
        pane.add(submitBT);
        pane.add(blankLB);
        pane.add(resetBT);
        pane.add(question1LB);
        pane.add(question2LB);
        pane.add(question3LB);
        pane.add(answer1LB);
        pane.add(answer2LB);
        pane.add(answer3LB);
        pane.add(question4LB);
        pane.add(question5LB);
        pane.add(question6LB);
        pane.add(answer4LB);
        pane.add(answer5LB);
        pane.add(answer6LB);
        setContentPane(pane);
    }
     public class myListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            question1LB.setText("Name: ");
            question2LB.setText("Address: ");
            question3LB.setText("Product: ");
            question4LB.setText("Product Quality: ");
            question5LB.setText("Type of Credit Card: ");
            question6LB.setText("Credit Card Number: ");
            answer1LB.setText(nameTF.getText());
            answer2LB.setText(addressTF.getText());
            answer3LB.setText(productTF.getText());
            answer4LB.setText(qualityTF.getText());
            answer5LB.setText(typeCCTF.getText());
            answer6LB.setText(CCnumberTF.getText());
            nameTF.setText("");
            addressTF.setText("");
            productTF.setText("");
            qualityTF.setText("");
            typeCCTF.setText("");
            CCnumberTF.setText("");          
        }
        
    }
    public class myListener2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            nameTF.setText("");
            addressTF.setText("");
            productTF.setText("");
            qualityTF.setText("");
            typeCCTF.setText("");
            CCnumberTF.setText("");
            question1LB.setText("");
            question2LB.setText("");
            question3LB.setText("");
            question4LB.setText("");
            question5LB.setText("");
            question6LB.setText("");
            answer1LB.setText("");
            answer2LB.setText("");
            answer3LB.setText("");
            answer4LB.setText("");
            answer5LB.setText("");
            answer6LB.setText("");
        }
        
    }
    
    public static void main(String[] args){
        GuiHandle3 frame= new GuiHandle3();
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
