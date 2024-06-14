
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Box extends JPanel
{
    private Rectangle [] boxes = new Rectangle[1000000];
    Random random= new Random();
    Box()
    {
        super();
        for(int i= 0; i<boxes.length; i++)
        {
            boxes[i]= new Rectangle( random.nextInt(10000), random.nextInt(10000),10000,10000);

        }
    }
    
   public void paintComponent (Graphics g)
   {
       g.setColor(Color.RED);
       
       for(int i= 0; i<boxes.length; i++)
       {
        g.fillRect (boxes[i].x,boxes[i].y,5,5);

       }
        
       
       

   }
}
