import java.awt.*;
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
   public static void main(String args[]){
       DrawingPanel panel = new DrawingPanel(750,750);
       Graphics g = panel.getGraphics();
       int width = 500;
       int height = 500;
       
       Background back = new Background(width,height,g);
       back.drawBackground(width,height,g);
       
       Color backG;
       backG = Color.black;
       panel.setBackground(backG);
       
       String talk = "";
       
       Dragon fom = new Dragon();
       
       
       fom.getTalk(talk, g);
       fom.drawDragon(g, talk);
       System.out.println(fom);
       
       do
       {
           System.out.println("How many dragons you want FOM?");
           
       }
       while(num <0);
       {    
       }
    }
}
