import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;


public class PanelMine extends JPanel{
    Ball[] balls = new Ball[20];
    private double wall1,wall2;

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
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i<balls.length;i++) {
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



//        setFocusable(true);
//        addKeyListener(new KeyListener() {
//
//
//            @Override
//            public void keyTyped(KeyEvent e) {
//
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//                System.out.println(e.getKeyCode());
//                if (e.getKeyCode() == 68) {
//                    //b1.moveRight();
//                }
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//
//            }
//        });