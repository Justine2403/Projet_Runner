import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StaticThing {
    //Display static element like background and nbr life
    double sizeX;
    double sizeY;

    public double getSizeX() {
        return sizeX;
    }

    public double getSizeY() {
        return sizeY;
    }

    ImageView imageview = new ImageView();
    public void setImageview(ImageView imageview) {
        this.imageview = imageview;
    }






    //Contructeur
    public StaticThing(double sizeX, double sizeY, String fileName) throws FileNotFoundException {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        setImageview(fileName);
        }

        /*Image spriteBg = new Image(new FileInputStream(fileName));
        ImageView bg = new ImageView(spriteBg);
        Group root2 = new Group(bg);
        Pane pane = new Pane(root2);
        Scene theScene = new Scene(pane, sizeX, sizeY,true );
        Stage secondaryStage = new Stage();
        secondaryStage.setScene(theScene);
        secondaryStage.show();
        */
    }
}
