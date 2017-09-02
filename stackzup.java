/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

/**
 *
 * @author Abhishek Srivastava
 */
import java.util.*;
public class stackzup {

 

   public static void main(String args[]) {
      Stack st = new Stack();
      System.out.println("stack: " + st);
     System.out.println(st.empty());
      st.push(40);
     System.out.println(st.search(5));
     System.out.println("Number is "+st.peek());
     
      
   }
}
