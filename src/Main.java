import javax.swing.*;


public class Main {
    public static void main(String args[]) {

        JFrame mainF = new JFrame("I Love CompSci");
        mainF.setSize(1000,1000);
        mainF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainF.add(new PanelMine());
        mainF.setVisible(true);


    }

}