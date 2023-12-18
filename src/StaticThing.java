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

    // Constructor
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

    //Background animation
    public void update(long time){
        // Check if the x-coordinate of the background
        if (this.sizeX <= -875){
            this.sizeX = 700;       //Reset and create a loop effect
        }
        else {
            this.sizeX = this.sizeX - 25;
        }
        GameScene.background();
    }
}