import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by Sawyer Cole on 10/28/2017.
 */
public class GameBoard extends JPanel {
    int size;
    static Square[][] squares = new Square[8][8];
    boolean squaresMade;
    String mouseLocation = "";
    Square selectedSquare;
    Team[] teams = new Team[2];
    //Team black = new Team() {

    //}
    public GameBoard(int size) {
        this.size = size;
        createSquares();
        this.addMouseListener(new MouseHandler());
        teams[0] = new Team(1, Color.WHITE);
        repaint();
    }

    public void createSquares() {
        for(int y = 0; y < 8; y++) {
            for (int x = 1; x < 9; x++) {
                squares[y][x - 1] = new Square((int) (size/8.0), x, 8-y, (y % 2 == 0 && x % 2 == 0) || (y % 2 == 1 && x % 2 == 1));
            }
        }
        squaresMade = true;
    }

    public void drawMoves(Graphics g, Square selectedSquare) {
        for(int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
               if (selectedSquare.piece != null) {
                   if (selectedSquare.piece.canMove(GameBoard.squares[y][x])) {
                       squares[y][x].drawAsMovable(g);
                   }
               }
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        if (squaresMade) {
            for(int y = 0; y < 8; y++) {
                for (int x = 0; x < 8; x++) {
                    squares[y][x].draw(g);
                    drawMoves(g, squares[y][x]);
                }
            }
        }
        for (Piece piece : teams[0].pieces) {
            piece.draw(g);
        }
    }

    private class MouseHandler implements MouseListener, MouseMotionListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            for(int y = 0; y < 8; y++) {
                for (int x = 0; x < 8; x++) {
                    squares[y][x].isSelected = false;
                }
            }
            selectedSquare = squares[7 - (int)(e.getY()/(double) Square.size)][(int)(e.getX()/(double) Square.size)];
            selectedSquare.isSelected = true;

            repaint();
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }
}
