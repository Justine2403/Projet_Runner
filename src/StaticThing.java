import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;


public class StaticThing {
    private double sizeX;
    private double sizeY;
    public ImageView imageview;

    // Setter
    public void setImageview(String fileName) {
        imageview = new ImageView(fileName);
    }

    // Constructeur
    public StaticThing(double sizeX, double sizeY, String fileName) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        setImageview(fileName);
    }

    // Getter
    public double getSizeX() {
        return sizeX;
    }

    public double getSizeY() {
        return sizeY;
    }
}