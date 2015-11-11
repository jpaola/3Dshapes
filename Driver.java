
package Shapes;
import java.util.Arrays;

/**
 * A test class for the shapes class.
 */
/**
 * @author Paola Jiron
 */

public class Driver 
{
    public static void main (String [] args )
    {
        /*********************************************************************
         * The data used for each shape is listed as follows:                *
         *                  ( x, y, z )                                      *
         *                                                                   *
         * Sphere :         ( 2, -5, 8 )    radius: 13                       *
         * Parallelepiped:  ( 7, 9, 2 )     length: 37  width: 12  height: 9 *
         * Cylinder:        ( 3, 4, -5 )    radius: 11  height: 13           *
         * Cone:            ( -5, -2, 1)    radius: 10  height: 14           *
         *                                                                   *
         *********************************************************************/
        
        // an array of 4 shapes
        
        Shape[] shapes = {new Sphere( 2, -5, 8, 13 ),
                          new Parallelepiped( 7, 9, 2, 37, 12, 9 ),
                          new Cylinder( 3, 4, -5, 11, 13 ),
                          new Cone( -5, -2, 1, 10, 14 )};
        
        // print the actual class of each shape including their data
        
        for ( Shape a : shapes)
        {
             System.out.println(a.toString() );
             System.out.println("Surface Area: " + a.surfaceArea());
             System.out.println("Volume: " + a.volume() + "\n");
        
        }
        
        // sort the list
        
        Arrays.sort(shapes);
        
        // display all shapes with corresponding volumes in ascending order
        
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getName());
            System.out.println("Volume: " + shape.volume());
            System.out.println();
        }
        
        // sort the list once again by distance from the center
        
        Arrays.sort(shapes, new ShapeComparator());
        
        for ( Shape b : shapes)
        {
            System.out.println(b.getClass().getName());
            System.out.println("Distance from Origin: " 
                 + b.distanceFromOrigin() + "\n");
        }
        
    }
}   // end of Driver definitions 
