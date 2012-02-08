import java.awt.*;
/*
*Creating my initials and the current year
* 
* @author: Jesse Perkins
* @date: 28 Jan 2012
* @course: itec 2120
* @instructor knagel
* 
*/

public class jperkin26
{
  static void drawYear(Turtle yTurtle)
  {
    yTurtle.turnRight();
    yTurtle.forward(40);
    yTurtle.turnRight();
    yTurtle.forward(20);
    yTurtle.turnRight();
    yTurtle.forward(40);
    yTurtle.turnLeft();
    yTurtle.forward(20);
    yTurtle.turnLeft();
    yTurtle.forward(80);
    yTurtle.turnLeft();
    yTurtle.forward(40);
    yTurtle.turnLeft();
    yTurtle.forward(30);
    yTurtle.turnLeft();
    yTurtle.forward(40);
    yTurtle.turnLeft();
    yTurtle.forward(60);
    yTurtle.turnLeft();
    yTurtle.forward(40);
    yTurtle.turnLeft();
    yTurtle.forward(15);
    yTurtle.turnRight();
    yTurtle.turnRight();
    yTurtle.forward(15);
    yTurtle.turnRight();
    yTurtle.forward(40);
    yTurtle.turnLeft();
    yTurtle.forward(60);
    yTurtle.turnLeft();
    yTurtle.turnLeft();
    yTurtle.forward(40);
    yTurtle.turnRight();
    yTurtle.forward(20);
    yTurtle.turnRight();
    yTurtle.forward(40);
    yTurtle.turnLeft();
    yTurtle.forward(20);
    yTurtle.turnLeft();
    yTurtle.forward(40);
    yTurtle.setColor(java.awt.Color.WHITE);
    yTurtle.setShellColor(java.awt.Color.WHITE);
  }
  
  static void drawJ(Turtle jTurtle)
  {
    jTurtle.turnLeft();
    jTurtle.setPenColor(java.awt.Color.MAGENTA);
    jTurtle.forward(40);
    jTurtle.turnRight();
    jTurtle.forward(14);
    jTurtle.turnRight();
    jTurtle.turnRight();
    jTurtle.forward(14);
    jTurtle.turnLeft();
    jTurtle.forward(40);
    jTurtle.turnLeft();
    jTurtle.forward(80);
    jTurtle.turnLeft();
    jTurtle.forward(40);
    jTurtle.turnLeft();
    jTurtle.turnLeft();
    jTurtle.forward(80);
    jTurtle.setColor(java.awt.Color.WHITE);
    jTurtle.setShellColor(java.awt.Color.WHITE);
  }
  
  static void drawOneDot(Turtle oneDotTurtle)
  {
    oneDotTurtle.setColor(java.awt.Color.BLACK);
    oneDotTurtle.setShellColor(java.awt.Color.BLACK);
  }

  static void drawP(Turtle pTurtle)
  {
    pTurtle.setPenColor(java.awt.Color.BLUE);
    pTurtle.turnRight();
    pTurtle.forward(45);
    pTurtle.turnRight();
    pTurtle.forward(50);
    pTurtle.turnRight();
    pTurtle.forward(45);
    pTurtle.turnRight();
    pTurtle.forward(50);
    pTurtle.turn(180);
    pTurtle.forward(80);
    pTurtle.setColor(java.awt.Color.WHITE);
    pTurtle.setShellColor(java.awt.Color.WHITE);
  }
  
  static void drawTwoDot(Turtle twoDotTurtle)
  {
    twoDotTurtle.setColor(java.awt.Color.BLACK);
    twoDotTurtle.setShellColor(java.awt.Color.BLACK);
  }
  
  static void drawDesign(Turtle designTurtle)
  {
    designTurtle.setPenColor(java.awt.Color.BLACK);
    designTurtle.turn(180);
    designTurtle.turn(45);
    designTurtle.forward(200);
    designTurtle.turnLeft();
    designTurtle.forward(200);
    designTurtle.turnLeft();
    designTurtle.forward(200);
    designTurtle.turnLeft();
    designTurtle.forward(190);
    designTurtle.turnLeft();
    designTurtle.forward(190);
    designTurtle.turnLeft();
    designTurtle.forward(180);
    designTurtle.turnLeft();
    designTurtle.forward(180);
    designTurtle.turnLeft();
    designTurtle.forward(170);
    designTurtle.turnLeft();
    designTurtle.forward(170);
    designTurtle.turnLeft();
    designTurtle.forward(160);
    designTurtle.turnLeft();
    designTurtle.forward(160);
    designTurtle.turnLeft();
    designTurtle.forward(150);
    designTurtle.turnLeft();
    designTurtle.forward(150);
    designTurtle.turnLeft();
    designTurtle.forward(140);
    designTurtle.turnLeft();
    designTurtle.forward(140);
    designTurtle.turnLeft();
    designTurtle.forward(130);
    designTurtle.turnLeft();
    designTurtle.forward(130);
    designTurtle.turnLeft();
    designTurtle.forward(120);
    designTurtle.turnLeft();
    designTurtle.forward(120);
    designTurtle.turnLeft();
    designTurtle.forward(110);
    designTurtle.turnLeft();
    designTurtle.forward(110);
    designTurtle.turnLeft();
    designTurtle.forward(100);
    designTurtle.turnLeft();
    designTurtle.forward(100);
    designTurtle.turnLeft();
    designTurtle.forward(90);
    designTurtle.turnLeft();
    designTurtle.forward(90);
    designTurtle.turn(45);
    designTurtle.turn(180);
    designTurtle.forward(110);
    designTurtle.turn(135);
    designTurtle.forward(78);
    designTurtle.turnRight();
    designTurtle.forward(68);
    designTurtle.turn(135);
    designTurtle.forward(83);
    designTurtle.turn(135);
    designTurtle.forward(50);
    designTurtle.turnRight();
    designTurtle.forward(38);
    designTurtle.turn(135);
    designTurtle.forward(50);
    designTurtle.setColor(java.awt.Color.WHITE);
    designTurtle.setShellColor(java.awt.Color.WHITE);
  }
  
  public static void main(String[] args)
  {
    World newWorld;
    
    Turtle jTurtle;
    Turtle yTurtle;
    Turtle pTurtle;
    Turtle oneDotTurtle;
    Turtle twoDotTurtle;
    Turtle designTurtle;
    
    newWorld = new World();
    
    jTurtle = new Turtle(100,100,newWorld);
    oneDotTurtle = new Turtle(120,100,newWorld);
    twoDotTurtle = new Turtle(165,100,newWorld);
    yTurtle = new Turtle(400,400,newWorld);
    pTurtle = new Turtle(145,20,newWorld);
    designTurtle = new Turtle(180,180,newWorld);
    jTurtle.setPenWidth(5);
    pTurtle.setPenWidth(5);
    yTurtle.setPenWidth(4);
    designTurtle.setPenWidth(3);
    
    drawYear(yTurtle);
    drawOneDot(oneDotTurtle);
    drawJ(jTurtle);
    drawP(pTurtle);
    drawTwoDot(twoDotTurtle);
    drawDesign(designTurtle);
  }
}