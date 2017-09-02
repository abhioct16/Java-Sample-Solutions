/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;
import java.util.*;
/**
 *
 * @author Abhishek Srivastava
 */
public class armstrong {
   public static void main(String[] args){
       int n;
       System.out.println("Enter number");
       Scanner in= new Scanner(System.in);
        n=in.nextInt();
       int r,sum=0,x=n;
       do
       {
           r=n%10;
           sum=sum+r*r*r;
           n=n/10;
           
       }
       while(n>0);
       if(sum==x)
           System.out.println("Yes");
       else
                      System.out.println("no");

   }
    
}
