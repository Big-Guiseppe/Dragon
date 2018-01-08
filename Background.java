import java.awt.*;
/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background
{
    // instance variables - replace the example below with your own
    private int height;
    private int width;
    private Color horizonColor;
    private Color groundColor;
    private Color sunColor;
    private Graphics g;
    /**
     * Constructor for objects of class Background
     */
    public Background(int width, int height, Graphics g)
    {
        // initialise instance variables
        this.height = height;
        this.width = width;
        horizonColor = Color.CYAN;
        groundColor = Color.GREEN;
        sunColor = Color.ORANGE;
        this.g = g;
    }
    public void drawBackground(int width, int height, Graphics g)
    {
        g.fillRect(width,height, width, height);
        
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y, int x)
    {
        // put your code here
        return x + y;
    }
}
