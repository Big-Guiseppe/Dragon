import java.awt.*;
import java.util.Scanner;
 /* Write a description of class Dragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dragon
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int size;
    private String bodyType;
    private Color dragC;
    private boolean specialMove;
    private String talk;
    private Color backG;
    

    /**
     * Default Constructor for objects of class Dragon
     */
    public Dragon()
    {
        // initialise instance variables
        x = 300;
        y = 300;
        size = 1;
        dragC = Color.red;
        bodyType = "rect";
        specialMove = false;
        talk = "";
        backG = Color.black;
        
    }
    
    /**
     * Overloaded Constructors go here
     */
    public Dragon(int s, Color c, String bodyType, int x, int y, String talk, boolean specialMove)
    {
        size = s;
        dragC = c;
        this.bodyType = bodyType;
        this.x = x;
        this.y = y;
        this.talk = talk;
        this.specialMove = specialMove;
        this.backG = backG;
        
    }

    /** 
     * Accessor Methods
     */
    public void getTalk(String talk, Graphics g)
    { 
        Scanner scan = new Scanner(System.in);
        System.out.println("What will the dragon say? ");
        talk = scan.nextLine();
        
        g.setColor(dragC); // dragon color
        g.drawString(talk, x - 30, y - 10); // talk
        
    }
    /**
     * drawDragon(Graphics g)
     * Starting of drawing, complete your Dragon....
     */
    public void drawDragon(Graphics g, String talk)
    {
        g.setColor(dragC); // dragon color
        g.fillRect(x + 0 * size , y + 0 * size , size * 50, size * 50); // head
        g.fillOval(x + 25 * size, y + 25 * size, size * 40, size * 30); // neck
        g.fillOval(x + 30 * size, y + 25 * size, size * 150, size * 75); // body
        g.fillRect(x + 40 * size, y + 70 * size, size * 10, size * 75); // leg #1
        g.fillRect(x + 160 * size, y + 70 * size, size * 10, size * 75); // leg #2
        g.fillRect(x + 160 * size, y + 60 * size, size * 50, size * 10); // tail
        
        
    }
    
    /**
     * Mutator Methods
     */
    
    /**
     * toString
     */
    public String toString()
    {
        return "";
        
        
    }
}
