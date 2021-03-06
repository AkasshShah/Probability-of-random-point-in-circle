import java.util.*;
import java.io.*;
public class PoinInACircle{
   public static double randNumber(double r){
      double z=((int) r)+1;
      double rand=(Math.random()*2*r)-r;//creates a double from -r(inclusive) to r(exclusive). need to make upper bound inclusive
      return(rand);
   }
   public static void main(String[] args){
      double radius=1;
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter radius of circle");
      radius=scan.nextDouble();
      System.out.println("There is a circle with the equation x^2+y^2="+Math.pow(radius,2)+". This program will generate a random point that lies in a square that has a length of "+(2*radius)+" and see if it is within this circle.");
      System.out.println("The probability that the point is withing the circle is(in percent) "+(100*((Math.pow(radius,2)*Math.PI)/(4*Math.pow(radius,2)))));
      int count=0;
      System.out.println("How many times do you want to repeat finding points in circle?");
      double x,y;
      Scanner scan1=new Scanner(System.in);
      int repeat=scan1.nextInt();
      for(int i=0;i<repeat;i++){
         x=randNumber(radius);
         y=randNumber(radius);
         System.out.println("The point in consideration is ("+x+", "+y+")");
         if(Math.pow(x,2)+Math.pow(y,2)<=Math.pow(radius,2)){
            count++;
         }
      }
      System.out.println("The number of times the point in consideration was inside the circle was "+count);
      double countByRepeat=((double) (count*1000))/((double) (repeat*1000));
      System.out.println(count+"/"+repeat+"="+countByRepeat);
   }
}