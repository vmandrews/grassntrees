import java.awt.*;
import java.util.Random;

public class RockCell extends Cell {
	
    public RockCell(int x, int y) {
        super(x, y);
    }

    public void paint(Graphics g, Boolean highlighted) {
        if (highlighted) {
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(x, y, 35, 35);
        } else {
            g.setColor(new Color(182,182,182));
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
