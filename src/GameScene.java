import javafx.animation.AnimationTimer;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.FileNotFoundException;

public class GameScene extends Scene {
    private static final double HERO_START_X = 200;
    private static final double HERO_START_Y = 300;
    //constructor
    public GameScene(Parent parent, double v, double v1, boolean b) throws FileNotFoundException {
        super(parent, v, v1, b);
        //createGameLoop();
    }

    //int numberOfLives = 3;
    static Camera camera = new Camera(0, 0);
    public static StaticThing rightBackground;
    public static StaticThing leftBackground;
    static Hero hero;

    static {
        try {
            rightBackground = new StaticThing(800, 0, "..\\Runner_2\\img\\desert.png");
            leftBackground = new StaticThing(0, 0, "..\\Runner_2\\img\\desert.png");
            //hero = new Hero(HERO_START_X, HERO_START_Y, 0, "file:.\\path\\to\\heros.png", 7, 100, 65, 20);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    /*private void createGameLoop() {
        AnimationTimer timer = new AnimationTimer() {
            public void handle(long time) {
                update(time);
                render();
            }
        };
        timer.start();
    }

    private static void update(long time) {
    }
    AnimationTimer timer = new AnimationTimer() {
        public void handle(long time) {
            hero.update(time);
            camera.update(time);
            GameScene.update(time);
        }


    };*/

    //render method
    public static void render() {
        double cameraX = camera.getX();
        double width = 800;
        leftBackground.getImageview().setX(-cameraX);
        rightBackground.getImageview().setX(width - cameraX);

    }
    }


