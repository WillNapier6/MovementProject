import java.awt.*;

/**
 * Created by Sawyer Cole on 11/5/2017.
 */
public abstract class Piece {
    int team;
    Square square;

    public abstract boolean canMove(Square square);
    public abstract void draw(Graphics g);
    public Piece(int x, int y) {
        square = GameBoard.squares[y][x];
        square.piece = this;
    }
    public Piece() {

    }

}
