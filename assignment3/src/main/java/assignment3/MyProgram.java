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


public class MyProgram extends Thread
{
	public String strname;
	
	//public Vector<String> vec_obj=new Vector<String>();
	
	public void setstrname(String fname) 
	 {
		strname=fname;	 
	 }
	 
	 public String getstrname() 
	 {
		 return strname;
	 }
	 
	public void run() 
	  {
	    System.out.println("Displaying BST from run thread : ");
	    String filname;
	    filname=strname;
	    /*
	     Vector<String> vec_obj=new Vector<String>();
	    try {
		      File myObj2 = new File(filname);
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
		    */
	    
	    
	  }
	
 
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		MyProgram obj=new MyProgram();
		TreeSet<String> tS=new TreeSet<String>();
		//tS.add(args[0]);
		int counter=0;
		int Length = args. length;
		
		System.out.println();
		System.out.println("The total number of files Passing is ! "+Length);
		
		System.out.println("The Names of the Passing files is ! ");
		
		for(int i=0;i<Length;i++)
		{
			System.out.println(args[i]);
			
		}

		
	    MyProgram T_Array[]=new MyProgram[Length];
	    
	    for(int i=1;i<Length;i++)
	    {
	     String fname=args[i];
	     
	     T_Array[i]=new MyProgram();
	     obj.setstrname(fname);	
	    // T_Array[i].start();
	     
	    }
	    
	   // for(int i=1;i<Length;i++)
	    //{
	    	T_Array[1].start();
	   // }	
	    	//String strLen=
	    	int strsize=0;
	        	try {
        		      File myObj = new File(args[0]);
        		      Scanner obj_reader = new Scanner(myObj);
        		      while (obj_reader.hasNextLine()) 
        		      {
        		        String Line_data = obj_reader.nextLine();
        		        strsize++;
        		      //  tS.add(Line_data);
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
			 //strArrayBst[0]=" 10:00AM ";
			 String [] strArrayBst=new String [strsize];
			 
			 try {
   		      File myObj = new File(args[0]);
   		      Scanner obj_reader = new Scanner(myObj);
   		      int i=0;
   		      while (obj_reader.hasNextLine()) 
   		      {
   		        String Line_data = obj_reader.nextLine();
   		        strArrayBst[i]=Line_data; 
   		        tS.add(Line_data);
   		        i++;
   		       // System.out.println(Line_data);
   		      }
   		      
   		     
   		      obj_reader.close(); 
   		  //    for(int j=0;j<strsize;j++)
   		    //  {
   		  //  	System.out.println(strArrayBst[j]);
   		    //  }
   		      
   		      
   		    } 
   	   
   	         catch (FileNotFoundException e) 
   	         {
   		      System.out.println("Error occur while creating file!");
   		      e.printStackTrace();
   		    }
			 
			 for(String value : tS)
			 { 
			   System.out.println();	 
			   System.out.print("         "+ value + "     ");	 
			   System.out.println();
			 }
			 
			break;
		 }
		 
		 case 2:
		 {
		     Vector<String> vec_obj=new Vector<String>();
		  
		   try {   
			       int sizevec_str=0;
			       int k=0;
			       //String [] StrArray2;
			       String [] StrArray2=new String [1000];
			        for(int i=1;i<Length;i++)
			        {   	 
        		      File myObj2 = new File(args[i]);
        		      Scanner obj_reader2 = new Scanner(myObj2);
        		      while (obj_reader2.hasNextLine()) 
        		      {
        		        String Line_data2 = obj_reader2.nextLine(); 
        		        //tS.add(Line_data2);
        		       // System.out.println(Line_data);
        		        
        		        String WordsArray[]= Line_data2.split(" ");
        		        
        		       // StrArray2[]=WordsArray[];
        		        //traverse
        		         for(String Word_arr:WordsArray)
        		         {
        		          //System.out.println(Word_arr);
        		        	 StrArray2[k]=Word_arr;
        		        	 vec_obj.add(Word_arr);
        		        	 k++;
        		         }
        		         
        		           
        		         
        		      }
        		      sizevec_str=StrArray2.length;
        		      System.out.println(sizevec_str);
        		  //  System.out.println("Elements are in file : "+args[i]+"   "+vec_obj);
        		      obj_reader2.close(); 
        		      
        		    }
			        
			          // for(int j=0;j<sizevec_str;j++)
			   		    //  {
			   		    	//System.out.println(StrArray2[j]);
			   		     // }
			        
			         System.out.println("Elements in Inputfiles : "+vec_obj);
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