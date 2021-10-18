// Author: Carlos Andres Neira  5676297
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
        RectPolygon[] polygons = new RectPolygon[5];
        
        RectPolygon pg6  = new RectPolygon();
        pg6.addVertex(new Point(267,44));
        pg6.addVertex(new Point(295,44));
        pg6.addVertex(new Point(295,80));
        pg6.addVertex(new Point(267,80));
        polygons[0] = pg6;
        
        RectPolygon gl = new RectPolygon();
        gl.addVertex(new Point(284,168));
        gl.addVertex(new Point(292,168));
        gl.addVertex(new Point(293,172));
        gl.addVertex(new Point(299,172));
        gl.addVertex(new Point(299,168));
        gl.addVertex(new Point(310,168));
        gl.addVertex(new Point(310,191));
        gl.addVertex(new Point(304,191));
        gl.addVertex(new Point(304,199));
        gl.addVertex(new Point(303,199));
        gl.addVertex(new Point(303,203));
        gl.addVertex(new Point(301,203));
        gl.addVertex(new Point(301,212));
        gl.addVertex(new Point(290,212));
        gl.addVertex(new Point(290,203));
        gl.addVertex(new Point(290,199));
        gl.addVertex(new Point(287,199));
        gl.addVertex(new Point(287,191));
        gl.addVertex(new Point(284,191));
        polygons[1] = gl;

        RectPolygon rss = new RectPolygon();
        rss.addVertex(new Point(174,350));
        rss.addVertex(new Point(204,350));
        rss.addVertex(new Point(204,354));
        rss.addVertex(new Point(207,354));
        rss.addVertex(new Point(213,361));
        rss.addVertex(new Point(213,392));
        rss.addVertex(new Point(204,404));
        rss.addVertex(new Point(175,404));
        rss.addVertex(new Point(163,392));
        rss.addVertex(new Point(163,361));
        polygons[2] = rss;

        RectPolygon dm  = new RectPolygon();
        dm.addVertex(new Point(268,212));
        dm.addVertex(new Point(281,212));
        dm.addVertex(new Point(281,225));
        dm.addVertex(new Point(284,224));
        dm.addVertex(new Point(284,230));
        dm.addVertex(new Point(280,233));
        dm.addVertex(new Point(281,242));
        dm.addVertex(new Point(269,243));
        dm.addVertex(new Point(269,230));
        dm.addVertex(new Point(264,230));
        dm.addVertex(new Point(264,224));
        dm.addVertex(new Point(268,224));
        polygons[3] = dm;

        RectPolygon ahc5 = new RectPolygon();
        ahc5.addVertex(new Point(354, 100));
        ahc5.addVertex(new Point(376, 99));
        ahc5.addVertex(new Point(373, 116));
        ahc5.addVertex(new Point(360, 109));
        polygons[4] = ahc5;

        //graphing
        FrameDisplay frame = new FrameDisplay(450, 450, polygons);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
