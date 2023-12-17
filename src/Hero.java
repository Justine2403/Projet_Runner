import java.io.FileNotFoundException;
import javafx.geometry.Rectangle2D;

public class Hero extends AnimatedThing {

    // Constructor

    public Hero(double x, double y, String fileName, int attitude, int index, int maxIndex, double windowSizeX, double windowSizeY, double offsetX, double offsetY) throws FileNotFoundException {
        super(x, y, fileName, attitude, index, maxIndex, windowSizeX, windowSizeY, offsetX, offsetY);
    }



    public void update(long time) {

    }
}
