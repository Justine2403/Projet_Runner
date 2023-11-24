import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GameScene extends Scene{
    public GameScene(Parent parent, double v, double v1, boolean b) throws FileNotFoundException {
        super(parent, v, v1, b);
    }
    public static StaticThing right;

    static {
        try {
            right = new StaticThing(0,0,"..\\Runner_2\\img\\desert.png");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static StaticThing left;

    static {
        try {
            left = new StaticThing(800, 0, "..\\Runner_2\\img\\desert.png" );
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


