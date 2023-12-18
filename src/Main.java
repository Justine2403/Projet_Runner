import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
        public void start(Stage primaryStage) {

                GameScene.timer.start();

                primaryStage.setTitle("Runner");
                Group root = new Group();
                Pane pane = new Pane(root);
                Scene scene = new Scene(pane, 800, 400);
                primaryStage.setScene(scene);
                primaryStage.show();

                // Affichage des éléments
                root.getChildren().add(GameScene.leftBackground.imageview);
                root.getChildren().add(GameScene.rightBackground.imageview);
                root.getChildren().add(GameScene.life_bar.imageview);
                root.getChildren().add(GameScene.heroRun.sprite);

                scene.setOnKeyPressed(event -> {
                        if (event.getCode() == KeyCode.SPACE) {
                                if (GameScene.heroRun.getAttitude() == 1) {
                                        GameScene.heroRun.setAttitude(2);
                                }
                        }
                });
        }
                public static void main(String[] args) {
                launch(args);
        }
}
     