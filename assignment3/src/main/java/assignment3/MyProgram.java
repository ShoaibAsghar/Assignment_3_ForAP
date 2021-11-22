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
		
		int counter=0;
		int Length = args. length;
		
		
		System.out.println();
		
		System.out.println("|------------------------------------------------------------|");
   	    System.out.println("|                                                            |");
   	    System.out.println("|                 Welcome To Multi Threading                 |");  
   	    System.out.println("|                                                            |");
   	    System.out.println("|                      Assignment                            |");
   	    System.out.println("|                                                            |");
   	    System.out.println("|       The total number of files Passing is  ! "+Length+"   |");
   	    System.out.println("|                                                            |");
   	    System.out.println("|        The Names of the Passing files is !                 |");
   	    System.out.println("|                                                            |");
   	    System.out.println("|------------------------------------------------------------|");
   	    
	//	System.out.println("The total number of files Passing is ! "+Length);
		
	//	System.out.println("The Names of the Passing files is ! ");
		
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
	    
	    System.out.println("|------------------------------------------------------------------------------------------|");
   	    System.out.println("|                                         MENU                                             |");
   	    System.out.println("|                                                                                          |");
   	    System.out.println("|                            Choose any option from the Following!                         |");  
   	    System.out.println("|                                                                                          |");
   	    System.out.println("|                 Enter 1: For Displaying BST build from Vocabulary File                   |");
   	    System.out.println("|                                                                                          |");
   	    System.out.println("|                 Enter 2: For Displaying Vector build from Input File                     |");
   	    System.out.println("|                                                                                          |");
   	    System.out.println("|                 Enter 3: For Viewing Match Words and its Frequency                       |");
   	    System.out.println("|                                                                                          |");
   	    System.out.println("|             Enter 4: For Searching a query - It should Display all the Files query found |");
   	    System.out.println("|                                                                                          |");
   	    System.out.println("|             Enter 5: For Exiting!                                                        |");   
    	System.out.println("|                                                                                          |");   
   	    System.out.println("|------------------------------------------------------------------------------------------|");
   	 
		
		Scanner scanr=new Scanner(System.in);
		int choice=scanr.nextInt();
		
		switch (choice) 
		{
		 case 1:
		 {
			 
			 Thread t=new Thread();
			 t.start(); 
			
			 
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
			 
			 
		     System.out.println();  
		      
		     System.out.println("|------------------------------------------------------------------------------------------|");
		     System.out.println("|                                                                                          |"); 
	         System.out.println("|                       Elements in Inputfiles : "+vec_obj+"                               |");
	         System.out.println("|                                                                                          |");  
	         System.out.println("|------------------------------------------------------------------------------------------|");
		   	 
	        break;		 
		   }
		 
		 case 3:
		 {
			
			 
			 //strArrayBst=new String [strsize];
			 
		/*	 
			 for(int l=0;l<k_size;l++)
  		      {
  		    	System.out.print(StrArray2[l]+",");
  		      }
  		      
			 System.out.println();
			 System.out.println();
			 for(int j=0;j<strsize;j++)
  		      {
  		    	System.out.print(strArrayBst[j]+",");
  		      }
			 
			 
			 System.out.print(k_size+",");
			 System.out.print(strsize+"?");
			 */
			 
			 /*
			  
			  int i;
    int length=strlen(argv[1]);
    cout<<"The Length of the string is: "<<length<<endl; 
           
    int freqt[30]={0};
   
    
    for(i=0; i<length; i++)
    {
            
      if(argv[1][i]>='a' && argv[1][i]<='z')
      {
         freqt[argv[1][i]-97]++;
      }
      
      else if(argv[1][i]>='A' && argv[1][i]<='Z')
      {
         freqt[argv[1][i]-65]++;
      }
   }
   
   
   cout<<endl;
   cout<<"The Frequency of all characters in Entered string is : "<<endl;
   for(i=0; i<30; i++)
   {
      
      if(freqt[i]!= 0)
      {
          
          cout<<char(i + 'a')<<"="<< freqt[i]<<endl;
      }
      
      }
			  
			  */
			 
			// int freqt[30]={0};
			 
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
			         
				  // System.out.println("Words is macthed ! "+ str_input);   
				   
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
	         
		//  System.out.println("counetr"+ count_var);
			 
			 
	       break;		 
		 }
		 
		 case 4:
		 {   
			 String verify_file;
			 
			// System.out.println("Enter any file name you want to search! ");
			// System.out.println("Program tell either it is present or not! ");
			 
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
		         
				// System.out.println("This file is present! "); 
			 }
			 
			 
			 else if(Flag_nam==false)
			 {
				 System.out.println("|------------------------------------------------------------------------------------------|");
			     System.out.println("|                                                                                          |"); 
		         System.out.println("|                                   This file is not present!                              |");
		         System.out.println("|                                                                                          |");  
		         System.out.println("|------------------------------------------------------------------------------------------|");
		         
				// System.out.println("This file is not present! "); 
			 }
			 
			 String verify_word;
			 System.out.println("|------------------------------------------------------------------------------------------|");
		     System.out.println("|                                                                                          |"); 
	         System.out.println("|                           Enter Word to Search in Input file !                           |");
	         System.out.println("|                           Program tell either it is present or not in Input file!        |");
	         System.out.println("|                                                                                          |");  
	         System.out.println("|------------------------------------------------------------------------------------------|");
	         
	         
			// System.out.println("Enter Word to Search in Input file ! ");
			// System.out.println("Program tell either it is present or not in Input file! ");
			 
			 
			 Obj1 = new Scanner(System.in); 
			 verify_word = Obj1.nextLine(); 
			 
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
				         
					//   System.out.println("Words is macthed ! "+ str_verify);   
					   
					 	   
				   } 
				 
 		    	
 		      }
			 
			 
			 
		   break;	 
		   
		 }
		 
		 case 5:
		 {
			// System.out.println("You want to exit the Program ! ");	 
			// System.out.println("so Program exit! ");
			 
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
	         
			 //System.out.println("You enter wrong choice! ");
	         
			break;
		}
		
		}     
		
		//switch end
		
         
	}

}