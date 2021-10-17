
import javax.swing.*;

public class Assignment1Framework
{
    public static void main(String[] args)
    {
        new Assignment1Framework();
    }
    
    public Assignment1Framework()
    {        
        //Defining the geometric objects that represent the problem data
        Rectangle[] rArray = new Rectangle[3];
        
        Point p = new Point(5, 6);
        Point q = new Point(10, 370);
        rArray[0] = new Rectangle(p, q); //Florida Turnpike
        
        p = new Point(10, 13);
        q = new Point(420, 26);
        rArray[1] = new Rectangle(p, q); //8th st.

        p = new Point(421, 10);
        q = new Point(430, 410);
        rArray[2] = new Rectangle(p, q); //107th Ave.
        
        //graphing
        FrameDisplay frame = new FrameDisplay(450, 450, rArray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
