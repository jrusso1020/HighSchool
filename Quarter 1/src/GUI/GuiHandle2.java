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

public class GuiHandle2 extends JFrame{
    JPanel pane;
    JLabel pwdLB;
    JLabel userLB;
    JTextField pwdTF;
    JTextField userTF;
    JButton submitBT;
    JButton resetBT;
    JLabel resultLB1;
    JLabel resultLB2;
    
    public GuiHandle2(){
        super("First JFrame");
        
        userLB= new JLabel("Username: ");
        userTF= new JTextField();
        pwdLB= new JLabel("Password: ");
        pwdTF= new JTextField();
        submitBT= new JButton("Submit");
        myListener submit= new myListener();
        submitBT.addActionListener(submit);
        resetBT= new JButton("Reset");
        myListener2 reset= new myListener2();
        resetBT.addActionListener(reset);
        resultLB1= new JLabel("");
        resultLB2= new JLabel("");
        pane= new JPanel();
        pane.setLayout(new GridLayout(4,2));
        pane.add(userLB);
        pane.add(userTF);
        pane.add(pwdLB);
        pane.add(pwdTF);
        pane.add(submitBT);
        pane.add(resetBT);
        pane.add(resultLB1);
        pane.add(resultLB2);
        setContentPane(pane);
                
    }
    
    public class myListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(userTF.getText().equals("jrusso1020") && pwdTF.getText().equals("zezima11")){
                resultLB1.setText("login");
                resultLB2.setText("successful");
            }
            else{
                resultLB1.setText("invalid");
                resultLB2.setText("password");
            }
        }
        
    }
    public class myListener2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
          userTF.setText("");
          pwdTF.setText("");
          resultLB1.setText("");
          resultLB2.setText("");
        }
        
    }
    
    public static void main(String[] args){
        GuiHandle2 frame= new GuiHandle2();
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
