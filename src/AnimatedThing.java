import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public abstract class AnimatedThing {

    private double x;
    private double y;
    private ImageView sprite;
    private int attitude;
    private int index;

    // Animation attributes
    private int currentIndex;
    private double frameDuration;
    private int maxIndex;
    private double windowSizeX, windowSizeY;
    private double offsetX, offsetY;

    public AnimatedThing(double x, double y, String fileName, int attitude, int index,
                         int maxIndex, double windowSizeX, double windowSizeY, double offsetX, double offsetY)
            throws FileNotFoundException {
        this.x = x;
        this.y = y;
        this.attitude = attitude;
        this.index = index;
        this.maxIndex = maxIndex;
        this.windowSizeX = windowSizeX;
        this.windowSizeY = windowSizeY;
        this.offsetX = offsetX;
        this.offsetY = offsetY;

        Image spriteSheet = new Image(new FileInputStream(fileName));
        this.sprite = new ImageView(spriteSheet);
        // Set initial position
        this.sprite.setX(x);
        this.sprite.setY(y);

        // Set initial viewport to the first frame
        this.sprite.setViewport(new Rectangle2D(offsetX * (index) + index * windowSizeX,(offsetY + windowSizeY) * attitude , windowSizeX, windowSizeY));    }

    public ImageView getSprite() {
        return sprite;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getAttitude() {
        return attitude;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getMaxIndex() {
        return maxIndex;
    }

    public double getOffsetX() {
        return offsetX;
    }

    public double getOffsetY() {
        return offsetY;
    }

    public double getWindowSizeX() {
        return windowSizeX;
    }

    public double getWindowSizeY() {
        return windowSizeY;
    }

    // Add the updateAnimation method to handle the animation logic
    /*public void updateAnimation() {
        // Update the viewport to display the next frame
        updateViewport();

        // Increment or reset the index for animation
        setIndex((getIndex() + 1) % (getMaxIndex() + 1));
    }
    // Add the updateViewport method to set the correct viewport based on the current index
    /*private void updateViewport() {
        double frameWidth = getWindowSizeX() / (getMaxIndex() + 1);
        double frameX = getOffsetX() * (getIndex() + 1) + getIndex() * frameWidth;
        double frameY = getOffsetY() + getWindowSizeY() * getAttitude();
        getSprite().setViewport(new Rectangle2D(frameX, frameY, frameWidth, getWindowSizeY()));
    }*/


}
