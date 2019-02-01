
package cent;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dawid
 */
public class Centroid {
    double x;
    double y;
    char kolor;
    double sumToSrX;
    double sumToSrY;
    double licznik;
    boolean zmieniono;
    
    
        public Centroid(double x, double y, char kolor)
    {
        this.x=x;
        this.y=y;
        this.kolor=kolor;
        this.sumToSrX=0;
        this.sumToSrY=0;
        this.licznik=0;
        zmieniono=false;
        
    }
        public void nap()
    {
        System.out.println("x: "+x+" y: "+y);
    }
       
}
