import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Camera;
import javafx.scene.PerspectiveCamera;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Rectangle2D;
import java.io.FileInputStream;

public class Main extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception{

                primaryStage.setTitle("Runner");
                Group root = new Group();
                Pane pane = new Pane(root);
                GameScene gameScene = new GameScene(root, 800, 400,true );

                Hero hero = new Hero(60, 250,  "..\\Runner_2\\img\\heros.png",0, 0, 6, 85, 100, 85,0);


                root.getChildren().add(GameScene.rightBackground.imageview);
                root.getChildren().add(GameScene.leftBackground.imageview);

                root.getChildren().add(hero.getSprite());

                primaryStage.setScene(gameScene);
                GameScene.render();
                primaryStage.show();
                }

        public static void main(String[] args) {
        launch(args);
        }
}