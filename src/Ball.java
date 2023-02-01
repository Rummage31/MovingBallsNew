import java.awt.*;
import static java.lang.Math.random;

public class Ball {
    private int x,y,xSpeed,ySpeed,size;
    private Color color;

    public Ball() {

        color = new Color((int) (random() * 255), (int) (random() * 255), (int) (random() * 255));
        size = (int) (random() * 50) + 10;
        xSpeed = (int) (random() * 10) + 1;
        ySpeed = (int) (random() * 10) + 1;
        x = (int) (random() * 100) + 1;
        y = (int) (100 * random()) + 1;


    }



    public void ballMove(double wall1, double wall2){

        x += xSpeed;
        y += ySpeed;

        if(x >= wall1 - size || x < 0){
            xSpeed *= -1;

        }
        else if(y >= wall2- size || y < 0){
            ySpeed *= -1;

        }
    }

    public void moveRight(int wall1, int wall2){
        x += xSpeed;
        if(x >= wall1 - size || x < 0){
            x = 0;

        }
    }
    public void moveLeft(int wall1, int wall2){
        x -= xSpeed;
        if(x >= wall1 - size || x < 0){
            x = wall1 - size;

        }
    }
    public void moveDown(int wall1, int wall2){
        y += ySpeed;
        if(y >= wall2 - size || y < 0){
            y = wall2 - size;
        }
    }
    public void moveUp(int wall1, int wall2){
        y -= ySpeed;
        if(y >= wall2 - size || y < 0){
            y = 0;
        }
    }



    public void drawBall(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, size, size);
    }
}
