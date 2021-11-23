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
	public class vocabulary extends Thread
	{                        
		      //This thread is use to Make BST from Vocabulary file 
		     //and then Store BST in String array 
		public void run() 
		  {
		    System.out.println("Displaying BST from run thread : ");
		    String filname1;
		    filname1=strname;
		                     //Make BST using TreeSet
		    TreeSet<String> tS=new TreeSet<String>();         //Make object of TreeSet
		      
		     int strsize=0;         //this variable contains the size of Vocabulary.txt
	    	 int k_size=0;
	        	try {
        		      File myObj = new File("Vocabulary.txt");
        		      Scanner obj_reader = new Scanner(myObj);       //make object of scanner  
        		      while (obj_reader.hasNextLine())          //Read Vocabulary.txt file at the end of file position
        		      {
        		        String Line_data = obj_reader.nextLine();     //Get data line by Line
        		        strsize++;
        		      
        		      }
        		                                           //close the object of scanner
        		      obj_reader.close(); 
        		    } 
        	                                     //If the file does not open
        	         catch (FileNotFoundException e) 
        	         {
        		      System.out.println("Error occur while creating file!");
        		      e.printStackTrace();
        		    }
		
	    String [] strArrayBst=new String [strsize];   
	    
	    String [] StrArray2=new String [200];
	    
	    try {
 		      File myObj = new File("Vocabulary.txt");
 		      Scanner obj_reader = new Scanner(myObj);
 		      int i=0;
 		      while (obj_reader.hasNextLine())            //Read Vocabulary.txt file at the end of file position
 		      {
 		        String Line_data = obj_reader.nextLine();          //Get data line by Line
 		        strArrayBst[i]=Line_data; 
 		        tS.add(Line_data);                       //Store the string in the TreeSet
 		        i++;
 		       
 		      }
 		      
 		                                   //close the object of scanner
 		      obj_reader.close(); 
 		      
 		    } 
	                                         //If the file does not open
 	         catch (FileNotFoundException e) 
 	         {
 		      System.out.println("Error occur while creating file!");
 		      e.printStackTrace();
 		    } 
		      
		      
		      
		      
		    
		    
		  } 
	}
	
	public class inputfile extends Thread
	{
		public void run()        //This thread is use to make vector and store them from input files
		  {
		    System.out.println("Displaying InputFile from run thread : ");
		    String filname2;
		    filname2=strname;
		    
		  } 
	}
	
	public String strname;
	                           //This setter is use to set the name of files receive from terminal 
	public void setstrname(String fname) 
	 {
		strname=fname;	 
		
	 }
	                 //This getter is use to get the File name
	 public String getstrname() 
	 {
		 return strname;
	 }
	 
	 
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		MyProgram obj=new MyProgram();      //make object of MyProgram class 
		TreeSet<String> tS=new TreeSet<String>();       //make object of TreeSet class 
		
		int counter=0;
		int Length = args. length;      //Find the length of arguments to be passed by terminal
		
		
		System.out.println();
		                                    
		System.out.println("|------------------------------------------------------------|");
   	    System.out.println("|                                                            |");
   	    System.out.println("|                 Welcome To Multi Threading                 |");  
   	    System.out.println("|                                                            |");
   	    System.out.println("|                      Assignment                            |");
   	    System.out.println("|                                                            |");
   	    System.out.println("|       The total number of files Passing is  ! "+Length+"            |");
   	    System.out.println("|                                                            |");
   	    System.out.println("|        The Names of the Passing files is !                 |");
   	    System.out.println("|                                                            |");
   	    System.out.println("|------------------------------------------------------------|");
   	    
	
		          //Display the Files names
		for(int i=0;i<Length;i++)
		{
			System.out.println("         "+args[i]+"         ");
			
		}

		     //Make the Array and store the files names
	    MyProgram T_Array[]=new MyProgram[Length];
	                 
	           //Iterate the loop to the number of input files
	    for(int i=1;i<Length;i++)
	    {
	     String fname=args[i];
	     
	     T_Array[i]=new MyProgram();
	     obj.setstrname(fname);	
	    // T_Array[i].start();
	     
	    }
	    
	    	//T_Array[1].start();
	   
	    	int strsize=0;
	    	 int k_size=0;
	        	try {                   
	        	                    	//Read file to the end of file position
        		      File myObj = new File(args[0]);
        		      Scanner obj_reader = new Scanner(myObj);
        		      while (obj_reader.hasNextLine()) 
        		      {
        		        String Line_data = obj_reader.nextLine();           //Get data line by Line
        		        strsize++;
        		      
        		      }
        		      
        		      obj_reader.close(); 
        		    } 
        	                         //If file does not exist
        	         catch (FileNotFoundException e) 
        	         {
        		      System.out.println("Error occur while creating file!");
        		      e.printStackTrace();
        		    }
		                        //Create the String Array to the size of vocabulary.txt file
	    String [] strArrayBst=new String [strsize];   
	    
	  //Create the String Array For input files
	    String [] StrArray2=new String [200];
	    
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
 		       
 		      }
 		      
 		     
 		      obj_reader.close(); 
 		      
 		    } 
 	   
 	         catch (FileNotFoundException e) 
 	         {
 		      System.out.println("Error occur while creating file!");
 		      e.printStackTrace();
 		    }
	    
	    //Make vector to store the tokenize strings of Input files
	    
	    Vector<String> vec_obj=new Vector<String>();
	    
	    try {   
		       int sizevec_str=0;
		         
		         //iterate the loop to the number of input Files
		        for(int i=1;i<Length;i++)
		        {   	 
 		          File myObj2 = new File(args[i]);
 		          Scanner obj_reader2 = new Scanner(myObj2);
 		          while (obj_reader2.hasNextLine()) 
 		               {
 		                 String Line_data2 = obj_reader2.nextLine(); 
 		       		        
 		                 String WordsArray[]= Line_data2.split(" ");
 		        
 		                for(String Word_arr:WordsArray)
 		                   {
 		          
 		        	         StrArray2[k_size]=Word_arr;
 		        	         vec_obj.add(Word_arr);
 		        	
 		        	         k_size++;
 		                   }
 		         		           
 		                }
 		  
 		            obj_reader2.close(); 
 		      
 		         }
		        
		        
	         }      //End of try block
	         
	          //If file Does not open or any exception occur
 	         catch (FileNotFoundException e) 
 	         {
 		      System.out.println("Error occur while creating file!");
 		      e.printStackTrace();
 		    }
	    
	             //variable choice is to take input of choice of user 
	    int choice;
	                   //Make object of Scanner for input
	    Scanner scanr=new Scanner(System.in);
	    
	    try 
	    {
	    	
	    System.out.println("|------------------------------------------------------------------------------------------|");
   	    System.out.println("|                                         MENU                                             |");
   	    System.out.println("|                                                                                          |");
   	    System.out.println("|                            Choose any option from the Following!                         |");  
   	    System.out.println("|                                                                                          |");
   	    System.out.println("|             Enter 1: For Displaying BST build from Vocabulary File                       |");
   	    System.out.println("|                                                                                          |");
   	    System.out.println("|             Enter 2: For Displaying Vector build from Input File                         |");
   	    System.out.println("|                                                                                          |");
   	    System.out.println("|             Enter 3: For Viewing Match Words and its Frequency                           |");
   	    System.out.println("|                                                                                          |");
   	    System.out.println("|             Enter 4: For Searching a query - It should Display all the Files query found |");
   	    System.out.println("|                                                                                          |");
   	    System.out.println("|             Enter 5: For Exiting!                                                        |");   
    	System.out.println("|                                                                                          |");   
   	    System.out.println("|------------------------------------------------------------------------------------------|");
   	 
		
	    scanr=new Scanner(System.in);
	    choice=scanr.nextInt();
		
	       //If user input wrong choice then throw Exception to enter correct choice
		if(choice<0 || choice>5)
   	      {
   		    throw new Exception();
   	      }

		//switch block run if user enter correct choice(1-5)
		switch (choice) 
		{
		 case 1:
		 {
			 //make object of vocabulary file to call run function for thread 
			 vocabulary obj4 =obj.new vocabulary();
			 obj4.start(); 
			
			 //Loop to Display the Values of BST(which is made by thread) of vocabulary file 
			 //tS is the object of TreeSet class 
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
			 
			 //make object of  input file class to call run function for thread 
			 inputfile obj3=obj.new inputfile();
			 obj3.start(); 
			 
		     System.out.println();  
		      
		     System.out.println("|------------------------------------------------------------------------------------------|");
		     System.out.println("|                                                                                          |"); 
	         System.out.println("|                       Elements in Inputfiles :                                           |");
	         System.out.println("|                                                                                          |");  
	         System.out.println("|------------------------------------------------------------------------------------------|");
	         
	        //Display the Values of Vector(which is made by thread) of Input files 
			 //vec_obj is the object of vector
	         
	         System.out.println("Elements-> "+vec_obj);
		   	 
	        break;		 
		   }
		 
		 case 3:
		 {
			
			 
			 			 
			 int count_var=0;
			 boolean Flg=false;
			 int p=0;
			 int freq=1;
		  
			 //Loop To Find the matched  in Input files and Vocabulary files
			 //and Display the total number of match
			 
			 for(int y=0;y<k_size;)
		     { 
				 //store the each index of string in variable to compare using equals function
			  String str_input=StrArray2[y];
			  String str_bst=strArrayBst[p];
			   
			   if(str_input.equals(str_bst))
			   {
				     System.out.println("|------------------------------------------------------------------------------------------|");
				     System.out.println("|                                                                                          |"); 
			         System.out.println("|                       Words is matched ! : "+str_input+"                                 |");
			         System.out.println("|                                                                                          |");  
			         System.out.println("|------------------------------------------------------------------------------------------|");
			         
				  
				   
				   p++;
				   count_var++;
			   } 
			   
			   else 
			   {
				y++;
				
			   }
			   
			  
		  }
			          
			 System.out.println("|------------------------------------------------------------------------------------------|");
		     System.out.println("|                                                                                          |"); 
	         System.out.println("|                 The Frequency of macthed Words is ! : "+count_var+"                      |");
	         System.out.println("|                                                                                          |");  
	         System.out.println("|------------------------------------------------------------------------------------------|");
	         
		
	         int con=0;
	         int [] freqt=new int [30];
	         
	       //Loop To Find the matched  in Input files and Vocabulary files
		  //and Display the Frequency of each word
	         for(int a=0;a<strsize;a++)
	         {
	           for(int b=0;b<k_size;b++)
	           {
	        	   if(strArrayBst[a].equals(StrArray2[b]))
				   {
	        		   con++;
				   }
	        	   
	           }
	        	 freqt[a]=con;
	        	 con=0;
	         }
			 
	         System.out.println();
	         System.out.println();
	         
	         for(int a=0;a<strsize;a++)
	         {
	        	 System.out.println("The frequency of word -> "+strArrayBst[a]+"  is -> "+freqt[a]);
	         }
	         
	       break;		 
		 }
		 
		 case 4:
		 {   
			 String verify_file;
			 
			 //Query the user to find the files that enter through terminal either it is present or not
			 
			 System.out.println("|------------------------------------------------------------------------------------------|");
		     System.out.println("|                                                                                          |"); 
	         System.out.println("|                         Enter any file name you want to search!                          |");
	         System.out.println("|                         Program tell either it is present or not!                        |");
	         System.out.println("|                                                                                          |");  
	         System.out.println("|------------------------------------------------------------------------------------------|");
			 
			 Scanner Obj1 = new Scanner(System.in); 
			 verify_file = Obj1.nextLine(); 
			 boolean Flag_nam=false;
			 
			 
			 for(int x=0;x<Length;x++)
				{
				   if(verify_file.equals(args[x]))
				   {
					   
					   Flag_nam=true;
				   }
					
				   
				}
			 
			 if(Flag_nam==true)
			 {
				 System.out.println("|------------------------------------------------------------------------------------------|");
			     System.out.println("|                                                                                          |"); 
		         System.out.println("|                                   This file is present!                                  |");
		         System.out.println("|                                                                                          |");  
		         System.out.println("|------------------------------------------------------------------------------------------|");
		         
				
			 }
			 
			 
			 else if(Flag_nam==false)
			 {
				 System.out.println("|------------------------------------------------------------------------------------------|");
			     System.out.println("|                                                                                          |"); 
		         System.out.println("|                                   This file is not present!                              |");
		         System.out.println("|                                                                                          |");  
		         System.out.println("|------------------------------------------------------------------------------------------|");
		         
				
			 }
			 
			//Query the user to find the Word in input files either it is present or not
			 
			 String verify_word;
			 System.out.println("|------------------------------------------------------------------------------------------|");
		     System.out.println("|                                                                                          |"); 
	         System.out.println("|                           Enter Word to Search in Input file !                           |");
	         System.out.println("|                           Program tell either it is present or not in Input file!        |");
	         System.out.println("|                                                                                          |");  
	         System.out.println("|------------------------------------------------------------------------------------------|");
	         
	         
			 
			 
			 Obj1 = new Scanner(System.in); 
			 verify_word = Obj1.nextLine(); 
			 boolean check_flag=false;
			 for(int l=0;l<k_size;l++)
 		      {
				  String str_verify=StrArray2[l];
				  
				   
				   if(verify_word.equals(str_verify))
				   {
					   
				       check_flag=true;  
					    
					 	   
				   } 
				 
 		    	
 		      }
			 
			 if(check_flag==true)
			   {
				   System.out.println("|------------------------------------------------------------------------------------------|");
				   System.out.println("|                                                                                          |"); 
			       System.out.println("|                Entered Word is macthed in Input Files!                                   |");
			       System.out.println("|                                                                                          |");  
			       System.out.println("|------------------------------------------------------------------------------------------|");
				    
			   }
			 
			 else if(check_flag==false)
			   {
				   System.out.println("|------------------------------------------------------------------------------------------|");
				   System.out.println("|                                                                                          |"); 
			       System.out.println("|                Entered Word does not  macthed in Input Files!                            |");
			       System.out.println("|                                                                                          |");  
			       System.out.println("|------------------------------------------------------------------------------------------|");
				    
			   }
			 
		   break;	 
		   
		 }
		 
		 case 5:
		 {
			
			 
			 System.out.println("|------------------------------------------------------------------------------------------|");
		     System.out.println("|                                                                                          |"); 
	         System.out.println("|                           You want to exit the Program !                                 |");
	         System.out.println("|                           so Program exit!                                               |");
	         System.out.println("|                                                                                          |");  
	         System.out.println("|------------------------------------------------------------------------------------------|");
			 System.exit(0);
		     
		 }
		 
		default:
		{
			 System.out.println("|------------------------------------------------------------------------------------------|");
		     System.out.println("|                                                                                          |"); 
	         System.out.println("|                             You enter wrong choice!                                      |");
	         System.out.println("|                                                                                          |");  
	         System.out.println("|------------------------------------------------------------------------------------------|");
	         
			
	         
			break;
		}
		
		}     
		
		//switch end
		
         
	}
	    catch (Exception e) 
	    {
			// TODO: handle exception
	    
	    	//
	    	System.out.println("|------------------------------------------------------------------------------------------|");
	    	System.out.println("|-----------------------------You entered wrong choice !-----------------------------------|");
	    	System.out.println("|-----------------------------Please entered correct choice!-------------------------------|");
	    	System.out.println("|------------------------------------------------------------------------------------------|");
	   	    System.out.println("|                                         MENU                                             |");
	   	    System.out.println("|                                                                                          |");
	   	    System.out.println("|                            Choose any option from the Following!                         |");  
	   	    System.out.println("|                                                                                          |");
	   	    System.out.println("|             Enter 1: For Displaying BST build from Vocabulary File                       |");
	   	    System.out.println("|                                                                                          |");
	   	    System.out.println("|             Enter 2: For Displaying Vector build from Input File                         |");
	   	    System.out.println("|                                                                                          |");
	   	    System.out.println("|             Enter 3: For Viewing Match Words and its Frequency                           |");
	   	    System.out.println("|                                                                                          |");
	   	    System.out.println("|             Enter 4: For Searching a query - It should Display all the Files query found |");
	   	    System.out.println("|                                                                                          |");
	   	    System.out.println("|             Enter 5: For Exiting!                                                        |");   
	    	System.out.println("|                                                                                          |");   
	   	    System.out.println("|------------------------------------------------------------------------------------------|");
	   	 
			
		    scanr=new Scanner(System.in);
		    choice=scanr.nextInt();
			
		    while(choice<0 || choice>5)
	   	       {
		    	System.out.println("|------------------------------------------------------------------------------------------|");
		    	System.out.println("|-----------------------------You entered wrong choice !-----------------------------------|");
		    	System.out.println("|-----------------------------Please entered correct choice!-------------------------------|");
		    	System.out.println("|------------------------------------------------------------------------------------------|");
		   	    System.out.println("|                                         MENU                                             |");
		   	    System.out.println("|                                                                                          |");
		   	    System.out.println("|                            Choose any option from the Following!                         |");  
		   	    System.out.println("|                                                                                          |");
		   	    System.out.println("|             Enter 1: For Displaying BST build from Vocabulary File                       |");
		   	    System.out.println("|                                                                                          |");
		   	    System.out.println("|             Enter 2: For Displaying Vector build from Input File                         |");
		   	    System.out.println("|                                                                                          |");
		   	    System.out.println("|             Enter 3: For Viewing Match Words and its Frequency                           |");
		   	    System.out.println("|                                                                                          |");
		   	    System.out.println("|             Enter 4: For Searching a query - It should Display all the Files query found |");
		   	    System.out.println("|                                                                                          |");
		   	    System.out.println("|             Enter 5: For Exiting!                                                        |");   
		    	System.out.println("|                                                                                          |");   
		   	    System.out.println("|------------------------------------------------------------------------------------------|");
		   	 
				
			    scanr=new Scanner(System.in);
			    choice=scanr.nextInt();
		    	
	   	       }
		    
			

			switch (choice) 
			{
			 case 1:
			 {
				 
				 vocabulary obj5 =obj.new vocabulary();
				 obj5.start();
				
				 
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
				 
				 inputfile obj6=obj.new inputfile();
				 obj6.start(); 
				 
				 System.out.println();  
			      
			     System.out.println("|------------------------------------------------------------------------------------------|");
			     System.out.println("|                                                                                          |"); 
		         System.out.println("|                       Elements in Inputfiles :                                           |");
		         System.out.println("|                                                                                          |");  
		         System.out.println("|------------------------------------------------------------------------------------------|");
		         
		         System.out.println("Elements-> "+vec_obj);
		         
		        break;		 
			   }
			 
			 case 3:
			 {
				
				 
				 int count_var=0;
				 boolean Flg=false;
				 int p=0;
				 int freq=1;
			  
				 for(int y=0;y<k_size;)
			     { 
					 
				  String str_input=StrArray2[y];
				  String str_bst=strArrayBst[p];
				   
				   if(str_input.equals(str_bst))
				   {
					     System.out.println("|------------------------------------------------------------------------------------------|");
					     System.out.println("|                                                                                          |"); 
				         System.out.println("|                       Words is macthed ! : "+str_input+"                                 |");
				         System.out.println("|                                                                                          |");  
				         System.out.println("|------------------------------------------------------------------------------------------|");
				         
					  
					   
					   p++;
					   count_var++;
				   } 
				   
				   else 
				   {
					y++;
					
				   }
				   
				  
			  }
				          
				 System.out.println("|------------------------------------------------------------------------------------------|");
			     System.out.println("|                                                                                          |"); 
		         System.out.println("|                 The Frequency of macthed Words is ! : "+count_var+"                      |");
		         System.out.println("|                                                                                          |");  
		         System.out.println("|------------------------------------------------------------------------------------------|");
		         
			
		         int con=0;
		         int [] freqt=new int [30];
		         for(int a=0;a<strsize;a++)
		         {
		           for(int b=0;b<k_size;b++)
		           {
		        	   if(strArrayBst[a].equals(StrArray2[b]))
					   {
		        		   con++;
					   }
		        	   
		           }
		        	 freqt[a]=con;
		        	 con=0;
		         }
				 
		         System.out.println();
		         System.out.println();
		         
		         for(int a=0;a<strsize;a++)
		         {
		        	 System.out.println("The frequency of word -> "+strArrayBst[a]+"  is -> "+freqt[a]);
		         }
		         
		       break;		 
			 }
			 
			 case 4:
			 {   
				 String verify_file;
				 
				 
				 System.out.println("|------------------------------------------------------------------------------------------|");
			     System.out.println("|                                                                                          |"); 
		         System.out.println("|                         Enter any file name you want to search!                          |");
		         System.out.println("|                         Program tell either it is present or not!                        |");
		         System.out.println("|                                                                                          |");  
		         System.out.println("|------------------------------------------------------------------------------------------|");
				 
				 Scanner Obj1 = new Scanner(System.in); 
				 verify_file = Obj1.nextLine(); 
				 boolean Flag_nam=false;
				 
				 
				 for(int x=0;x<Length;x++)
					{
					   if(verify_file.equals(args[x]))
					   {
						   
						   Flag_nam=true;
					   }
						
					   
					}
				 
				 if(Flag_nam==true)
				 {
					 System.out.println("|------------------------------------------------------------------------------------------|");
				     System.out.println("|                                                                                          |"); 
			         System.out.println("|                                   This file is present!                                  |");
			         System.out.println("|                                                                                          |");  
			         System.out.println("|------------------------------------------------------------------------------------------|");
			         
					
				 }
				 
				 
				 else if(Flag_nam==false)
				 {
					 System.out.println("|------------------------------------------------------------------------------------------|");
				     System.out.println("|                                                                                          |"); 
			         System.out.println("|                                   This file is not present!                              |");
			         System.out.println("|                                                                                          |");  
			         System.out.println("|------------------------------------------------------------------------------------------|");
			         
					
				 }
				 
				 String verify_word;
				 System.out.println("|------------------------------------------------------------------------------------------|");
			     System.out.println("|                                                                                          |"); 
		         System.out.println("|                           Enter Word to Search in Input file !                           |");
		         System.out.println("|                           Program tell either it is present or not in Input file!        |");
		         System.out.println("|                                                                                          |");  
		         System.out.println("|------------------------------------------------------------------------------------------|");
		         
		         
				
				 
				 
				 Obj1 = new Scanner(System.in); 
				 verify_word = Obj1.nextLine(); 
				 boolean check_flag=false;
				 for(int l=0;l<k_size;l++)
	 		      {
					  String str_verify=StrArray2[l];
					  
					   
					   if(verify_word.equals(str_verify))
					   {
						   
					       check_flag=true;  
					 
						 	   
					   } 
					 
	 		    	
	 		      }
				 
				 if(check_flag==true)
				   {
					   System.out.println("|------------------------------------------------------------------------------------------|");
					   System.out.println("|                                                                                          |"); 
				       System.out.println("|                Entered Word is macthed in Input Files!                                   |");
				       System.out.println("|                                                                                          |");  
				       System.out.println("|------------------------------------------------------------------------------------------|");
					   
				       
				       
				   }
				 
				 else  if(check_flag==false)
				   {
					   System.out.println("|------------------------------------------------------------------------------------------|");
					   System.out.println("|                                                                                          |"); 
				       System.out.println("|                Entered Word does not  macthed in Input Files!                            |");
				       System.out.println("|                                                                                          |");  
				       System.out.println("|------------------------------------------------------------------------------------------|");
					   
				       
				       
				   }
				 
			   break;	 
			   
			 }
			 
			 case 5:
			 {
				
				 
				 System.out.println("|------------------------------------------------------------------------------------------|");
			     System.out.println("|                                                                                          |"); 
		         System.out.println("|                           You want to exit the Program !                                 |");
		         System.out.println("|                           so Program exit!                                               |");
		         System.out.println("|                                                                                          |");  
		         System.out.println("|------------------------------------------------------------------------------------------|");
				 System.exit(0);
			     
			 }
			 
			default:
			{
				 System.out.println("|------------------------------------------------------------------------------------------|");
			     System.out.println("|                                                                                          |"); 
		         System.out.println("|                             You enter wrong choice!                                      |");
		         System.out.println("|                                                                                          |");  
		         System.out.println("|------------------------------------------------------------------------------------------|");
		         
				
		         
				break;
			}
			
			}     
			
			//switch end
	    	
	    	
	    	
	    	//below is end of catch block
		}
	
	}
	

}