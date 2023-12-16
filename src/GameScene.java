import javafx.animation.AnimationTimer;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.FileNotFoundException;

public class GameScene extends Scene {

    //constructor
    public GameScene(Parent parent, double v, double v1, boolean b) throws FileNotFoundException {
        super(parent, v, v1, b);
    }

    //int numberOfLives = 3;
    static Camera camera = new Camera(0, 0);
    public static StaticThing rightBackground;

    static {
        try {
            rightBackground = new StaticThing(800, 0, "..\\Runner_2\\img\\desert.png");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static StaticThing leftBackground;

    static {
        try {
            leftBackground = new StaticThing(0, 0, "..\\Runner_2\\img\\desert.png");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void update(long time) {
    }

    static Hero hero;

    /*static {
        try {
            hero = new Hero(200, 300, 0,"..\\Runner_2\\img\\heros.png");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }*/

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
        double width = 800;
        leftBackground.getImageview().setX(-cameraX);
        rightBackground.getImageview().setX(width - cameraX);

    }
    }


