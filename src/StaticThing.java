import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class StaticThing {
    // Display static element like background and nbr life
    double sizeX;
    double sizeY;
    public ImageView imageview = new ImageView();

    public double getSizeX() {
        return sizeX;
    }

    public double getSizeY() {
        return sizeY;
    }

    public void setImageview(String fileName) throws FileNotFoundException {
        Image image = new Image(new FileInputStream(fileName));
        imageview.setImage(image);
    }

    // Constructor
    public StaticThing(double sizeX, double sizeY, String fileName) throws FileNotFoundException {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        setImageview(fileName);
    }
}
