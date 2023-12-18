import javafx.scene.image.ImageView;

public abstract class AnimatedThing {
    private double x;
    private double y;
    public ImageView sprite;
    private int attitude;
    private int index;      // index
    private int maxIndex;   // indice max
    private double windowSizeX;    // longueur de la fenêtre
    private double windowSizeY;    // hauteur de la fenêtre
    private static double offsetX, offsetY;  // offset entre chaque frame

    // Setter
    public void setImageview(String fileName) {
        this.sprite = new ImageView(fileName);
    }

    public void setIndex(int ind) {
        this.index = ind;
    }

    public void setAttitude(int att) {
        this.attitude = att;
    }

    // Constructeur
    public AnimatedThing(double x, double y, int attitude, int index, int maxIndex, double windowSizeX, double windowSizeY, String fileName) {
        this.x = x;
        this.y = y;
        this.attitude = attitude;
        this.index = index;
        this.maxIndex = maxIndex;
        this.windowSizeX = windowSizeX;
        this.windowSizeY = windowSizeY;
        setImageview(fileName);
    }

    // Getter
    public ImageView getSprite() {
        return sprite;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getIndex() {
        return index;
    }

    public int getAttitude() {
        return attitude;
    }

    //Update method for hero animations
    public void update(long time) {
        //Call the heroRun method from GameScene class
        GameScene.heroRun();
        if (this.index < this.maxIndex) {
            this.index = this.index + 85; //Go to next frame by incrementing
        } else {
            this.index = 0; //Go to first frame

        }
    }
}
