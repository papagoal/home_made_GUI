/**QUESTION 2: Adding very simple event handling 
 * Assignment02
 * COMP 1020 SECTION A01
 * INSTRUCTOR    Amirhossein
 * ASSIGNMENT    Assignment03
 * @author       Danhang Liu, 7716234
 * @version      2015-07-03
 */ 
public class TestA3Q2 {
  
  public static void main(String[] args) {
    final double LEFT    = 0.3; 
    final double CENTRE  = 0.5;
    final double RIGHT   = 0.7;

    final double Y = 0.6;

    final double BUTTON_HEIGHT = 0.08;
    final double BUTTON_WIDTH = 0.04;    

    GUIgroup myButtons = new GUIgroup();
    Handler hr = new HandleRed();
    Handler hg = new HandleGreen();
    Handler hb = new HandleBlue();
    
    myButtons.addElement(new Button2(RIGHT,Y,BUTTON_HEIGHT,BUTTON_WIDTH,"Red",hr));
    myButtons.addElement(new Button2(CENTRE,Y,BUTTON_HEIGHT,BUTTON_WIDTH,"Green",hg));
    myButtons.addElement(new Button2(LEFT,Y,BUTTON_HEIGHT,BUTTON_WIDTH,"Blue",hb));
     
    myButtons.draw();
    while(true){
      if(StdDraw.mousePressed()){  //Check for a mouse click
        myButtons.handleClick(StdDraw.mouseX(),StdDraw.mouseY());
        Utilities.waitMouseUp();
       }
      else
        Utilities.delay(); //Nothing going on. Have a short nap. Zzzzzzzzzzzzzzzz
    }//infinite while loop
  }//main

  
  public static void drawRed(){
    StdDraw.setPenColor(StdDraw.RED);
    StdDraw.filledCircle(0.5,0.2,0.2);
    StdDraw.setPenColor(); //Reset the colour to the default - be nice
  }

  public static void drawGreen(){
    StdDraw.setPenColor(StdDraw.GREEN);
    StdDraw.filledCircle(0.5,0.2,0.2);
    StdDraw.setPenColor(); //Reset the colour to the default - be nice
  }

  public static void drawBlue(){
    StdDraw.setPenColor(StdDraw.BLUE);
    StdDraw.filledCircle(0.5,0.2,0.2);
    StdDraw.setPenColor(); //Reset the colour to the default - be nice
  }

}//TestA3Q2 class
