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
public class BattleShipMP extends JFrame{
    
    JPanel panePlayer;
    JPanel paneOpponent;
    JLabel gameLB;
    JLabel player1LB;
    JLabel player2LB;
    JLabel commandLB;
    JButton startBT;
    JButton playerShipsBT[][];
    JButton opponentShipsBT[][];
    int cnt=0;
    
    public BattleShipMP(){
        super("Battle Ship");
        gameLB= new JLabel("Battle Ship");
        commandLB= new JLabel("Place your ships on board");
        startBT= new JButton("Start");
        player1LB= new JLabel("Your Ships");
        playerShipsBT= new JButton[10][10];
        for(int i=0; i<playerShipsBT.length; i++){
            for(int j=0; j<playerShipsBT[i].length; j++){
                playerShipsBT[i][j]= new JButton("");
            }
        }
        player2LB= new JLabel("Opponent's ships");
        opponentShipsBT= new JButton[10][10];
        for(int i=0; i<opponentShipsBT.length; i++){
            for(int j=0; j<opponentShipsBT[i].length; j++){
                opponentShipsBT[i][j]= new JButton("");
            }
        }
    }
    
    public class myListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
        }
    }
    public class myListener2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
        }
    }
    
}
