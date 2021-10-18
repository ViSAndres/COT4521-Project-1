// Author: Carlos Andres Neira  5676297

/**
 * This class implements several algorithms.
 */
public class Algorithms
{
    public static int isPointInPolygon(GeometricObject[] g, Point p) {
        RectPolygon[] polygons = (RectPolygon[])g;

        for (int i=0; i<g.length; i++)
        {
            if (polygons[i].isPointInRectPolygon(p))
                return i;
        }
        
        return -1;
    }
}
