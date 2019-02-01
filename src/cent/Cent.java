
package cent;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dawid
 */
public class Cent {

    
   
    
    
    
    public static void main(String[] args) {
       
      List<Punkt> punkty = new  ArrayList<>();
      List<Centroid> centroidy = new  ArrayList<>();
      Punkt tmp;
      double temp;
      boolean end=false;
      
      
      
      
      punkty.add(new Punkt(171.39406,69.48498,'s'));
      punkty.add(new Punkt(103.43978,162.3329,'s'));
      punkty.add(new Punkt(-56.44943,-69.29827,'s'));
      punkty.add(new Punkt(8.946941,163.05267,'s'));
      punkty.add(new Punkt(-126.42041,11.656335,'s'));
      punkty.add(new Punkt(112.04775,55.792885,'s'));
      punkty.add(new Punkt(-110.54896,-92.301605,'s'));
      punkty.add(new Punkt(-122.07462,-63.049244,'s'));
      punkty.add(new Punkt(50.02793,-78.852905,'s'));
      punkty.add(new Punkt(-144.9896,-102.07811,'s'));
      punkty.add(new Punkt(132.33275,3.6434205,'s'));
      punkty.add(new Punkt(3.888258,-184.86417,'s'));
      punkty.add(new Punkt(96.34481,178.96266,'s'));
      punkty.add(new Punkt(-105.34451,-82.28869,'s'));
      punkty.add(new Punkt(-36.805817,80.20109,'s'));
      punkty.add(new Punkt(28.560175,46.042305,'s'));
      punkty.add(new Punkt(138.9394,98.77133,'s'));
 
 
      centroidy.add(new Centroid(-185.0268,123.22421,'r'));
      centroidy.add(new Centroid(-79.53156,131.56772,'g'));
 

      
      
      
      
      for(int i=0;i < punkty.size();i++)
      {
          punkty.get(i).setKolor(centroidy.get(0).kolor);
          punkty.get(i).setDist(Math.sqrt((Math.pow(centroidy.get(0).x-punkty.get(i).x,2)+Math.pow(centroidy.get(0).y-punkty.get(i).y, 2))));
          
      }
      
      
     while(end!=false);
     {
      end=false;
      for(int i=0;i < punkty.size();i++)
      {
          
          for(int j= 0; j< centroidy.size();j++)
          {
             
             temp= Math.sqrt((Math.pow(centroidy.get(j).x-punkty.get(i).x,2)+Math.pow(centroidy.get(j).y-punkty.get(i).y, 2)));
             if(temp < punkty.get(i).dist)
             {
                 
                 punkty.get(i).setDist(temp);
                 punkty.get(i).setKolor(centroidy.get(j).kolor);
                 centroidy.get(j).zmieniono=true;
             }
             
            
          }
      }
      
      // Srednie
      for(int c=0;c<centroidy.size();c++)
      {
          
        for(int i=0;i<punkty.size();i++)
        {
          if(punkty.get(i).kolor==centroidy.get(c).kolor)
          {
              centroidy.get(c).sumToSrX+=punkty.get(i).getX();
              centroidy.get(c).sumToSrY+=punkty.get(i).getY();
              centroidy.get(c).licznik++;
              
          }
        }
        if(centroidy.get(c).licznik!=0)
        {
            centroidy.get(c).sumToSrX=centroidy.get(c).sumToSrX/centroidy.get(c).licznik;
            centroidy.get(c).sumToSrY=centroidy.get(c).sumToSrY/centroidy.get(c).licznik;
            centroidy.get(c).x=centroidy.get(c).sumToSrX;
            centroidy.get(c).y=centroidy.get(c).sumToSrY;
            centroidy.get(c).licznik=0;
            centroidy.get(c).nap();
        }
    
      }
      
      for(int c=0;c<centroidy.size();c++)
      {
          if(centroidy.get(c).zmieniono==true)
          {
              end=true;
          }
          else
          {
              end=false;
          }
          
      }
      
      
         
         
     }

      for(int i=0;i < punkty.size();i++)
      {
         punkty.get(i).nap();
          
      }

      
 
    }
    
}
