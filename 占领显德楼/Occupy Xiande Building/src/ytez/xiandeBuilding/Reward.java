package ytez.xiandeBuilding;

import java.awt.*;
import java.awt.event.KeyAdapter;

import ytez.xiandeBuilding.Player;

public class Reward {
    Reward reward = new Reward(100,100);
    int x = 1000;
    int y = 900;
    private Image[] rewards = new Image[2];

    public Reward(int x, int y) {
        this.x = x;
        this.y = y;
        rewards[2] = GameUtil.getImage("images/reward.jpg");

    }
    //addKeyListener(new KeyAdapter){

    //}
    private void checkCollision(){


    }



}
