/**********************************************/
//SID:1818126                                   /
//TASK:ELEMENT 011                              /
//DESCRIPTION: this is the grid class that makes a 10/10 grid with a working button/
// DATE: 14TH DECEMBER 2020                     /
/************************************************/
/* import packages */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//create a class grid which extend to the package JFrame and implements action listener
    public class Grid extends JFrame implements ActionListener {
    //create a button grid into 100 buttons.
    public static JButton[] button = new JButton[100];

    //create the constructor of integers of the grid
    public Grid(int rows, int cols) {
        //set up the pain to hold the grid
        Container pane = getContentPane();
        //make it as a grid layout
        pane.setLayout(new GridLayout(rows, cols, 0, 0));

        //make a loop through all the buttons
        for (int i = 0; i < 100; i++) {
            //create a grid attributes
//          button[i] = new JButton(Integer.toString(BattleShip.populated[i]));
            button[i] = new JButton("");
            //set the button size so it is square size
            button[i].setPreferredSize(new Dimension(50, 50));
            button[i].addActionListener(this);
            //set the button number
            button[i].setActionCommand(Integer.toString(i));
            //add button to grid
            pane.add(button[i]);
        }
    }

    //create the action listener method
    public void actionPerformed(ActionEvent e) {
        //set the string and integers of buttons
        String cmd = e.getActionCommand();
        int x = Integer.parseInt(cmd);

        if (BattleShip.populated[x] == 1) {
            //set button properties that will show when a button it pressed
            Grid.button[x].setText("X");
            Grid.button[x].setBackground(Color.RED);
            Grid.button[x].setOpaque(true);
            Grid.button[x].setEnabled(false);
        } else {
            Grid.button[x].setText("X");
            Grid.button[x].setBackground(Color.BLUE);
            Grid.button[x].setOpaque(true);
            Grid.button[x].setEnabled(false);
        }


    }//close action listener method
}


//end class