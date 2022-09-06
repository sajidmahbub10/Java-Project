

import java.io.File; 
import java.io.IOException; 
import java.io.RandomAccessFile; 
import java.lang.NumberFormatException; 
import java.util.Scanner;


class Civilian extends Emergency{
	
	
		String missingName;
String missingGender;

String missingAge;
String missingDetails;
String newMissingName;
String newMissingNumber;
String newMissingAge;
String newMissingGender;
String newMissingDetails;
	
	
				
				
				
				
				
				
				
				
				
				
				
				public void addMissingReport(){
					
					
					Scanner input = new Scanner(System.in);
     try { 

  System.out.print("\n\n\n\n\n\t\t\t\tSTART FILLING\n\n");
      System.out.print("\n\n\n\n\n\t\t\t\tEnter Missing Persons Name :");
      String newMissingName = input.nextLine();
      System.out.print("\t\t\t\tEnter Missing Persons Gender : ");
String newMissingGender = input.nextLine();
System.out.print("\t\t\t\tEnter Missing Persons Age : ");
String newMissingAge = input.nextLine();
System.out.print("\t\t\t\tEnter Details : ");
String newMissingDetails = input.nextLine();

  
      

      String nameNumberString; 

   
      int index; 

       
      File file = new File("MissingReport.txt"); 

      if (!file.exists()) { 

        
        file.createNewFile(); 
      } 

     

      RandomAccessFile raf 
        = new RandomAccessFile(file, "rw"); 
      boolean found = false; 

     
      while (raf.getFilePointer() < raf.length()) { 

         
        nameNumberString = raf.readLine(); 

        
      index = nameNumberString.indexOf('!'); 
  int index2 = nameNumberString.indexOf('!',index+1); 
        int index3 = nameNumberString.indexOf('!',index2+1);  
        int index4 = nameNumberString.indexOf('!',index3+1);

      missingName = nameNumberString 
            .substring(0, index); 
   missingGender =  nameNumberString 
            .substring(index+1, index2); 
          
            missingAge =nameNumberString 
            .substring(index2+1, index3);
           missingDetails = nameNumberString 
            .substring(index3+1, index4);

        
        if (missingName == newMissingName || missingGender == newMissingGender || missingAge == newMissingAge ||missingDetails == newMissingDetails) { 
          found = true; 
          break; 
        } 
      } 

      if (found == false) { 

      
        nameNumberString 
          = newMissingName
          + "!"
          + newMissingGender
          +"!"
          +newMissingAge
          +"!"
          +newMissingDetails
          +"!";


      
        raf.writeBytes(nameNumberString); 

         
        raf.writeBytes(System.lineSeparator()); 

        
        System.out.println("\t\t\t\tMissing Report Submitted"); 
       

         
        raf.close(); 
      } 
      
      else { 

       
        raf.close(); 

       
       
      } 
    } 

    catch (IOException ioe) { 

      System.out.println(ioe); 
    } 
    catch (NumberFormatException nef) { 

      System.out.println(nef); 
    }
				}
				
			


			
				
				public void viewMissingReport(){
					
					try { 

      
      String nameNumberString; 

      int index; 

      
      File file = new File("MissingReport.txt"); 

      if (!file.exists()) { 

         
        file.createNewFile(); 
      } 

      

      RandomAccessFile raf 
        = new RandomAccessFile(file, "rw"); 
      boolean found = false; 

   
      while (raf.getFilePointer() < raf.length()) { 

         
        nameNumberString = raf.readLine(); 

       
        index = nameNumberString.indexOf('!'); 
  int index2 = nameNumberString.indexOf('!',index+1); 
        int index3 = nameNumberString.indexOf('!',index2+1);  
        int index4 = nameNumberString.indexOf('!',index3+1);  
        
        missingName = nameNumberString 
            .substring(0, index); 
   missingGender =  nameNumberString 
            .substring(index+1, index2); 
          
            missingAge =nameNumberString 
            .substring(index2+1, index3);
           missingDetails = nameNumberString 
            .substring(index3+1, index4);

      
        
        System.out.println("Missing Person Name: "
                + missingName+"\n"
                +"Missing Person Gender :  "
                +missingGender+"\n"
                +"Missing Person Age : "
                +missingAge+"\n"
                +"Missing Info In Brief : "
                +missingDetails+"\n..............................\n");
    } 
    }   

      catch (IOException ioe) 
      { 

        System.out.println(ioe); 
      } 
      catch (NumberFormatException nef) 
      { 

        System.out.println(nef); 
      } 
					
					
					
				}
					
					
	
	
}