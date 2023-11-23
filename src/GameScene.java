import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GameScene extends Scene{
    public GameScene(Parent parent, double v, double v1, boolean b) throws FileNotFoundException {
        super(parent, v, v1, b);
    }


    public static void background() {
        left.imageview.setX(left.getsizeX()); // getSTx et getSTy sont les getters de staticThing
        left.imageview.setY(left.getSTy()); // cela nous permettra d'obtenir le x et le y de left et right

        right.imageview.setX(right.getSTx());
        right.imageview.setY(right.getSTy());
    }


    public static StaticThing right;

    static {
        try {
            right = new StaticThing(0, 0,"C:\\Users\\xiang\\OneDrive\\Bureau\\ENSEA\\2A\\S7\\INFO\\Java\\Projet\\Ressources audio et image pour le runner-20231107\\img\\desert.png" );
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static StaticThing left;

    static {
        try {
            left = new StaticThing(400,0 , "C:\\Users\\xiang\\OneDrive\\Bureau\\ENSEA\\2A\\S7\\INFO\\Java\\Projet\\Ressources audio et image pour le runner-20231107\\img\\desert.png");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
