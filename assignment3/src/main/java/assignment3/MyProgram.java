package assignment3;
import java.io.*;
import java.util.*; 
import java.util.Scanner;

import java.io.File; 
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.io.BufferedWriter; 
import java.io.FileWriter; 
import java.io.PrintWriter;
import java.lang.invoke.SwitchPoint;


public class MyProgram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeSet<String> tS=new TreeSet<String>();
		//tS.add(args[0]);
		
		 try {
        		      File myObj = new File(args[0]);
        		      Scanner obj_reader = new Scanner(myObj);
        		      while (obj_reader.hasNextLine()) 
        		      {
        		        String Line_data = obj_reader.nextLine();
        		        tS.add(Line_data);
        		       // System.out.println(Line_data);
        		      }
        		      
        		      obj_reader.close(); 
        		    } 
        	   
        	         catch (FileNotFoundException e) 
        	         {
        		      System.out.println("Error occur while creating file!");
        		      e.printStackTrace();
        		    }
		
		 
		 
		System.out.println("Choose any option from the Following ");
		System.out.println("Enter 1: For Displaying BST build from Vocabulary File ");
		System.out.println("Enter 2: For Displaying Vector build from Input File ");
		System.out.println("Enter 3: For Viewing Match Words and its Frequency ");
		System.out.println("Enter 4: For Searching a query - It should Display all the Files query found ");
		System.out.println("Enter 5: For Exiting!  ");
		
		Scanner scanr=new Scanner(System.in);
		int choice=scanr.nextInt();
		
		switch (choice) 
		{
		 case 1:
		 {
			 //Vocabulary vocabulary=new Vocabulary();
			 Thread t=new Thread();
			 t.start(); 
			 for(String value : tS)
			 { 
			   System.out.println();	 
			   System.out.print("         "+ value + "                                                                             ");	 
			   System.out.println();
			 }
			 
			break;
		 }
		 
		 case 2:
		 {
		     Vector<String> vec_obj=new Vector<String>();
		  
		   try {
        		      File myObj2 = new File(args[1]);
        		      Scanner obj_reader2 = new Scanner(myObj2);
        		      while (obj_reader2.hasNextLine()) 
        		      {
        		        String Line_data2 = obj_reader2.nextLine();
        		        //tS.add(Line_data2);
        		       // System.out.println(Line_data);
        		        
        		        String WordsArray[]= Line_data2.split(" ");
        		        //traverse
        		         for(String Word_arr:WordsArray)
        		         {
        		          //System.out.println(Word_arr);
        		        	 vec_obj.add(Word_arr);
        		         }
        		         
        		         
        		      }
        		      
        		    System.out.println("Elements are: "+vec_obj);
        		      obj_reader2.close(); 
        		    } 
        	   
        	         catch (FileNotFoundException e) 
        	         {
        		      System.out.println("Error occur while creating file!");
        		      e.printStackTrace();
        		    }
		   
		   	 
	      break;		 
		 }
		default:
		{
			System.out.println("You enter wrong choice! ");
			break;
		}
		
		}      //switch end
		

	}

}
