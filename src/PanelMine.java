import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class PanelMine extends JPanel{
    Ball[] balls = new Ball[20];
    private int wall1,wall2;
    private Ball yourBall = new Ball();


    public PanelMine() {

        setBackground(new Color(70, 71, 77));




        for(int i = 0; i<balls.length;i++) {
            Ball ball = new Ball();
            balls[i] = ball;
        }
        addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                wall1 = getWidth();
                wall2 = getHeight();
            }
        });



        setFocusable(true);
        addKeyListener(new KeyListener() {


            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                if (e.getKeyCode() == 68) {
                            yourBall.moveRight(wall1,wall2);
                } if (e.getKeyCode() == 65) {
                            yourBall.moveLeft(wall1,wall2);
                } if (e.getKeyCode() == 87) {
                            yourBall.moveUp(wall1,wall2);
                } if (e.getKeyCode() == 83) {
                            yourBall.moveDown(wall1,wall2);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }









    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i<balls.length;i++) {
            yourBall.drawBall(g);
            balls[i].drawBall(g);
            balls[i].ballMove(wall1,wall2);
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        repaint();
    }

}



