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
		public void run() 
		  {
		    System.out.println("Displaying BST from run thread : ");
		    String filname1;
		    filname1=strname;
		    
		  } 
	}
	
	public class inputfile extends Thread
	{
		public void run() 
		  {
		    System.out.println("Displaying InputFile from run thread : ");
		    String filname2;
		    filname2=strname;
		    
		  } 
	}
	
	public String strname;
	
	public void setstrname(String fname) 
	 {
		strname=fname;	 
		
	 }
	 
	 public String getstrname() 
	 {
		 return strname;
	 }
	 
	 /*
	public void run() 
	  {
	    System.out.println("Displaying BST from run thread : ");
	    String filname;
	    filname=strname;
	    
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
		    
	    
	    
	  }*/
	
 
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		MyProgram obj=new MyProgram();
		TreeSet<String> tS=new TreeSet<String>();
		
		int counter=0;
		int Length = args. length;
		
		
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
   	    
	
		
		for(int i=0;i<Length;i++)
		{
			System.out.println("         "+args[i]+"         ");
			
		}

		
	    MyProgram T_Array[]=new MyProgram[Length];
	    
	    for(int i=1;i<Length;i++)
	    {
	     String fname=args[i];
	     
	     T_Array[i]=new MyProgram();
	     obj.setstrname(fname);	
	    // T_Array[i].start();
	     
	    }
	    
	    	T_Array[1].start();
	   
	    	int strsize=0;
	    	 int k_size=0;
	        	try {
        		      File myObj = new File(args[0]);
        		      Scanner obj_reader = new Scanner(myObj);
        		      while (obj_reader.hasNextLine()) 
        		      {
        		        String Line_data = obj_reader.nextLine();
        		        strsize++;
        		      
        		      }
        		      
        		      obj_reader.close(); 
        		    } 
        	   
        	         catch (FileNotFoundException e) 
        	         {
        		      System.out.println("Error occur while creating file!");
        		      e.printStackTrace();
        		    }
		
	    String [] strArrayBst=new String [strsize];   
	    
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
	    
	    Vector<String> vec_obj=new Vector<String>();
	    
	    try {   
		       int sizevec_str=0;
		   
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
		        
		        
	         }
 	         catch (FileNotFoundException e) 
 	         {
 		      System.out.println("Error occur while creating file!");
 		      e.printStackTrace();
 		    }
	    int choice;
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
		
		if(choice<0 || choice>5)
   	      {
   		    throw new Exception();
   	      }

		switch (choice) 
		{
		 case 1:
		 {
			 
			 vocabulary obj4 =obj.new vocabulary();
			 obj4.start(); 
			
			 
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
			 
			 inputfile obj3=obj.new inputfile();
			 obj3.start(); 
			 
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
					   System.out.println("|------------------------------------------------------------------------------------------|");
					   System.out.println("|                                                                                          |"); 
				       System.out.println("|                     Words is macthed ! : "+str_verify+"                                  |");
				       System.out.println("|                                                                                          |");  
				       System.out.println("|------------------------------------------------------------------------------------------|");
				       check_flag=true;  
					   
					   
					 	   
				   } 
				 
 		    	
 		      }
			 
			   if(check_flag==false)
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
				 
				/* 
			     System.out.println();  
			      
			     System.out.println("|------------------------------------------------------------------------------------------|");
			     System.out.println("|                                                                                          |"); 
		         System.out.println("|                       Elements in Inputfiles : "+vec_obj+"                               |");
		         System.out.println("|                                                                                          |");  
		         System.out.println("|------------------------------------------------------------------------------------------|");
			   	 */
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
						   System.out.println("|------------------------------------------------------------------------------------------|");
						   System.out.println("|                                                                                          |"); 
					       System.out.println("|                     Words is macthed ! : "+str_verify+"                                  |");
					       System.out.println("|                                                                                          |");  
					       System.out.println("|------------------------------------------------------------------------------------------|");
					       check_flag=true;  
					 
						   
						 	   
					   } 
					 
	 		    	
	 		      }
				 
				   if(check_flag==false)
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