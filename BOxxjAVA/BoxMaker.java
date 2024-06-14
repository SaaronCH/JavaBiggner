import javax.swing.*;

class BoxMaker
{
    public static void main(String[] args)
    {
        JFrame frame= new JFrame("Box");
        Box box = new Box();
        frame.add(box);

        frame.setSize(10000, 1000000);
        frame.setVisible(true);
    }

}