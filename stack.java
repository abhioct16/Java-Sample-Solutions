package practice1;

import java.util.*;
public class stack {
     int top = -1;
    int arr[]=new int[5];
     int max=5;
   public void push(int number)
   {
      if (top==(max-1))
      {
       
   
           System.out.println("stack is full");
   }  
   else
      {
      top=top+1;
      arr[top]=number;
      System.out.println("number is added"+number);
   }}
   public void pop()
   {
       if (top==-1)
  System.out.println("stack is empty");
       else
             System.out.println("number removed is "+arr[top]);
           top=top-1;
     
           }
   
   public static void main(String[] args) {
        stack mystack=new stack();
       mystack.push(10);
       mystack.push(3);
       mystack.push(7);
       mystack.push(1);
       mystack.push(5);
        mystack.push(78);
         mystack.pop();
          mystack.pop();
           mystack.pop();
            mystack.pop();
             mystack.pop();
              
              
         
   
      }}