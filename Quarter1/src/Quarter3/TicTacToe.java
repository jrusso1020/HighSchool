/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter3;

/**
 *
 * @author jamesrusso
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame implements MouseListener{
    JPanel pane;
    JLabel ticLB;
    JLabel tacLB;
    JLabel toeLB;
    JButton resetBT;
    JLabel xoLB;
    JLabel winLB;
    JButton arrBT[][];
    
    public TicTacToe(){
        super("First JFrame");
        ticLB= new JLabel("TIC");
        tacLB= new JLabel("TAC");
        toeLB= new JLabel("TOE");
        arrBT= new JButton[3][3];
        for(int i=0; i<arrBT.length; i++){
            for(int j=0; j<arrBT[i].length; j++){
                arrBT[i][j].addMouseListener(this);
            }
        }
        
        resetBT= new JButton("Reset");
        xoLB= new JLabel();
        winLB= new JLabel();
        pane= new JPanel();
        pane.setLayout(new GridLayout(5,3));
        pane.add(ticLB);
        pane.add(tacLB);
        pane.add(toeLB);
        for(int i=0; i<arrBT.length; i++){
            for(int j=0; j<arrBT[i].length; j++){
                pane.add(arrBT[i][j]);
            }
        }
        pane.add(resetBT);
        pane.add(xoLB);
        pane.add(winLB);
        setContentPane(pane);
    }
    public void checkWin(){
        for(int i=0; i<arrBT.length; i++){
            if(arrBT[i][0].getText().equals(arrBT[i][1].getText()) && arrBT[i][0].getText().equals(arrBT[i][3].getText())){
                xoLB.setText(arrBT[i][0].getText());
                winLB.setText("Wins!");
                break;
            }
            else if(arrBT[0][i].getText().equals(arrBT[1][i].getText()) && arrBT[0][i].getText().equals(arrBT[3][i].getText())){
                xoLB.setText(arrBT[i][0].getText());
                winLB.setText("Wins!");
                break;
            }
        }
        if(arrBT[0][0].getText().equals(arrBT[1][1].getText()) && arrBT[0][0].getText().equals(arrBT[2][2].getText())){
            xoLB.setText(arrBT[0][0].getText());
                winLB.setText("Wins!");
        }
        if(arrBT[0][2].getText().equals(arrBT[1][1].getText()) && arrBT[2][0].getText().equals(arrBT[2][2].getText())){
            xoLB.setText(arrBT[0][0].getText());
                winLB.setText("Wins!");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getButton()==MouseEvent.BUTTON1){
            e.setSource("X");
        }
        else if(e.getButton()==MouseEvent.BUTTON3){
            e.setSource("O");
        }
        checkWin();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public class myListener2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            for(int i=0; i<arrBT.length; i++){
                for(int j=0; j<arrBT[i].length; j++){
                arrBT[i][j].setText("");
                }
            }
            xoLB.setText("");
            winLB.setText("");
        }
        
    }
    
    public static void main(String[] args){
        TicTacToe frame= new TicTacToe();
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
