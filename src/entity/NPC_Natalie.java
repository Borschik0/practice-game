package entity;

import main.GamePanel;

import java.awt.*;
import java.util.Random;

import static main.GamePanel.TILE_SIZE;

public class NPC_Natalie extends Entity{

    public NPC_Natalie(GamePanel gp) {
        super(gp);

        imgPath = "park/npc/natalie/";

        direction = "stand";
        speed = 2;

        topBorder = TILE_SIZE * 10;
        bottomBorder = TILE_SIZE * 14;
        leftBorder = TILE_SIZE * 10;
        rightBorder = TILE_SIZE * 14;

        solidArea = new Rectangle(15, 36, 18, 12);
        solidAreaDefaultX = 15;
        solidAreaDefaultY = 36;

        getNPC_NatalieImage();
    }

    public void getNPC_NatalieImage() {
        stand = setup("natalie_default");
        down1 = setup("natalie_down_1");
        down2 = setup("natalie_down_2");
        up1 = setup("natalie_up_1");
        up2 = setup("natalie_up_2");
        right1 = setup("natalie_right_1");
        right2 = setup("natalie_right_2");
        left1 = setup("natalie_left_1");
        left2 = setup("natalie_left_2");
    }

    @Override
    public void setAction() {

        actionLockCounter++;

        // NPC persists movement direction for 2 seconds
        basicAI(120);
    }
}
