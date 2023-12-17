import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.FileNotFoundException;
import java.time.Duration;

public class GameScene extends Scene {
    static final String BACKGROUND = "..\\Runner_2\\img\\desert.png";
    static final String HERO = "..\\Runner_2\\img\\heros.png";
    public static StaticThing rightBackground;
    public static StaticThing leftBackground;
    static Hero hero;
    //constructor
    public GameScene(Parent parent, double v, double v1, boolean b) throws FileNotFoundException {
        super(new Group(), v, v1, b);
        Group root = (Group) getRoot();
        this.rightBackground = new StaticThing(800, 0, BACKGROUND);
        this.leftBackground = new StaticThing(0, 0, BACKGROUND);
        this.hero = new Hero(200, 300, HERO,0,  0, 6, 85, 100, 85, 0);

        root.getChildren().add(parent);

    }

    //int numberOfLives = 3;
    static Camera camera = new Camera(0, 0);

    private static void update(long time) {
    }


    //render method
    public static void render() {
        double cameraX = camera.getX();
        double cameraY = camera.getY();
        double width = 800;

        leftBackground.getImageview().setX(-cameraX);
        rightBackground.getImageview().setX(width - cameraX);
        // Set the position of the Hero
        hero.getSprite().setX(hero.getX() - cameraX);
        hero.getSprite().setY(hero.getY());
    }

}


