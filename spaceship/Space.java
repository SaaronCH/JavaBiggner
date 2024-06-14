import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
public class Space extends JPanel
{
    int x=0;
    int y=0;
    private Image spaceshipImage;
    Space()
    {
        super();
        try{
            spaceshipImage = ImageIO.read(new File("./Dragon.png"));
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    public void moveleft()
    {
        x=x-10;
        repaint();
    }
    public void moveright()
    {
        x=x+10;
        repaint();
    }
    public void moveup()
    {
        y=y-10;
        repaint();
    }
    public void movedown()
    {
        y=y+10;
        repaint();
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.red);
        //g.fillRect(x, y, 100, 100);
        g.drawImage(spaceshipImage, x, y, 100,100 ,this);
    }
}
