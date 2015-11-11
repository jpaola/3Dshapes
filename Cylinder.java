
package Shapes;

/**
 * A class that extends the shape class. This class represents an instance of
 * a cylinder with x, y, & z coordinates, radius and height.
 */
/**
 * @author Paola Jiron
 */

public class Cylinder extends Shape 
{
    // instance var's
    private final double radius, height;
    
    /**
     * A constructor for the cylinder with x, y, & z coordinates, including
     * radius and height.
     * @param x The x-axis.
     * @param y The y-axis.
     * @param z The z-axis.
     * @param radius The radius.
     * @param height The height.
     */
    public Cylinder(int x, int y, int z, double radius, double height)
    {
        super(x, y, z);
        this.radius = radius;
        this.height = height;
    }
    /**
     * Returns the radius of the cylinder.
     * @return The radius.
     */
    public double getRadius()
    {
        return radius;
    }
    /**
     * Returns the height of the cylinder.
     *
     * @return The height.
     */
    public double getHeight()
    {
        return height;
    }

   /**
     * Computes and returns the surface area of a cylinder.
     *
     * @return The surface area.
     */
    @Override
    public double surfaceArea()
    {
        return 2 * Math.PI * getRadius() *( getHeight() + getRadius());
    }
    /**
     * Computes and returns the volume of a cylinder.
     * @return The volume.
     */
    @Override
    public double volume() 
    {
        return (( Math.PI * Math.pow(getRadius(), 2) * getHeight()));
    }
    /**
     * Overrides the toString method and returns a string containing 
     * the class name, coordinates, radius, and height.
     * @return A string with the coordinates of the cylinder.
     */
    @Override
    public String toString()
    {
       return this.getClass() + " " + super.toString() + " Radius: " + getRadius()
                + " Height: " + getHeight();
    }

} // end of Cylinder definitions
