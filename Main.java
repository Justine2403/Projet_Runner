import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Rectangle2D;
import java.io.FileInputStream;

public class Main extends Application {


        @Override
        public void start(Stage primaryStage) throws Exception{

                Image spriteSheet = new Image(new FileInputStream("C:\\Users\\xiang\\OneDrive\\Bureau\\ENSEA\\2A\\S7\\INFO\\Java\\Projet\\Ressources audio et image pour le runner-20231107\\img\\heros.png"));
                Image spriteBg = new Image(new FileInputStream("C:\\Users\\xiang\\OneDrive\\Bureau\\ENSEA\\2A\\S7\\INFO\\Java\\Projet\\Ressources audio et image pour le runner-20231107\\img\\desert.png"));
                ImageView bgRight = new ImageView(spriteBg);
                ImageView bgLeft = new ImageView(spriteBg);
                ImageView sprite = new ImageView(spriteSheet);
                sprite.setViewport(new Rectangle2D(20,0,65,100));
                sprite.setX(200);
                sprite.setY(300);

                Camera camera = new Camera(200, 300);
                ImageView background = new ImageView(); //constructor of background
                primaryStage.setTitle("Hello world");
                Group root = new Group(sprite);
                Pane pane = new Pane(root);
                Scene theScene = new Scene(pane, 600, 400,true );
                primaryStage.setScene(theScene);
                root.getChildren().add(GameScene.left.imageview);
                root.getChildren().add(GameScene.right.imageview);
                primaryStage.show();
                }



        public static void main(String[] args) {
        launch(args);
        }
}