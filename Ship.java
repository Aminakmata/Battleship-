/**********************************************/
//SID:1818126                                   /
//TASK:ELEMENT 011                              /
//DESCRIPTION: this class holds the ships properties by setting and getting the ships/
// DATE: 14TH DECEMBER 2020                     /
/************************************************/
//this is a ship class
public class Ship {
    // creating an object
    public int startPosition;
    public int length;
    public int horiVerti;

    //declaring a ship method
    public Ship() {
    }
    //set a getter method
    public int getStartPosition() {
        //return value
        return startPosition;
    }
    //creating setter method
    public void setStartPosition(int startPosition) {
        //initializing the object
        this.startPosition = startPosition;
    }
    //set a getter method
    public int getLength() {
        //return value
        return length;
    }
    //creating setter method
    public void setLength(int length) {
        //initializing the object
        this.length = length;
    }
    //set a getter method
    public int getHoriVerti() {
        //return value
        return horiVerti;
    }
    //set a getter method
    public void setHoriVerti(int horiVerti) {
        //initializing the object
        this.horiVerti = horiVerti;
    }//close method


}//end class
