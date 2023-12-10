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

                /*Image spriteSheet = new Image(new FileInputStream("heros.png"));
                //Image spriteBg = new Image(new FileInputStream("desert.png"));
                ImageView sprite = new ImageView(spriteSheet);
                sprite.setViewport(new Rectangle2D(20,0,65,100));
                sprite.setX(200);
                sprite.setY(300);*/

                primaryStage.setTitle("Runner");
                Group root = new Group();
                Pane pane = new Pane(root);
                Scene theScene = new Scene(pane, 800, 400,true );

                root.getChildren().add(GameScene.rightBackground.imageview);
                root.getChildren().add(GameScene.leftBackground.imageview);
                //root.getChildren().add(GameScene.hero.imageview);
                //Camera camera = new PerspectiveCamera(true);
                //theScene.setCamera(camera);
                primaryStage.setScene(theScene);
                GameScene.render();
                primaryStage.show();
                }

        public static void main(String[] args) {
        launch(args);
        }
}