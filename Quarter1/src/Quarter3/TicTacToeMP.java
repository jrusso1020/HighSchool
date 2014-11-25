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

public class TicTacToeMP extends JFrame {

    JPanel pane;
    JLabel ticLB;
    JLabel tacLB;
    JLabel toeLB;
    JButton resetBT;
    JLabel xoLB;
    JLabel winLB;
    JButton arrBT[][];
    int cnt = 0;

    public TicTacToeMP() {
        super("Tic Tac Toe");
        ticLB = new JLabel("TIC");
        tacLB = new JLabel("TAC");
        toeLB = new JLabel("TOE");
        arrBT = new JButton[3][3];
        for (int i = 0; i < arrBT.length; i++) {
            for (int j = 0; j < arrBT[i].length; j++) {
                arrBT[i][j] = new JButton("");
                TicTacToeMP.myListener click = new TicTacToeMP.myListener();
                arrBT[i][j].addActionListener(click);
            }
        }
        resetBT = new JButton("New Game");
        TicTacToeMP.myListener2 reset = new TicTacToeMP.myListener2();
        resetBT.addActionListener(reset);
        xoLB = new JLabel();
        winLB = new JLabel();
        pane = new JPanel();
        pane.setLayout(new GridLayout(5, 3));
        pane.add(ticLB);
        pane.add(tacLB);
        pane.add(toeLB);
        for (int i = 0; i < arrBT.length; i++) {
            for (int j = 0; j < arrBT[i].length; j++) {
                pane.add(arrBT[i][j]);
            }
        }
        pane.add(resetBT);
        pane.add(xoLB);
        pane.add(winLB);
        setContentPane(pane);
    }

    public void checkWin() {
        for (int i = 0; i < arrBT.length; i++) {
            if (!arrBT[i][0].getText().equals("") && !arrBT[0][i].getText().equals("")) {
                if (arrBT[i][0].getText().equals(arrBT[i][1].getText()) && arrBT[i][0].getText().equals(arrBT[i][2].getText())) {
                    xoLB.setText(arrBT[i][0].getText());
                    winLB.setText("Wins!");
                    break;
                } else if (arrBT[0][i].getText().equals(arrBT[1][i].getText()) && arrBT[0][i].getText().equals(arrBT[2][i].getText())) {
                    xoLB.setText(arrBT[0][i].getText());
                    winLB.setText("Wins!");
                    break;
                }
            }
        }
        if (!arrBT[1][1].getText().equals("")) {
            if (arrBT[0][0].getText().equals(arrBT[1][1].getText()) && arrBT[0][0].getText().equals(arrBT[2][2].getText())) {
                xoLB.setText(arrBT[0][0].getText());
                winLB.setText("Wins!");
            }
            if (arrBT[0][2].getText().equals(arrBT[1][1].getText()) && arrBT[2][0].getText().equals(arrBT[0][2].getText())) {
                xoLB.setText(arrBT[0][2].getText());
                winLB.setText("Wins!");
            }
        }
    }

    public class myListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            if (button.getText().equals("")) {
                if (cnt % 2 == 0) {
                    button.setText("X");
                } else if (cnt % 2 != 0) {
                    button.setText("O");
                }
                cnt++;
                checkWin();
            }
        }
    }

    public class myListener2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < arrBT.length; i++) {
                for (int j = 0; j < arrBT[i].length; j++) {
                    arrBT[i][j].setText("");
                }
            }
            xoLB.setText("");
            winLB.setText("");
        }
    }

    public static void main(String[] args) {
        TicTacToeMP frame = new TicTacToeMP();
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
