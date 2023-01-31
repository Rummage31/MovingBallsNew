import java.awt.*;
import static java.lang.Math.random;

public class Ball {
    private int size, xSpeed, ySpeed, x, y;
    Color color = new Color(128, 117, 198);

    public Ball() {

        size = (int) (random() * 50) + 10;
        color = new Color((int) (random() * 255) + 1, (int) (random() * 255) + 1, (int) (random() * 255) + 1);
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




    public void drawBall(Graphics g) {
        g.setColor(new Color(151, 162, 220));
        g.fillOval(x, y, size, size);
    }
}
