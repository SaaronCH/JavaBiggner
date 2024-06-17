
/**
 * Main
 */
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FPs Game Control");
        frame.setResizable(false);
        GamePanel g = new GamePanel();
        frame.add(g);
        g.startGame();
        // frame.setLocationRelativeTo(new);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

}