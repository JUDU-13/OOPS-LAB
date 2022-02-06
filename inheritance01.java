package javacode;
import java.util.Scanner;

 class EmployeeEng
   {
    int BasicSal,TravAll,DearAll,GrossSal;
    EmployeeEng(int BasicSal, int TravAll, int DearAll)
      {
       this.BasicSal = BasicSal;
       this.TravAll = TravAll;
       this.DearAll = DearAll;
       GrossSal = BasicSal+TravAll+DearAll;
       System.out.println("Salary of employee: "+GrossSal);
      }
    void display()
     {
	  System.out.println("Name of class is Employee");
     }
    }

  class Engineer extends EmployeeEng
    {
     Engineer(int BasicSal, int TravAll, int DearAll)
      {
       super(BasicSal,TravAll,DearAll);
      }
     void display()
      {
       System.out.println("Name of class is Engineer");
      }
     void calcSalary()
      {
       System.out.println("Salary of engineer:"+(2*(BasicSal+TravAll+DearAll)));
       super.display();
      }
    }

 public class Inheritance_01
  {
   public static void main(String[] args) 
   {
    int BasicSal,TravAll,DearAll;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Basic Salary: ");
    BasicSal = sc.nextInt();
    System.out.print("Enter Travel Allowance: ");
    TravAll= sc.nextInt();
    System.out.print("Enter Dearness Allowance: ");
    DearAll = sc.nextInt();
    Engineer eng = new Engineer(BasicSal, TravAll, DearAll);
    eng.display();
    eng.calcSalary();
   }
  }
