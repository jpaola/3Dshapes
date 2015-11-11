
package Shapes;

/**
 * A class that extends the shape class. This class represents an 
 * instance of a sphere with x, y, &, z coordinates and a radius.
 */
/**
 * @author Paola Jiron
 */

public class Sphere extends Shape 
{
    // instance var's
    private final double radius;

    /**
     * A constructor for the sphere with four parameters; the x, y, & z
     * coordinates and the radius.
     * @param x The x-axis.
     * @param y The y-axis.
     * @param z The z-axis.
     * @param radius The radius of the sphere.
     */
    public Sphere(int x, int y, int z, double radius)
    {
        super(x, y, z);
        this.radius = radius;
    }
    /**
     * Returns the radius of the sphere.
     * @return The radius.
     */
    public double getRadius()
    {
        return radius;
    }
   /**
     * Computes and returns the surface area of a sphere.
     *
     * @return The surface area.
     */
    @Override
    public double surfaceArea() 
    {
       return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    /**
     * Computes and returns the volume of a sphere.
     * @return The volume.
     */
    @Override
    public double volume() 
    {
        return ((4.0/3.0) * Math.PI * (Math.pow(getRadius(), 3)));
    }
    /**
     * Overrides the toString method and returns a string containing 
     * the class name, coordinates, and radius.
     * @return A string with the coordinates of the sphere.
     */
    @Override
    public String toString()
    {
       return this.getClass() + " " + super.toString() + " Radius: " + getRadius();
    }

}
