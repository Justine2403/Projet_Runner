import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;

public abstract class AnimatedThing {
    private double x;
    private double y;
    public ImageView sprite;
    private int attitude;
    private int index;
    private int maxIndex;
    private double sizeX;
    private double sizeY;
    private static double offsetX, offsetY;

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
    public AnimatedThing(double x, double y, int attitude, int index, int maxIndex, double sizeX, double sizeY, String fileName) {
        this.x = x;
        this.y = y;
        this.attitude = attitude;
        this.index = index;
        this.maxIndex = maxIndex;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
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

    public void jumpUp() {
        this.setAttitude(2);
        this.setIndex(0); //frame index to jump up
        this.sprite.setViewport(new Rectangle2D(this.getIndex(), 160, 75, 100));
        this.sprite.setX(this.getX());
        this.sprite.setY(this.getY() - 20); //position of the jump
    }

    public void jumpDown() {
        this.setAttitude(3);
        this.setIndex(85); //frame index to jump down
        this.sprite.setViewport(new Rectangle2D(this.getIndex(), 160, 75, 100));
        this.sprite.setX(this.getX());
        this.sprite.setY(this.getY()); //initial position before jump
    }

    //Update method for hero animations
    public void update(long time) {
        // Attitude 1: hero is running
        if (this.attitude == 1) {
            GameScene.heroRun();
            if (this.index < this.maxIndex) {
                this.index = this.index + 85;
            } else {
                this.index = 0;
            }
        }

        // Attitude 2: hero is jumping up
        if (this.attitude == 2) {
            GameScene.heroRun.jumpUp();
            this.y = this.y - 10; //go up
            if (this.y <= 100) {
                this.setAttitude(3); //change attitude when reaching certain position
            }
        }

        // Attitude 3: hero is jumping down
        if (this.attitude == 3) {
            GameScene.heroRun.jumpDown();
            //255 is the value when it reachs the ground
            //air
            if (this.y <= 255) {
                this.y = this.y + 10; //go down
            }
            //ground
            if (this.y >= 255) {
                this.setAttitude(1); //set to running attitude if character on ground
            }
        }
    }
}