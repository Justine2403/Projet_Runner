import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public abstract class AnimatedThing {
    double x;
    double y;
    int action;

    public ImageView imageview = new ImageView();
    Image spriteSheet = new Image(new FileInputStream("..\\Runner_2\\img\\heros.png"));
    private String filename;

    public ImageView getImageview() {
        return imageview;
    }

    public void setImageview(String filename) {
        this.filename = filename ;
    }

    public AnimatedThing( double x, double y, int action, double width, double height, ImageView imageview, Image spriteSheet, String filename) throws FileNotFoundException {
        this.x = x;
        this.y = y;
        this.action = action;
        this.imageview = imageview;
        this.spriteSheet = spriteSheet;
        this.filename = filename;
        setImageview(filename);
    }


}
