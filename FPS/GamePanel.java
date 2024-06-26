import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel implements Runnable {

    Thread thread;
    Enemy enemy = new Enemy();
    Enemy[] enemies = new Enemy[50];
    Player player= new Player();

    GamePanel() {
        super();
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.black);
        for(int i=0;i<enemies.length;i++)
        {
            enemies[i]=new Enemy();
        }

        setFocusable(true);
        addKeyListener(new KeyAdapter() 
        {
            public void keyPressed(KeyEvent e)
            {
                player.update(e);
            }

            public void keyReleased(KeyEvent e)
            {
                player.stop();
            }


        });
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        player.paintComponent(g);

        for(int i=0;i<enemies.length;i++)
        {
            
            enemies[i].paintComponent(g);
        }

    }

    public void startGame() {
        thread = new Thread(this);
        thread.start();
    }

    public void update() {
        for(int i=0;i<enemies.length;i++)
        {
            enemies[i].update();
            
        }
        player.move();
}
    

    @Override
    public void run() {
        double drawInterval = 1000000000 / 60;
        double deltaTime = 0;
        long lastPassedTime = System.nanoTime();
        long currentTime = 0;
        while (thread != null) {
            currentTime = System.nanoTime();
            deltaTime += (currentTime - lastPassedTime) / drawInterval;
            lastPassedTime = currentTime;

            if (deltaTime >= 1) {

                update();
                repaint();
                deltaTime--;
            }
        }

    }
}
