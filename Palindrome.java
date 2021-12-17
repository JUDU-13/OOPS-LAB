package helloworld;
import java.util.Scanner;
public class Palindrome
 {
	public static void main(String[] args)
		{ 
		  String o, r="";  
		  int l,i;
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a value or word to check");  
	      o = in.next();   
	       l = o.length();   
	      for ( i = l-1; 0<=i; i-- )  
	         r = r + o.charAt(i);  
	      if (o.equals(r))  
	         System.out.println("It is a palindrome.");  
	      else  
	         System.out.println("It is not a palindrome.");   
			}  
 }
	


