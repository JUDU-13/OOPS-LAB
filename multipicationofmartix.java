package helloworld;
import java.util.Scanner;
public class Matrixmutiplication 
	{
		public static void main(String[] args)
			{
				int r1,r2,c1,c2,s=0,i,j,k;
			    Scanner sc=new Scanner(System.in);
			    System.out.println("Enter the number of rows in the first matrix:");
			    r1=sc.nextInt();
			    System.out.println("Enter the number of columns in the first matrix:");
			    c1=sc.nextInt();
			    int m1[][]=new int[r1][c1];
			    System.out.println("Enter the elements of first matrix");
			     for(i=0;i<r1;i++)
			        {
			            for(j=0;j<c1;j++)
			            m1[i][j]=sc.nextInt();
			        }
			    System.out.println("Enter the number of rows in the second matrix:");
			    r2=sc.nextInt();
			    System.out.println("Enter the number of columns in the second matrix:");
			    c2=sc.nextInt();   
			    int m2[][]=new int[r2][c2];
			        if(r2==c1)
			        	{
			        		System.out.println("Enter the elements of second ");
			        			for(i=0;i<r2;i++)
			        				{
			        					for(j=0;j<c2;j++)
			        						m2[i][j]=sc.nextInt();
			        				}
			        			System.out.println("The first matrix is:\n");
			        				for(i=0;i<r1;i++)
			        					{
			        						for(j=0;j<c1;j++)
			        						System.out.print(m1[i][j]+"\t");
			        						System.out.print("\n");
			        					}
			        			System.out.println("The second matrix is:\n");
			        				for(i=0;i<r2;i++)
			        					{
			        						for(j=0;j<c2;j++)
			        							System.out.print(m2[i][j]+"\t");
			        							System.out.print("\n");
			        					}
			        	}
			        		if(c1!=r2)
			        			{
			        				System.out.println("Matrix Multiplication is not possible");
			        			}
			        		else
			        			{
			        				int p[][]=new int[r1][c2];
			        				for(i=0;i<r1;i++)
			        					{
			        						for(j=0;j<c2;j++)
			        							{
			        								for(k=0;k<r2;k++)
			        								s=s+m1[i][k]*m2[k][j];
			        								p[i][j]=s;
			        								s=0;
			        							}
			        					}
			        System.out.println("The product matrix is:\n");
			             for(i=0;i<r1;i++)
			             	{
			                 for(j=0;j<c2;j++)
			                 System.out.print(p[i][j]+"\t");
			                 System.out.print("\n");
			             	}	
			      }	
		  	}
		}
			         

