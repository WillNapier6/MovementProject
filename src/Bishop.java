import java.awt.*;

public class Bishop extends Piece {
    public Bishop(int x, int y) {
        square = GameBoard.squares[y][x];
        square.piece = this;
    }
    public boolean canMove(Square square) {
        return Math.abs(square.x - this.square.x) == Math.abs(square.y - this.square.y);
    }
    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect((int) (square.size * (square.x - 1)) + square.size/8, (int) (square.size * (square.y - 1)) + square.size/8, square.size/8, square.size/2);
    }
}