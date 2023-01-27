import javax.swing.*;
import java.awt.*;


public class PanelMine extends JPanel{
    Ball[] balls = new Ball[20];
    public void PanelMine() {

    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i<balls.length;i++) {
            Ball ball = new Ball();
            balls[i] = ball;
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