
import java.awt.Graphics;

/**
 * This class represents a rectangle with sides parallel to the axis;
 * rectangle is given by two opposite corners.
 */
public class Rectangle extends GeometricObject
{
    //begin and end are opposite corners; no guaranties which one
    private Point begin;
    private Point end;

    public Rectangle()
    {
        begin = new Point(0, 0);  //begin-upper corner = (0,0)
        end = new Point(1, 1);    //end-lower corner = (1,1)   
    }

    public Rectangle(Point b, Point e)
    {
        begin = new Point(b.getX(), b.getY());
        end = new Point(e.getX(), e.getY());
    }

    /**
     * Draws this rectangle.
     * 
     * @param g graphics context 
     */
    @Override
    public void draw(Graphics g)
    {
        int x = (int)smallestX(); //left x
        int y = (int)smallestY(); //top y
        int w = (int)width();
        int h = (int) height();
        
        g.setColor(getInteriorColor());
        g.fillRect(x, y, w, h);
        
        g.setColor(getBoundaryColor());
        g.drawRect(x, y, w, h);
    }

    /**
     * Returns the first point defining this rectangle.
     * 
     * @return a point (corner) defining this rectangle
     */
    public Point getBegin()
    {
        return new Point(begin.getX(), begin.getY());
    }

    /**
     * Returns the second point defining this rectangle.
     * 
     * @return a point (corner) defining this rectangle
     */
    public Point getEnd()
    {
        return new Point(end.getX(), end.getY());
    }

    /**
     * Determines the greatest x.
     *
     * @return the greatest x
     */
    public double greatestX()
    {
        return begin.getX()>end.getX() ? begin.getX():end.getX();
    }

    /**
     * Determines the greatest y.
     *
     * @return the greatest y
     */
    public double greatestY()
    {
        return begin.getY()>end.getY() ? begin.getY():end.getY();
    }
    
    /**
     * Calculates the height of this rectangle.
     * 
     * @return the height of this rectangle
     */
    public double height()
    {
        return Math.abs(begin.getY() - end.getY());
    }

    /**
     * Sets the the first point defining this rectangle.
     * 
     * @param p a point (corner) defining this rectangle
     */
    public void setBegin(Point p)
    {
        begin = new Point(p.getX(), p.getY());
    }

    /**
     * Sets the the second point defining this rectangle.
     * 
     * @param p a point (corner) defining this rectangle
     */
    public void setEnd(Point p)
    {
        end = new Point(p.getX(), p.getY());
    }

    /**
     * Determines the smallest x.
     * 
     * @return the smallest x
     */
    public double smallestX()
    {
        return begin.getX()<end.getX() ? begin.getX():end.getX();
    }

    /**
     * Determines the smallest y.
     * 
     * @return the smallest y
     */
    public double smallestY()
    {
        return begin.getY()<end.getY() ? begin.getY():end.getY();
    }
    
    /**
     * Constructs a String description of this rectangle.
     *
     * @return String containing a description of this rectangle
     */
    @Override
    public String toString()
    {
        String str = "RECTANGLE " + super.toString() + "\n";
        str += begin + "\n" + end;

        return str;
    }
    
    /**
     * Translates this rectangle by given vector.
     *
     * @param v given vector
     */
    public void translate(Vector v)
    {
        begin.translate(v);
        end.translate(v);
    }
    
    /**
     * Calculates the width of this rectangle.
     * 
     * @return the width of this rectangle
     */
    public double width()
    {
        return Math.abs(begin.getX() - end.getX());
    }

    /**
     * Determines if given point is contained in this rectangle.
     * 
     * @param p given point
     * @return true if p is on the boundary or the interior of this rectangle.
     */
    boolean isPointInRectangle(Point p)
    {
        double x = p.getX();
        double y = p.getY();
        if ( (smallestX() <= x && x <= greatestX()) &&
                (smallestY() <= y && y <= greatestY()) )
            return true;
        else
            return false;
    }
}
