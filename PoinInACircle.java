import java.util.*;
import java.io.*;
public class PoinInACircle{
   public static double randNumber(){
      double rand=(Math.random()*2)-1;//creates a double from -1 to 1
      return(rand);
   }
   public static void main(String[] args){
      System.out.println("There is a circle with the equation x^2+y^2=1. This program will generate a random point and see if it is within this circle.");
      System.out.println("The probability that the point is withing the circle is(in percent) "+(100*(Math.PI/4)));
      int count=0;
      double x,y;
      int repeat=100;
      for(int i=0;i<repeat;i++){
         x=randNumber();
         y=randNumber();
         //System.out.println("The point in consideration is ("+x+", "+y+")");
         if(Math.pow(x,2)+Math.pow(y,2)<=1){
            count++;
         }
      }
      System.out.println("The number of times the point in consideration was inside the circle was "+count);
      double countByRepeat=((double) (count*1000))/((double) (repeat*1000));
      System.out.println(count+"/"+repeat+"="+countByRepeat);
   }
}