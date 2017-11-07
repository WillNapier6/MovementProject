import java.awt.*;

/**
 * Created by Sawyer Cole on 11/3/2017.
 */
public class Square {
    public boolean isWhite;
    int x;
    int y;
    static int size;
    boolean isSelected = false;
    public Square(int size, int x, int y, boolean isWhite) {
        this.size = size;
        this.x = x;
        this.y = y;
        this.isWhite = isWhite;
    }
    public void draw(Graphics g) {
        if (isWhite) {
            g.setColor(Color.WHITE);
            g.fillRect((x - 1) * size, (y - 1) * size, size, size);
        }
        if(isSelected) {
            g.setColor(Color.GREEN);
            g.fillRect((x - 1) * size, (y - 1) * size, size, size);
        }
    }
}
