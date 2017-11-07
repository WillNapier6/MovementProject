import java.awt.*;

public class Bishop extends Piece {
    public Bishop(int x, int y) {
        square = GameBoard.squares[y][x];
    }
    public boolean canMove(Square square) {
        return (square.x - this.square.x) == (square.y - this.square.y);
    }
    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect((int) (square.size * (square.x)) + square.size/8, (int) (square.size * (square.y)) + square.size/8, square.size/8, square.size/2);
    }
}