
package Shapes;
import java.util.Comparator;

/**
 * A class that implements the Comparator class to apply an overridden shape
 * comparator method with respect to their distance from the origin. If one 
 * shape is closer to the origin than the other shape, it returns -1, 
 * otherwise, it returns 1.
 */
/**
 * @author Paola Jiron
 */

public class ShapeComparator implements Comparator
{
    /**
     * Compares two objects for order.
     * Returns a negative integer, zero, or a positive integer if the first 
     * argument is less than, equal to, or greater than the second.
     * @param firstObject It's first object to be compared.
     * @param secondObject It's second object to be compared.
     * @return A negative integer, zero, or a positive integer as the first 
     *         argument is less than, equal to, or greater than the second.
     */
    @Override
    public int compare(Object firstObject, Object secondObject)
    {
        // the two shapes to be compared
        
        Shape shape1 = (Shape) firstObject;
        
        Shape shape2 = (Shape) secondObject;
        
        // distance from origin using param val's
        
        double distFromOrigin1 = shape1.distanceFromOrigin();
        double distFromOrigin2 = shape2.distanceFromOrigin();
        
        // is shape1 closer to the origin?
        
        if (distFromOrigin1 < distFromOrigin2)
        {
            return 1;
        }
        if (distFromOrigin1 > distFromOrigin2)
        {
            return -1;
        }
        return 0;
    }
}   // end of ShapeComparator definitions
