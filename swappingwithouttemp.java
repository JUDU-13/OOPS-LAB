package helloworld;
import java.util.Scanner;
public class Swappingwithtwovaribales 
	{
	public static void main(String[] args)
	  {
		int x,y, t;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values to be swapped");
		x=scan.nextInt();
		y=scan.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Number after swapping x="+x+"and y="+y);

	  }
	}
