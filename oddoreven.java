package helloworld;
import java.util.Scanner;
public class oddoreven 
   {
     public static void main(String[] args) 
      {
    	int x;
 		Scanner scan=new Scanner(System.in);
 		System.out.println("Enter the value to check");
 		x=scan.nextInt();
        if(x%2==0)
          {
        	System.out.println("This is a even number "+x);
          }
        else
        {
        	System.out.println("This is a odd number "+x);
        }
      }
   }
