import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;
class Spaceship
{
    public static void main(String[] args) {
        Space s=new Space();
        s.setPreferredSize(new Dimension(500,300));
        JFrame f=new JFrame("spaceship");
        JButton b1=new JButton("left");
        JButton b2=new JButton("right");
        JButton b3=new JButton("up");
        JButton b4=new JButton("down");
        b1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                s.moveleft();
            }
        });
        b2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                s.moveright();
            }
        });
        b3.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                s.moveup();
            }
        });
        b4.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                s.movedown();
            }
        });
        JPanel actioPanel =new JPanel();
        actioPanel.add(b1);
        actioPanel.add(b2);
        actioPanel.add(b3);
        actioPanel.add(b4);
        f.add(s,BorderLayout.NORTH);
        f.add(actioPanel,BorderLayout.SOUTH);
        f.setSize(500,500);
        f.setVisible(true);
    }
}