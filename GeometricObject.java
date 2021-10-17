
import java.awt.*;

abstract public class GeometricObject
{
    private Color boundaryColor;        //boundary color
    private Color interiorColor;        //interior color

    public GeometricObject()
    {
        interiorColor = Color.white;
        boundaryColor = Color.black;
    }

    public GeometricObject(Color iC, Color bC)
    {
        interiorColor = iC;
        boundaryColor = bC;
    }

    abstract public void draw(Graphics g);

    public Color getBoundaryColor()
    {
        return boundaryColor;
    }
    
    public Color getInteriorColor()
    {
        return interiorColor;
    }

    public void setBoundaryColor(Color boundaryColor)
    {
        this.boundaryColor = boundaryColor;
    }
    
    public void setInteriorColor(Color interiorColor)
    {
        this.interiorColor = interiorColor;
    }

    @Override
    public String toString()
    {
        String str;
        str = boundaryColor.getRed() + " " +
              boundaryColor.getGreen() + " " +
              boundaryColor.getBlue() + " " +
              boundaryColor.getAlpha() + " " +
              interiorColor.getRed() + " " +
              interiorColor.getGreen() + " " +
              interiorColor.getBlue() + " " +
              interiorColor.getAlpha();
        
        return str;
    }
}
