import javafx.animation.AnimationTimer;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class GameScene extends Scene {

    public static StaticThing leftBackground = new StaticThing(0,0,"file:img\\desert.png");   // instanciation de 2 staticThing pour afficher le background
    public static StaticThing rightBackground = new StaticThing(800,0,"file:img\\desert.png");   // instanciation de 2 staticThing pour afficher le background);
    public static StaticThing life_bar = new StaticThing(15,100,"file:img\\life_bar.png");
    public static Hero heroRun = new Hero(200,255,1,0,425,10,103,"file:img\\heros.png");

    // Animation du héro, timer
    static AnimationTimer timer = new AnimationTimer() {
        @Override
        public void handle(long time) {
            // Pause the thread to control the speed of the hero
            try {
                Thread.sleep(80);             // Permet de contrôler la vitesse du héro
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            heroRun.update(time);
        }
    };

    // Constructeur
    public GameScene(Parent parent, double v, double v1, boolean b) {
        super(parent, v, v1, b);
    }

    public static void heroRun() {
        // Set the viewport of the hero
        heroRun.sprite.setViewport(new Rectangle2D(heroRun.getIndex(), 0, 80, 100));
        // Set the X and Y coordinates of the hero on screen
        heroRun.sprite.setX(heroRun.getX());
        heroRun.sprite.setY(heroRun.getY());
    }
}