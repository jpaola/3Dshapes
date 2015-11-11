
package Shapes;

/**
 * An abstract class to represent a shape in 3-Dimensional space that 
 * implements the comparable class to compare shapes. This class overrides
 * the toString method and implements concrete methods to compute and return
 * the surface area and volume of any shape that extends this class.
 */
/**
 * @author Paola Jiron
 */

public abstract class Shape implements Comparable
{
   // instance var's
    private Point3D threeDPoint;
    
    /**
     * Three argument constructor, creates a point3D object with
     * coordinates at the origin.
     * @param x The x-axis.
     * @param y The y-axis.
     * @param z The z-axis.
     */
    public Shape(int x, int y, int z)
    {
        threeDPoint = new Point3D( x, y, z);
    }
    /**
     * Overridden toString method returns a string containing the coordinates 
     * of the center of the shape.
     * @return A string with coordinates of the center.
     */
    @Override
    public String toString()
    {
        return threeDPoint.toString();
    }
    /**
     * Computes and returns the distance of the center of a shape from the
     * origin.
     * @return The distance of the center of a shape from the origin.
     */
    public double distanceFromOrigin()
    {
  
        return Math.sqrt(Math.pow(threeDPoint.getX(), 2)
                        + Math.pow(threeDPoint.getY(), 2)
                        + Math.pow(threeDPoint.getZ(), 2));
                  
    }

    /**
     * Overridden compareTo method orders shape objects by their volumes in
     *          ascending order.
     * @param s Explicit parameter to which the implicit parameter is being
     *          compared.
     * @return -1 if implicit parameter < explicit parameter, 
     *          0 if implicit parameter == explicit parameter, 
     *          1 if implicit parameter > explicit parameter.
     */
    @Override
    public int compareTo(Object s)
    {
        Shape other = (Shape) s;   // downcasting from Object to Shape 
        
        if (this.volume() < other.volume()) 
        {
            return -1;
        }
        else if (this.volume() > other.volume()) 
        {
            return 1;
        }
        else
        {
            return 0;
        }
        
        
    }
    /**
     * Computes and returns the surface area of a shape.
     * @return The surface area of a shape.
     */
    public abstract double surfaceArea();
    
    /**
     * Computes and returns the volume of shape.
     * @return The volume of a shape.
     */
    public abstract double volume();
    
}   // end of Shape definitions