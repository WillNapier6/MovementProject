import java.awt.*;

public class King extends Piece {
    public boolean canMove(Square square) {
        return (Math.abs(square.x) - this.square.x <= 1 && Math.abs(square.y) - this.square.y <= 1);
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect((int) (square.size * (square.x-1)) + square.size/8, (int) (square.size * (square.y-1)) + square.size/8, square.size/8, square.size/2);
    }
}