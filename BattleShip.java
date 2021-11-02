/**********************************************/
//SID:1818126                                   /
//TASK:ELEMENT 011: Coursework                  /
//DESCRIPTION: this is a game based application, the assignment is to create a battleship game where then ships are to avoid collision/
// DATE:14TH DECEMBER 2020                      /
/************************************************/
//import packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
//open class
public class BattleShip {
    //set variables
    public static Ship[] boat = new Ship[6];
    public static int[] populated = new int[100];
    public static int[] collision = new int[100];

    //create a constructor to set up a game
    public BattleShip() {
        System.out.println("setting up ship");
        ShipSetup();

    }

    //create class objects
    private void ShipSetup() {
        boat[0] = new Ship();
        boat[1] = new Ship();
        boat[2] = new Ship();
        boat[3] = new Ship();
        boat[4] = new Ship();
        boat[5] = new Ship();

        //set ship properties
        boat[0].setLength(3);
        boat[0].setStartPosition(11);
        boat[0].setHoriVerti(0);

        boat[1].setLength(2);
        boat[1].setStartPosition(17);
        boat[1].setHoriVerti(0);

        boat[2].setLength(4);
        boat[2].setStartPosition(43);
        boat[2].setHoriVerti(0);

        boat[3].setLength(2);
        boat[3].setStartPosition(48);
        boat[3].setHoriVerti(1);

        boat[4].setLength(2);
        boat[4].setStartPosition(76);
        boat[4].setHoriVerti(1);

        boat[5].setLength(3);
        boat[5].setStartPosition(62);
        boat[5].setHoriVerti(1);

        //declare the object variables
        for (int i = 0; i < 6; i++) {
            //declare the ship formation as horizontal or vertical
            if (boat[i].getHoriVerti() == 0) {
                for (int j = boat[i].startPosition; j < boat[i].startPosition + boat[i].length; j++) {
                    //set an array
                    populated[j] = 1;
                    System.out.println(Integer.toString(boat[i].length));
                }
            } else {
                for (int j = boat[i].startPosition; j < boat[i].startPosition + (boat[i].length * 10); j += 10) {
                    populated[j] = 1;
                }
            }


        }

    }//close method

    //open a method
    public static void main(String[] args) {
        BattleShip myGame = new BattleShip();
        int rows = 10;
        int cols = 10;

        // calls creator to create the grid
        Grid gt = new Grid(rows, cols);
        //set the standard features of the grid
        gt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gt.pack();
        gt.setVisible(true);
    }//close method
}//end class