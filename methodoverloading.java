package javacode;
import java.util.Scanner;

class method
 {
  void calcarea(float base,float height)
    {
     double area=0.5*base*height;
     System.out.println("Area of Triangle with base "+base+" and height "+height+" is: "+area);
     System.out.print("\n");
    }
    void calcarea(int width,int length)
    {
     double area=width*length;
     System.out.println("Area of Rectangle with width "+width+" and length "+length+" is: "+area);
     System.out.print("\n");
    }
    void calcarea(float r)
    {
     double area=3.14*r*r;
     System.out.println("Area of Circle with radius "+r+" is: "+area);
     System.out.print("\n");
        
    }
  }
 public class methodOverloading
   {
    public static void main(String[] args)
    {
     float b,trih,r,w,h;
     method ob=new method();
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the Base of the Triangle\n");
     b=sc.nextFloat();
     System.out.print("Enter the Height of the Triangle\n");
     trih=sc.nextFloat();
     System.out.print("Enter the width of the Rectangle\n");
     w=sc.nextFloat();
     System.out.print("Enter the Height of the Rectangle\n");
     h=sc.nextFloat();
     System.out.print("Enter the Radius of the Circle\n");
     r=sc.nextFloat();
     ob.calcarea(w,h);
     ob.calcarea(b,trih);
     ob.calcarea(r);
    }
  }
