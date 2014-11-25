/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter3;

/**
 *
 * @author jamesrusso
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
 
/**
 *
 * @author TSPARR
 */
public class TicTacToeFrame extends JFrame
{
    private static final GridLayout LAYOUT = new GridLayout(3,3);
    private static final int HEIGHT = 500;
    private static final int WIDTH = 500;
 
    private JButton buttons[] = new JButton[10], quitBtn;
    private JPanel wholePanel, boardPanel, titlePanel;
    private JLabel title;
    private int turns = 0;
    private String letter = "";
    private boolean win = false;
 
 
    public TicTacToeFrame()
    {
       createQuitButton();
       createTitlePanel();
       createBoardPanel();
       createWholePanel();
       findHorzWins();
       findVertWins();
       findDiagWins();
       showResults();
 
        //Gets the width of the screen
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
 
        //Sets the screen size to half the height and width of the screen, and centers it
        setSize(WIDTH, HEIGHT);
        setLocation(screenWidth / 4, screenHeight / 4);
    }
 
    private void createQuitButton()
    {
        quitBtn = new JButton("-- Quit --");
        quitBtn.setFont(new Font(Font.SERIF, 0, 24));
 
        class QuitListener implements ActionListener
        {
 
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                System.exit(0);
            }
 
       }
 
        ActionListener quitListener = new QuitListener();
        quitBtn.addActionListener(quitListener);
    }
 
    private void createTitlePanel()
    {
        title = new JLabel("Welcome to my Tic Tac Toe Game!");
        titlePanel = new JPanel();
        title.setFont(new Font(Font.SERIF, 0, 30));
        titlePanel.add(title);
    }
 
    private void createBoardPanel()
    {
        boardPanel = new JPanel();
        boardPanel.setLayout(LAYOUT);
 
        class ButtonListener implements ActionListener
        {
 
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                turns++;
                if(turns % 2 == 0)
                {
                    letter = "O";
                }
                else {
                    letter = "X";
                }
 
                JButton pressedButton = (JButton)ae.getSource();
                pressedButton.setText(letter);
                pressedButton.setEnabled(false);
            }
 
        }
 
        ActionListener buttonListener = new ButtonListener();
        for(int i=1; i<=9; i++)
        {
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font(Font.SERIF, 0, 24));
            buttons[i].addActionListener(buttonListener);
            boardPanel.add(buttons[i]);
        }
    }
 
    private void createWholePanel()
    {
        wholePanel = new JPanel();
        wholePanel.setLayout(new BorderLayout());
        wholePanel.add(titlePanel, BorderLayout.NORTH);
        wholePanel.add(boardPanel, BorderLayout.CENTER);
        wholePanel.add(quitBtn, BorderLayout.SOUTH);
        add(wholePanel);
    }
 
    public void findHorzWins()
    {
        if (buttons[1].getText().equals(buttons[2].getText()) && buttons[2].getText().equals(buttons[3].getText()) && buttons[1].getText().equals("")==false)
        {
            win=true;
        }
 
        else if (buttons[4].getText().equals(buttons[5].getText()) && buttons[5].getText().equals(buttons[6].getText()) && buttons[4].getText().equals("")==false)
        {
            win=true;
        }
 
        else if (buttons[7].getText().equals(buttons[8].getText()) && buttons[8].getText().equals(buttons[9].getText()) && buttons[7].getText().equals("")==false)
        {
            win=true;
        }
    }
 
    public void findVertWins()
    {
        if (buttons[1].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[7].getText()) && buttons[1].getText().equals("")==false)
        {
            win=true;
 
        }
 
        else if (buttons[2].getText().equals(buttons[5].getText()) && buttons[5].getText().equals(buttons[8].getText()) && buttons[2].getText().equals("")==false)
        {
            win=true;
 
        }
 
        else if (buttons[3].getText().equals(buttons[6].getText()) && buttons[6].getText().equals(buttons[9].getText()) && buttons[3].getText().equals("")==false)
        {
            win=true;
 
        }
    }
 
    public void findDiagWins()
    {
        if (buttons[1].getText().equals(buttons[5].getText()) && buttons[5].getText().equals(buttons[9].getText()) && buttons[1].getText().equals("")==false)
        {
            win=true;
        }
 
        else if (buttons[3].getText().equals(buttons[5].getText()) && buttons[5].getText().equals(buttons[7].getText()) && buttons[3].getText().equals("")==false)
        {
            win=true;
        }
    }
 
    public void showResults()
    {
        while(turns>=5)
        {
            findHorzWins();
            findVertWins();
            findDiagWins();
 
            if (win==true)
            {
                JOptionPane.showMessageDialog(null, letter + " is the winner! Congratulations!");
                System.exit(0);
            }
 
            else if (turns==9 && win==false)
            {
                JOptionPane.showMessageDialog(null, "The game is a tie.");
                System.exit(0);
            }
        }
    }
    
     public static void main(String[] args) 
    {
        JFrame frame = new TicTacToeFrame();
        frame.setTitle("Tic Tac Toe Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
 
    }
}

