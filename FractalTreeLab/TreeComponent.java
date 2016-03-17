import java.awt.*;
import javax.swing.JPanel;

public class TreeComponent extends JPanel
{
    private final int PANEL_WIDTH = 400;
    private final int PANEL_HEIGHT = 600;
    private double startingAngle;
    private double fractionLength;
    private double smallestBranch;
    private int currentOrder;
    
    public TreeComponent()
    {
        this.currentOrder = 1;
        this.fractionLength = 0.3;
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.smallestBranch = 0.9;
        this.startingAngle = 45;
    }
    
    public static void drawFractal(double length, int startX, int startY, double angle, Graphics2D g2)
    {
        double angle1, angle2, deltaX, deltaY;
        
        angle1 = angle + startingAngle;
        angle2 = angle - startingAngle;
        
        if (order == 1)
        {
            g2.draw(startX, startY, endX, endY);
        }
        else
        {
            int endX1, endY1, endX2, endY2;
            
            length = length * this.fractionLength;
            endX1 = (int)(startX - length*Math.sin(angle1));
            endY1 = (int)(startY - length*Math.cos(angle1));
            
            g2.draw(new Line2D.Double(startX, staryY, endX1, endY2));
            
            drawFractal(length, startX, startY, angle, g2);
        }
            
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
    }
   
}