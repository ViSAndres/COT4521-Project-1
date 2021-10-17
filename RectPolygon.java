
import java.awt.Graphics;

/**
 * This class represents a rectilinear polygon with sides parallel to the axis;
 * polygon is given by its vertices listed in counterclockwise order.
 */
public class RectPolygon extends GeometricObject
{

    private Point[] vertexList; //list of vertices in clockwise order
    private int size;   //capacity of array vertexList
    private int vertNumber; //number of vertices of this polygon

    /**
     * Instantiates an empty RectPolygon object. Vertex array size is
     * set to 4.
     */
    RectPolygon()
    {
    }

    /**
     * Adds a vertex as the last one in the sequence of vertices. Vertex array
     * will be expanded to double its size if vertex cannot be added because
     * array is full.
     *
     * @param v the new vertex
     */
    public void addVertex(Point v)
    {
    }

    /**
     * Computes the area of this polygon using shoelace algorithm.
     *
     * @return area of this polygon
     */
    public double area()
    {
        return -1;
    }

    /**
     * Determines the smallest rectangle bounding this polygon.
     *
     * @return bounding rectangle
     */
    public Rectangle boundingRectangle()
    {
        return new Rectangle();
    }

    /**
     * Draws this polygon.
     *
     * @param g graphics context
     */
    @Override
    public void draw(Graphics g)
    {
    }

    /**
     * Returns the number of vertices in this polygon
     *
     * @return number of vertices in this polygon
     */
    public int getNumberOfVertices()
    {
        return -1;
    }

    /**
     * Determines the greatest x.
     *
     * @return the greatest x
     */
    public double greatestX()
    {
        return Double.NaN;
    }

    /**
     * Determines the greatest y.
     *
     * @return the greatest y
     */
    public double greatestY()
    {
        return Double.NaN;
    }

    /**
     * Determines if given point is contained in this polygon.
     *
     * @param p given point
     * @return true if p is on the boundary or the interior of this polygon.
     */
    public boolean isPointInRectPolygon(Point p)
    {
        return false;
    }

    /**
     * Determines the smallest x.
     *
     * @return the smallest x
     */
    public double smallestX()
    {
        return Double.NaN;
    }

    /**
     * Determines the smallest y.
     *
     * @return the smallest y
     */
    public double smallestY()
    {
        return Double.NaN;
    }

    /**
     * Constructs a String description of this polygon.
     *
     * @return String containing vertices of this polygon.
     */
    @Override
    public String toString()
    {
        return "";
    }

    /**
     * Translates this polygon by given vector.
     *
     * @param v given vector
     */
    public void translate(Vector v)
    {
    }
}
