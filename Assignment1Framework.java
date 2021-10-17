
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
        RectPolygon[] polygons = new RectPolygon[3];
        
        RectPolygon pg6  = new RectPolygon();
        pg6.addVertex(new Point(267,44));
        pg6.addVertex(new Point(295,44));
        pg6.addVertex(new Point(295,80));
        pg6.addVertex(new Point(267,80));
        polygons[0] = pg6; //Florida Turnpike
        
        // p = new Point(10, 13);
        // q = new Point(420, 26);
        // polygons[1] = new Rectangle(p, q); //8th st.

        // p = new Point(421, 10);
        // q = new Point(430, 410);
        // polygons[2] = new Rectangle(p, q); //107th Ave.
        
        //graphing
        FrameDisplay frame = new FrameDisplay(450, 450, polygons);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
