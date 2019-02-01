
package cent;

/**
 *
 * @author Dawid
 */
public class Punkt {

    double x;
    double y;
    char kolor;
    double dist;
    
    
    public Punkt(double x, double y, char kolor)
    {
        this.x=x;
        this.y=y;
        this.kolor=kolor;
        
        
    }
    public void setKolor(char c)
    {
        this.kolor=c;
        
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public void setDist(double x) {
        this.dist=x;
    }
    
    public void nap()
    {
        System.out.println("x: "+x+" y: "+y+" kolor: "+ kolor);
    }
}
