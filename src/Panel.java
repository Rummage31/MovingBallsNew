import javax.swing.*;
import java.awt.*;


public class Panel {
   // Ball[] balls = new Ball[20];
    public void makeP() {

        JFrame mainF = new JFrame("I Love CompSci");
        JPanel mainP = new JPanel();
        mainF.add(mainP);
        mainF.setSize(1000,1000);
        mainP.setBackground(new Color(70, 71, 77));
        mainF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainF.setVisible(true);

//        for(int i = 0; i<balls.length;i++) {
//            Ball ball = new Ball();
//            balls[i] = ball;
//            mainP.add(ball);
//
//        }
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