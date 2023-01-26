import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.random;

public class Ball extends JPanel implements ActionListener{
    private int size, xSpeed, ySpeed, x, y;
    Timer timer = new Timer(5, this);
    Color color = new Color(117, 177, 198);
    public Ball() {

        size = (int) (random() * 50) + 10;
        color = new Color((int) (random() * 255) + 1, (int) (random() * 255) + 1, (int) (random() * 255) + 1);
        xSpeed = (int) (random() * 10) + 1;
        ySpeed = (int) (random() * 10) + 1;
        x = (int) (random() * 100) + 1;
        y = (int) (100 * random()) + 1;
        timer.start();

    }

    @Override
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        g.setColor(new Color(1,1,1));
        g.fillOval(x,y,size,size);
        System.out.println("fefe");

    }
    @Override
    public void actionPerformed(ActionEvent e){
        x += xSpeed;
        y += ySpeed;

        if(x >= getWidth() - size || x < 0){
            xSpeed *= -1;

        }
        else if(y >= getHeight() - size || y < 0){
            ySpeed *= -1;

        }
        repaint();
    }

}
