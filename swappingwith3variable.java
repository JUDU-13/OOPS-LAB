package helloworld;
import java.util.Scanner;
public class swapping 
	{
	public static void main(String[] args)
		{
		int x,y, t;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values to be swapped");
		x=scan.nextInt();
		y=scan.nextInt();
		t=x;
		x=y;
		y=t;
		System.out.println("Number after swapping x="+x+"and y="+y);
		}
}
