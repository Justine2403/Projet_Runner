import javafx.animation.AnimationTimer;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.FileNotFoundException;

public class GameScene extends Scene {
    static final String BACKGROUND = "..\\Runner_2\\img\\desert.png";
    static final String HERO = "..\\Runner_2\\img\\heros.png";
    //constructor
    public GameScene(Parent parent, double v, double v1, boolean b) throws FileNotFoundException {
        super(parent, v, v1, b);
        timer.start();
    }

    //int numberOfLives = 3;
    static Camera camera = new Camera(0, 0);
    public static StaticThing rightBackground;
    public static StaticThing leftBackground;
    static Hero hero;
    static {
        try {
            rightBackground = new StaticThing(800, 0, BACKGROUND);
            leftBackground = new StaticThing(0, 0, BACKGROUND);
            hero = new Hero(200, 300, HERO,0,  0, 6, 85, 100, 85, 0);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void update(long time) {
    }

    AnimationTimer timer = new AnimationTimer() {
        public void handle(long time) {
            hero.update(time);
            camera.update(time);
            GameScene.update(time);
        }


    };

    //render method
    public static void render() {
        double cameraX = camera.getX();
        double cameraY = camera.getY();
        double width = 800;

        leftBackground.getImageview().setX(-cameraX);
        rightBackground.getImageview().setX(width - cameraX);
        // Set the position of the Hero
        hero.getImageView().setX(hero.getX() - cameraX);
        hero.getImageView().setY(hero.getY());
    }

}


