package Shapes;

/**
 * A class that extends the shape class. This class represents an
 * instance of a parallelepiped with x, y, & z coordinates, a length, width, &
 * height. 
 */
/**
 * @author Paola Jiron
 */

public class Parallelepiped extends Shape
{

    // instance var's
    private final double length, width, height;

    /**
     * A constructor with four parameters respectively for a parallelepiped.
     *
     * @param x The x-axis.
     * @param y The y-axis.
     * @param z The z-axis.
     * @param length The length.
     * @param width The width.
     * @param height The height.
     */
    public Parallelepiped(int x, int y, int z, double length, double width,
            int height)
    {
        super(x, y, z);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    /**
     * Returns the length.
     *
     * @return The length.
     */
    public double getLength()
    {
        return length;
    }

    /**
     * Returns the width.
     *
     * @return The width.
     */
    public double getWidth()
    {
        return width;
    }
    /**
     * Returns the height.
     *
     * @return The height.
     */
    public double getHeight()
    {
        return height;
    }

    /**
     * Computes and returns the surface area of a parallelepiped.
     *
     * @return The surface area.
     */
    @Override
    public double surfaceArea() 
    {
        return 2 * ((getLength() * getWidth()) + (getLength() * getHeight())
                + (getWidth() * getHeight()));
    }

    /**
     * Computes and returns the volume of a parallelepiped.
     * @return The volume.
     */
    @Override
    public double volume()
    {
        return (getLength() * getWidth() * getHeight());
    }
    /**
     * Overrides the toString method and returns a string containing 
     * the class name, coordinates, length, width, and height.
     * @return A string with the coordinates of the parallelepiped.
     */
    @Override
    public String toString()
    {
       return this.getClass() + " " + super.toString() + "Length: " + getLength()
                + " Width: " + getWidth() + " Height: " + getHeight();
    }

}   // end of Parallelepiped definitions
