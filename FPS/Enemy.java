
import java.awt.*;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Enemy extends JPanel {
    Random randomNum =new Random();
    int x= randomNum.nextInt(500);
    int y=0;
    Image   image;

    Enemy()
    {
        try {
        image =ImageIO.read(new File("./bomb.png"));
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        
        g.drawImage(image, x, y , 100, 100, this);

    }

    public void update()
    {
        y=y+1;
       
        x=x+1;
       
        
    }

}
