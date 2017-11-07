import javax.swing.*;
import java.awt.*;

/**
 * Created by Sawyer Cole on 10/28/2017.
 */

public class MainFrame extends JFrame{
    public static void main(String[] args) {
        new MainFrame();

    }
    public MainFrame() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        int size = (int)(tk.getScreenSize().getHeight()/1.25);
        setSize(new Dimension(size, size + size/30));
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chess Board");
        GameBoard board = new GameBoard(size);
        add(board);
    }

}
