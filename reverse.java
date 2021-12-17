package helloworld;
import java.util.Scanner;
public class reverse
 {
	public static void main(String[] args)
		{ 
		  String o, r="";  
		  int l,i;
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a value or word to reverse");  
	      o = in.next();   
	       l = o.length();   
	      for ( i = l-1; 0<=i; i-- )  
	       {   
	    	  r = r + o.charAt(i);  
	       }
	      System.out.println("After reversing "+r);
		}
	}
