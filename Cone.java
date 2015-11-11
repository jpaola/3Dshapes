
package Shapes;

/**
 * A class that extends the shape class. This class represents an instance of 
 * a cone with x, y, & z coordinates, radius and height.
 */
/**
 * @author Paola Jiron
 */

public class Cone extends Shape 
{
    // instance var's
    private final double radius, height;
    
    /**
     * A constructor for the cone with x, y, & z coordinates, including
     * radius and height.
     * @param x The x-axis.
     * @param y The y-axis.
     * @param z The z-axis.
     * @param radius The radius.
     * @param height The height.
     */
    public Cone(int x, int y, int z, double radius, double height) 
    {
        super(x, y, z);
        this.radius = radius;
        this.height = height;
    }
    /**
     * Returns the radius of the cone.
     * @return The radius.
     */
    public double getRadius()
    {
        return radius;
    }
    /**
     * Returns the height of the cone.
     *
     * @return The height.
     */
    public double getHeight()
    {
        return height;
    }

   /**
     * Computes and returns the surface area of a cone.
     *
     * @return The surface area.
     */
    @Override
    public double surfaceArea()
    {
        return (Math.PI * getRadius()) * ( getRadius() +
                Math.sqrt(Math.pow(getRadius(), 2) + Math.pow(getHeight(), 2)));
    }
    /**
     * Computes and returns the volume of a cone.
     * @return The volume.
     */
    @Override
    public double volume() 
    {
       return ((Math.PI * Math.pow(getRadius(), 2) * getHeight())/3);
    }
    /**
     * Overrides the toString method and returns a string containing 
     * the class name, coordinates, radius, and height.
     * @return A string with the coordinates of the cone.
     */
    @Override
    public String toString()
    {
       return this.getClass() + " " + super.toString() + " Radius: " + getRadius()
                + " Height: " + getHeight();
    }

}   // end of Cone definitions
