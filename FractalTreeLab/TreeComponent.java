import java.awt.*;
import javax.swing.JPanel;

public class TreeComponent extends JPanel
{
    private final int PANEL_WIDTH = 400;
    private final int PANEL_HEIGHT = 600;
    private double starting_angle;
    private int current_order;
    
    public TreeComponent()
    {
        this.current_order = 1;
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }
}