
package practice1;
import java.util.*;

public class anagram {
    public static void main(String[] args){
  Scanner in=new Scanner(System.in);
  System.out.println("Enter two strings");
  String a,b;
  a=in.nextLine();
  b=in.nextLine();
  
  
     List<Character>alist = new ArrayList<>();
    List<Character>blist = new ArrayList<>();
    for(int i=0;i<a.length();i++){alist.add(a.toLowerCase().charAt(i));}
    for(int i=0;i<b.length();i++){blist.add(b.toLowerCase().charAt(i));}
  Collections.sort(alist);
  Collections.sort(blist);
  if(alist.equals(blist))
  {
      System.out.println("anagram");
  }
  else { System.out.println("LOL");
  }
   
}}
