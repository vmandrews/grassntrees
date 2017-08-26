import java.awt.*;
import java.util.Random;

public class GrassCell extends Cell {
	
    public GrassCell(int x, int y) {
        super(x, y);
    }

    public void paint(Graphics g, Boolean highlighted) {
        if (highlighted) {
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(x, y, 35, 35);
        } else {
            g.setColor(new Color(102,153,0));
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
