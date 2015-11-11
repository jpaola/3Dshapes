
package Shapes;

/**
 * A class to represent a point in 3 dimensional space with three coordinates:
 * x, y, z.
 */
/**
 * @author Paola Jiron
 */

public class Point3D 
{
    // instance var's
    
    private int x, y, z;        // point coordinates
    
    /**
     * A constructors for the Point3D class containing three
     * coordinates: x, y, z.
     * @param x The x axis.
     * @param y The y axis.
     * @param z The z axis.
     */
    public Point3D(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Returns the x-coordinate.
     * @return The x-coordinate.
     */
    public int getX()
    {
        return x;
    }

    /**
     * Returns the y-coordinate.
     * @return The y-coordinate.
     */
    public int getY()
    {
        return y;
    }

    /**
     * Returns the z-coordinate.
     * @return The z-coordinate.
     */
    public int getZ()
    {
        return z;
    }
    /**
     * Returns a string containing all three coordinates of  point i.e. in 3D
     * space.
     * @return A string of the x, y, and z coordinates.
     */
    @Override
    public String toString()
    {
        return " ( " + getX() + ", " + getY() + ", " + getZ() + " ) "; 
    }   
}   // end of Point3D definitions