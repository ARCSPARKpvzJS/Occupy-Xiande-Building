package ytez.xiandeBuilding;

import java.awt.*;

public class TuXiang extends GameObj {

    static Image img[] = new Image[10];
    private double speedX,speedY;
    private double degree;
    private int type;
    static
    {

        img[1] = GameUtil.getImage("images/gmz.jpg");

    }

    public TuXiang(int x, int y, double speed, int height, int width)
    {
        super(x, y, speed, height, width);
        degree = 0.2+Math.random()*-1.0;
        speed = Math.random()*3.0 + 2.0;
        speedX = (double)speed*Math.cos(degree);
        speedY = (double)speed*Math.sin(degree);
        type = (int)(Math.random()*7);
    }

    public void jump()
    {
        speedY += (double)Constant.GRAVITY/60;
        x +=speedX;
        y +=speedY;
        if (y > Constant.GAME_HEIGHT -50) {
            speedY = -speedY;
        }
    }

    @Override
    public void paint(Graphics g) {
        jump();
        g.drawImage(img[type], x, y, null);
    }
}
