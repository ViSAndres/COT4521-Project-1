
/**
 * This class represents a position vector given by its x and y components.
 */
public class Vector
{
    private double x; //x component of the vector
    private double y; //y component of the vector

    /**
     * Instantiates a null vector.
     */
    public Vector()
    {
        x = y = 0;
    }

    /**
     * Instantiates a Vector object with components (x, y).
     *
     * @param x x-component
     * @param y y-component
     */
    public Vector(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * Adds this vector to the given one.
     *
     * @param v given vector
     *
     * @return this+v
     */
    public Vector add(Vector v)
    {
        return new Vector(this.x + v.x, this.y + v.y);
    }

    /**
     * Calculates direction of this vector (given as the counterclockwise angle
     * from the positive x axis)
     *
     * @return direction
     */
    public double direction()
    {
        double angle = Math.toDegrees(Math.atan2(y, x));
        if (angle<0) angle += 360;
        
        return angle;
    }

    /**
     * Returns the x component of this vector.
     *
     * @return x-component
     */
    public double getX()
    {
        return x;
    }

    /**
     * Returns the y component of this vector.
     *
     * @return y-component
     */
    public double getY()
    {
        return y;
    }

    /**
     * Calculates magnitude (length) of this vector.
     *
     * @return magnitude
     */
    public double magnitude()
    {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    /**
     * Computes a vector with same magnitude and direction opposite to that of
     * this vector.
     *
     * @return the vector -this
     */
    public Vector neg()
    {
        return new Vector(-x, -y);
    }

    /**
     * Sets the x-component of this vector.
     *
     * @param x x-component
     */
    public void setX(double x)
    {
        this.x = x;
    }

    /**
     * Sets the y-component of this vector.
     *
     * @param y y-component
     */
    public void setY(double y)
    {
        this.y = y;
    }

    /**
     * Subtracts the given vector from this one.
     *
     * @param v given vector
     *
     * @return this-v
     */
    public Vector subtract(Vector v)
    {
        return new Vector(this.x - v.x, this.y - v.y);
    }

    /**
     * Constructs a String description of this vector.
     *
     * @return String containing a description of this vector
     */
    @Override
    public String toString()
    {
        return "VECTOR (" + x + ", " + y + ")";
    }
}
