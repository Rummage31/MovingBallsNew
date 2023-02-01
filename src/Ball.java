import java.awt.*;
import static java.lang.Math.random;

public class Ball {
    private int size, xSpeed, ySpeed, x, y;
    private Color color;

    public Ball() {

        color = new Color(115, 105, 185);
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

    public void moveRight(double wall1, double wall2){
        x += xSpeed;
        if(x >= wall1 - size || x < 0){
            xSpeed *= -1;

        }
        else if(y >= wall2- size || y < 0){
            ySpeed *= -1;

        }
    }
    public void moveLeft(double wall1, double wall2){
        x -= xSpeed;
        if(x >= wall1 - size || x < 0){
            xSpeed *= -1;

        }
        else if(y >= wall2- size || y < 0){
            ySpeed *= -1;

        }
    }
    public void moveDown(double wall1, double wall2){
        y += ySpeed;
        if(x >= wall1 - size || x < 0){
            xSpeed *= -1;

        }
        else if(y >= wall2- size || y < 0){
            ySpeed *= -1;

        }
    }
    public void moveUp(double wall1, double wall2){
        y -= ySpeed;
        if(x >= wall1 - size || x < 0){
            xSpeed *= -1;

        }
        else if(y >= wall2- size || y < 0){
            ySpeed *= -1;

        }
    }



    public void drawBall(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, size, size);
    }
}
