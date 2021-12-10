package helloworld;
import java.util.Scanner;
public class C2
{

	public static void main(String[] args) 
	{
		int x,y,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		x= sc.nextInt();	
		y= sc.nextInt();	
		s=x+y;
		System.out.println("The number is "+s);
	}

}
