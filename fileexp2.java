package javacode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class fileexp2 
 {
  public static void main(String[] args) throws FileNotFoundException,IOException 
   {
    Scanner sc=new Scanner(System.in);
	int i=0;
	String word;
	File fo = new File("text.txt");
		
	  if(fo.exists())
			System.out.println("File Exists");
	  else
			System.out.println("File Created ");
	  
	FileOutputStream fi=new FileOutputStream("text.txt");
	System.out.print("\nEnter the sentence: ");
	word=sc.nextLine();
	byte[] Word=word.getBytes();
	fi.write(Word);
	fi.flush();
	fi.close();
	FileInputStream file=new FileInputStream("text.txt");
	System.out.print("The entered sentence is: ");
	
	  while((i=file.read())!=-1)
	   {
		System.out.print((char) i);
	   }
	
	 file.close();
	 sc.close();
	}
 }
