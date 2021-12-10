package helloworld;
  import java.util.Scanner;
  	public class LARGESTNUMBER 
  		{
  			public static void main(String[] args) 
  				{
  				  int x,y,z;
  				  Scanner sc=new Scanner(System.in);
  				  System.out.println("Enter a numbers");
  			    	x= sc.nextInt();	
  				    y= sc.nextInt();	
  				    z= sc.nextInt();
  			       	if(x<y&&z<y)
  				     {
  				    	System.out.println("The largest number is "+y);
  				     }
  				    else if(y<x&&z<x)
  				     	{
  				    	 System.out.println("The largest number is "+x);
  				     	}
  				    else
  				    	{
  				    	System.out.println("The largest number is "+z);
  				    	}
  				}

  		}
