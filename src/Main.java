import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String args[]) {

        JFrame mainF = new JFrame("I Love CompSci");
        JPanel mainP = new JPanel();
        mainF.add(mainP);
        mainF.setSize(1000,1000);
        mainP.setBackground(new Color(70, 71, 77));
        mainF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainF.setVisible(true);


    }

}