import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class PanelMine extends JPanel {
    ArrayList<Ball> balls = new ArrayList<>();
    private int wall1,wall2;
    private Ball yourBall = new Ball();
    private JButton add = new JButton("Add");
    private JButton remove = new JButton("Remove");

    public PanelMine() {

        setBackground(new Color(70, 71, 77));
        add(add);
        add(remove);



        for(int i = 0; i<20;i++) {
            Ball ball = new Ball();
            balls.add(ball);
        }

        add.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                balls.add(new Ball());
            }

        });
        remove.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                balls.remove(0);
            }

        });

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
        for(int i = 0; i<balls.size();i++) {
            yourBall.drawBall(g);
            balls.get(i).drawBall(g);
            balls.get(i).ballMove(wall1,wall2);
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        repaint();
    }

}



