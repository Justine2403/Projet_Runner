import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileNotFoundException;

public class Hero extends AnimatedThing{

    public Hero(double x, double y, int action, double width, double height, ImageView imageview, Image spriteSheet, String filename) throws FileNotFoundException {
        super(x, y, action, width, height, imageview, spriteSheet, filename);
    }

    public void update(long time) {
    }
}
