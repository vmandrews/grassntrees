import java.awt.*;
import java.util.Random;

public class Cell extends Rectangle {
	
	//Color constants to use for surface colors
	private static Color DIRT = new Color(102,51,0);
	private static Color GRASS = new Color(102,153,0);
	private static Color TREE = new Color(0,102,0);
	private static Color ROCK = new Color(182,182,182);
	
	private Color surface;


    public Cell(int x, int y) {
        super(x, y, 35, 35);
        Random rand = new Random();
        // Randomly assign a surface color
        int surfaceNum = rand.nextInt(3);
        switch(surfaceNum) {
        	case 0: surface = DIRT; break;
        	case 1: surface = GRASS; break;
        	case 2: surface = TREE; break;
        	case 3: surface = ROCK; break;
        }
    }

    public void paint(Graphics g, Boolean highlighted) {
        if (highlighted) {
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(x, y, 35, 35);
        } else {
            //g.setColor(Color.DARK_GRAY);
        	g.setColor(surface);
            g.fillRect(x, y, 35, 35);
        }

        g.setColor(Color.BLACK);
        g.drawRect(x, y, 35, 35);
    }

    @Override
    public boolean contains(Point target){
        if (target == null)
            return false;
        return super.contains(target);
    }
}
