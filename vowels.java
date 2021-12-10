package helloworld;
import java.util.Scanner;
public class vowels 
	{
	 public static void main(String[] args)
	 	{
		 char x;
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the alphabet");
			x = scan.next().charAt(0);
		     if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' ||x=='A' || x=='E' || x=='I' || x=='O' || x=='U')
		     	{        
		    	 System.out.println(" It is a Vowel.");
		     	}
		     else
		     	{
		    	 System.out.println(" It is a Consonant.");
		     	}
	 	}
	}
