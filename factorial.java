package practice1;

import java.util.Scanner;
public class factorial {
  
    public static void main(String[] args) {
        Double a,b,z;
        Double c,d;
    
  Scanner in=new Scanner(System.in);
  System.out.println("enter number");
 a= in.nextDouble();
 b= in.nextDouble();
 z= in.nextDouble();
  c= average(a,b);
 d=average(a,b,z);
 System.out.println(c);
 System.out.println(d);
    }
 public static double average(double e,double f)
 {
 double x;
 x=(e+f)/2.0;
 return x;
  }
 public static double average(double e,double f,double g)
 {
    double y;
 y=(e+f+g)/3.0;
 return y; 
 }
}