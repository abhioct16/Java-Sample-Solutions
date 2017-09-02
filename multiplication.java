/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;


import java.util.*;
public class multiplication {
    public static void main(String[] args)
    {
        int[][] a= new int[3][3];
         Scanner in=new Scanner(System.in);
        System.out.println("enter 3*matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
    
    }
    
}
