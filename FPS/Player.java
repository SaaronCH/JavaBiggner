import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
public class Player extends JPanel 
{
    int x=0;
    int y=0;
    int speed=10;
    int directionX=0;
    int directionY=0;

    public  void paintComponent(Graphics g) 
    {
    super.paintComponent(g);
    g.setColor(Color.white);
    g.fillRect(10,10,100,100);
    }
    
    public void update(KeyEvent e)
    {
        int code =e.getKeyCode();
        if (code== 37)
        {
            //left
            directionX=-1;
        }
        else if(code==39)
        {
            //right
        directionX= 1;
        }

        if (code== 38)
        {
            //up
            directionY=-1;
        }
        else if(code==40)
        {
            //down
        directionY= 1;

        }
    }
    
    public void move()
    {
        x=x+ directionX * speed;
        y=y+ directionY * speed;
    }

    public void stop()
    {
        directionX=0;
        directionY=0;
    }
}

