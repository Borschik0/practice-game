package object;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

import static main.GamePanel.TILE_SIZE;

public class OBJ_Tree_2 extends SuperObject{

    public OBJ_Tree_2() {
        name = "Tree_2";
        collision = true;

        scaleX = 3;
        scaleY = 3;

        width = TILE_SIZE * scaleX;
        height = TILE_SIZE * scaleY;

        solidAreaDefaultX = 20;
        solidAreaDefaultY = 20;

        solidArea = new Rectangle(20, 20, width - 30, height - 35);

        try {
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/park/objects/tree_2.png")));
            uTool.scaleImage(image, width, height);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
