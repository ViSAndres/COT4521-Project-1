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
        size = 100;
        vertexList = new Point[size];
        vertNumber = 0;
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
        vertexList[vertNumber] = v;
        vertNumber++;
    }

    /**
     * Computes the area of this polygon using shoelace algorithm.
     *
     * @return area of this polygon
     */
    public double area()
    {
        if(vertNumber <4) return Double.NaN;
        double sum1 = 0.0, sum2 = 0.0;
        Point v1, v2;
        for (int i = 0; i < vertNumber; i++) {
            v1 = vertexList[i];
            v2 = vertexList[(i + 1) % vertNumber];

            sum1 += v1.getX() * v2.getY();
            sum2 += v2.getX() * v1.getY();

        }
        //Shoelace Formula to calculate the area.
        double area = 0.5 * Math.abs(sum1 - sum2);
        return area;
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
        int[] xCoord = new int[vertNumber];
        int[] yCoord = new int[vertNumber];

        for(int i = 0; i < vertNumber; i++) {
            xCoord[i] = (int) vertexList[i].getX();
        }
        for(int i = 0; i < vertNumber; i++) {
            yCoord[i] = (int) vertexList[i].getY();
        }

        //Shade and draw Polygon
       g.fillPolygon(xCoord, yCoord, vertNumber);
    }

    /**
     * Returns the number of vertices in this polygon
     *
     * @return number of vertices in this polygon
     */
    public int getNumberOfVertices()
    {
        return vertexList.length;
    }

    /**
     * Determines the greatest x.
     *
     * @return the greatest x
     */
    public double greatestX()
    {
        double currentGreatestX = vertexList[0].getX();

        for (Point vertex : vertexList) {
            if (vertex.getX() > currentGreatestX) {
                currentGreatestX = vertex.getX();
            }
        }
        return currentGreatestX;
    }

    /**
     * Determines the greatest y.
     *
     * @return the greatest y
     */
    public double greatestY()
    {
        double currentGreatestY = vertexList[0].getY();

        for (Point vertex : vertexList) {
            if (vertex.getY() > currentGreatestY) {
                currentGreatestY = vertex.getY();
            }
        }
        return currentGreatestY;
    }

    /**
     * Determines if given point is contained in this polygon.
     *
     * @param point given point
     * @return true if p is on the boundary or the interior of this polygon.
     */
    public boolean isPointInRectPolygon(Point point)
    {
     int i;
     int j;
     boolean result = false;
     for (i = 0, j = vertexList.length - 1; i < vertexList.length; j = i++) {
        if ((vertexList[i].getY() > point.getY()) != (vertexList[j].getY() > point.getY()) &&
            (point.getX() < (vertexList[j].getX() - vertexList[i].getX()) * (point.getY() - vertexList[i].getY()) / (vertexList[j].getY()-vertexList[i].getY()) + vertexList[i].getX())) {
          result = !result;
         }
      }
        return result;
    }

    /**
     * Determines the smallest x.
     *
     * @return the smallest x
     */
    public double smallestX()
    {
        double currentsmallestX = vertexList[0].getX();

        for (Point vertex : vertexList) {
            if (vertex.getX() < currentsmallestX) {
                currentsmallestX = vertex.getX();
            }
        }
        return currentsmallestX;
    }

    /**
     * Determines the smallest y.
     *
     * @return the smallest y
     */
    public double smallestY()
    {
        double currentsmallestY = vertexList[0].getY();

        for (Point vertex : vertexList) {
            if (vertex.getY() < currentsmallestY) {
                currentsmallestY = vertex.getY();
            }
        }
        return currentsmallestY;
    }

    /**
     * Constructs a String description of this polygon.
     *
     * @return String containing vertices of this polygon.
     */
    @Override
    public String toString()
    {
        String str = "Polygon " + super.toString() + "\n";
        str += vertexList;

        return str;
    }

    /**
     * Translates this polygon by given vector.
     *
     * @param v given vector
     */
    public void translate(Vector v)
    {
        for (Point vertex : vertexList) {
            vertex.translate(v);
        }
    }
}
