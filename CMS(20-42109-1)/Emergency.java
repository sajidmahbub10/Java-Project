
import java.io.File; 
import java.io.IOException; 
import java.io.RandomAccessFile; 
import java.lang.NumberFormatException; 
import java.util.Scanner;


class Emergency{
	
	
	String name;
String phoneNumber;

String address;
String emergencyDetails;
String newName;
String newPhoneNumber;

String newAddress;
String newEmergencyDetails;
	
	
				
				
				
				
				
				
				
				
				
				
				
				public void addEmergency(){
					
					
					Scanner input =new Scanner(System.in);
     try { 

  System.out.print("\n\n\n\n\n\t\t\t\tSTART FILLING\n\n");
      System.out.print("\n\n\n\n\n\t\t\t\tEnter Your Name :");
      String newName = input.nextLine();
      System.out.print("\t\t\t\tEnter Your Phone Number : ");
String newPhoneNumber = input.nextLine();
System.out.print("\t\t\t\tEnter Your Current Address : ");
String newAddress = input.nextLine();
System.out.print("\t\t\t\tEnter The Emergency in Brief Details : ");
String newEmergencyDetails =input.nextLine();

  
      

      String nameNumberString; 
   
      int index; 

       
      File file = new File("Emergency.txt"); 

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

      name = nameNumberString 
            .substring(0, index); 
       phoneNumber =  nameNumberString 
            .substring(index+1, index2); 
          
            address =nameNumberString 
            .substring(index2+1, index3);
           emergencyDetails =nameNumberString 
            .substring(index3+1, index4);

        
        if (name == newName || phoneNumber == newPhoneNumber || address == newAddress||emergencyDetails == newEmergencyDetails) { 
          found = true; 
          break; 
        } 
      } 

      if (found == false) { 

      
        nameNumberString 
          = newName
          + "!"
          + newPhoneNumber
          +"!"
          +newAddress
          +"!"
          +newEmergencyDetails
          +"!";


      
        raf.writeBytes(nameNumberString); 

         
        raf.writeBytes(System.lineSeparator()); 

        
        System.out.println("Emergency Report Submitted"); 
        System.out.println("Wait A Few Minutes"); 
        System.out.println("Police is on Your Way"); 

         
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
				
			


			
				
				public void viewEmergency(){
					
					try { 

      
      String nameNumberString; 

      int index; 

      
      File file = new File("Emergency.txt"); 

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
        
        name = nameNumberString 
            .substring(0, index); 
       phoneNumber =  nameNumberString 
            .substring(index+1, index2); 
          
            address =nameNumberString 
            .substring(index2+1, index3);
           emergencyDetails =nameNumberString 
            .substring(index3+1, index4);

      
        
        System.out.println("Victim Name: "
                + name+"\n"
                +"Victim Phone Number :  "
                +phoneNumber+"\n"
                +"Victim Address : "
                +address+"\n"
                +"Emergency Details : "
                +emergencyDetails+"\n..............................\n");
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