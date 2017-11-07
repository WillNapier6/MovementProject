import java.awt.*;

/**
 * Created by Sawyer Cole on 11/5/2017.
 */
public class Team {
    Piece[] pieces = {new Bishop(3, 1)};
    int id;
    Color color;
    public Team(int id, Color color) {
        this.id = id;
        this.color = color;
    }
}
