import java.awt.*;

/**
 * Created by Sawyer Cole on 11/6/2017.
 */
public class Rook extends Piece {
    public boolean canMove(Square square) {
            return (square.x == this.square.x) ^ (square.y == this.square.y);
        }

    @Override
    public void draw(Graphics g) {

    }
}
