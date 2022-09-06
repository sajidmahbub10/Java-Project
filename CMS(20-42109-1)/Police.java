

import java.io.File; 
import java.io.IOException; 
import java.io.RandomAccessFile; 
import java.lang.NumberFormatException; 
import java.util.Scanner;
class Police extends Criminal{

String policeName;
String policeId;

String gender;
String activeStatus;
String newPoliceName;
String newPoliceId;

String newGender;
String newActiveStatus;


public void addPolice(){ 
Scanner input =new Scanner(System.in);
     try { 

  System.out.print("\n\n\n\n\n\t\t\t\tSTART FILLING\n\n");
      System.out.print("\n\n\n\n\n\t\t\t\tEnter Police Name :");
      String newPoliceName = input.nextLine();
      System.out.print("\t\t\t\tEnter Police ID : ");
String newPoliceId = input.nextLine();
System.out.print("\t\t\t\tEnter Police Gender : ");
String newGender = input.nextLine();
System.out.print("\t\t\t\tEnter Police Active Status : ");
String newActiveStatus =input.nextLine();

  
      

      String nameNumberString; 
      String policeName;
String policeId;

String gender;
String activeStatus;
      int index; 

       
      File file = new File(" New Police.txt"); 

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

      policeName = nameNumberString 
            .substring(0, index); 
        policeId =  nameNumberString 
            .substring(index+1, index2); 
          
            gender =nameNumberString 
            .substring(index2+1, index3);
            activeStatus =nameNumberString 
            .substring(index3+1, index4);

        
        if (policeName == newPoliceName || policeId == newPoliceId || gender == newGender||activeStatus == newActiveStatus) { 
          found = true; 
          break; 
        } 
      } 

      if (found == false) { 

      
        nameNumberString 
          = newPoliceName 
          + "!"
          + newPoliceId
          +"!"
          +newGender
          +"!"
          +newActiveStatus
          +"!";


      
        raf.writeBytes(nameNumberString); 

         
        raf.writeBytes(System.lineSeparator()); 

        
        System.out.println("Police added. "); 

         
        raf.close(); 
      } 
      
      else { 

       
        raf.close(); 

       
        System.out.println(" Input name"
                + " does not exists. "); 
      } 
    } 

    catch (IOException ioe) { 

      System.out.println(ioe); 
    } 
    catch (NumberFormatException nef) { 

      System.out.println(nef); 
    }}
public void deletePolice(){	
Scanner input =new Scanner(System.in);
try { 

			
		System.out.print("\n\n\n\n\n\t\t\t\tEnter The Name of The Police : ");	
String newPoliceName = input.nextLine();
String inputName  =newPoliceName;
			String nameNumberString; 
			String policeName;
String policeId;

String gender;
String activeStatus;
int index; 
			 
			File file = new File(" New Police.txt"); 

			 

			
			RandomAccessFile raf 
				= new RandomAccessFile(file, "rw"); 
			boolean found = false; 

		 
		while (raf.getFilePointer() < raf.length()) { 

				 
				nameNumberString = raf.readLine(); 

				 
				index = nameNumberString.indexOf('!'); 
int	index2 = nameNumberString.indexOf('!',index+1);	
				int	index3 = nameNumberString.indexOf('!',index2+1);	
				int	index4 = nameNumberString.indexOf('!',index3+1);	
				
				policeName = nameNumberString 
						.substring(0, index); 
				policeId =  nameNumberString 
						.substring(index+1, index2); 
					
						gender =nameNumberString 
						.substring(index2+1, index3);
						activeStatus =nameNumberString 
						.substring(index3+1, index4); 

				
				if (policeName.equals(newPoliceName) == true) { 
					found = true; 
					break; 
				} 
			} 

			 
			if (found == true) { 

				
				File tmpFile = new File("temp.txt"); 

			
				RandomAccessFile tmpraf 
					= new RandomAccessFile(tmpFile, "rw"); 

				
				raf.seek(0); 

				 
				while (raf.getFilePointer() < raf.length()) { 

					 
					nameNumberString = raf.readLine(); 

					index = nameNumberString.indexOf('!'); 
					policeName = nameNumberString.substring(0, index); 

					
					if (policeName.equals(inputName)==true) { 

						
						continue; 
					} 

					
					tmpraf.writeBytes(nameNumberString); 

					
					tmpraf.writeBytes(System.lineSeparator()); 
				} 

				
				raf.seek(0); 
				tmpraf.seek(0); 

			 
				while (tmpraf.getFilePointer() < tmpraf.length()) { 
					raf.writeBytes(tmpraf.readLine()); 
					raf.writeBytes(System.lineSeparator()); 
				} 

				 
				raf.setLength(tmpraf.length()); 

				 
				tmpraf.close(); 
				raf.close(); 

				
				tmpFile.delete(); 

				System.out.println("Police deleted. "); 
			} 

			
			else { 

				 
				raf.close(); 

				
				System.out.println(" Input name"
								+ " does not exists. "); 
			} 
		} 

		catch (IOException ioe) { 
			System.out.println(ioe); 
		}}
public void updatePolice(){	
	
	Scanner input =new Scanner(System.in);
	
	try { 

			System.out.print("\n\n\n\n\n\t\t\t\tSTART FILLING\n\n");
			System.out.print("\n\n\n\n\n\t\t\tEnter The Name Of The Police You want to Update :"); 
String newPoliceName = input.nextLine();
System.out.print("\t\t\t\tEnter New Police Id : ");
String newPoliceId = input.nextLine(); 
System.out.print("\t\t\t\tEnter New Police Gender : ");
String newGender = input.nextLine();
System.out.print("\t\t\t\tEnter New Police Active Status : ");
String newActiveStatus = input.nextLine();

			String inputName  = newPoliceName;
			
			String nameNumberString; 
			String policeName;
String policeId;

String gender;
String activeStatus;
int index;

			
			File file = new File(" New Police.txt"); 

			if (!file.exists()) { 

			 
				file.createNewFile(); 
			} 

			 
			RandomAccessFile raf 
				= new RandomAccessFile(file, "rw"); 
			boolean found = false; 

			 
			while (raf.getFilePointer() < raf.length()) { 

				 
				nameNumberString = raf.readLine(); 

				 
				index = nameNumberString.indexOf('!'); 
int	index2 = nameNumberString.indexOf('!',index+1);	
				int	index3 = nameNumberString.indexOf('!',index2+1);	
				int	index4 = nameNumberString.indexOf('!',index3+1);	
				 
			policeName = nameNumberString 
						.substring(0, index); 
				policeId =  nameNumberString 
						.substring(index+1, index2); 
					
						gender =nameNumberString 
						.substring(index2+1, index3);
						activeStatus =nameNumberString 
						.substring(index3+1, index4);  

				 
				if (policeName.equals(newPoliceName) == true  ) { 
					found = true; 
					break; 
				} 
			} 

			 
			if (found == true) { 

				 
				File tmpFile = new File("temp.txt"); 

				
				RandomAccessFile tmpraf 
					= new RandomAccessFile(tmpFile, "rw"); 

				
				raf.seek(0); 

				
				while (raf.getFilePointer() < raf.length()) { 

					
					nameNumberString = raf.readLine(); 

					index = nameNumberString.indexOf('!'); 
					policeName = nameNumberString.substring(0, index); 

					
					if (policeName.equals(inputName)) { 

						
						nameNumberString 
					= policeName 
					+ "!"
					+ newPoliceId
					+"!"
					+newGender
					+"!"
					+newActiveStatus
					+"!";
					 
					}
					
					tmpraf.writeBytes(nameNumberString); 

					
					tmpraf.writeBytes(System.lineSeparator()); 
				} 

				
				raf.seek(0); 
				tmpraf.seek(0); 

			
				
				while (tmpraf.getFilePointer() < tmpraf.length()) { 
					raf.writeBytes(tmpraf.readLine()); 
					raf.writeBytes(System.lineSeparator()); 
				} 

				
				raf.setLength(tmpraf.length()); 

				 
				tmpraf.close(); 
				raf.close(); 

				
				tmpFile.delete(); 

				System.out.println("Police Info Updated");
			} 

			
			else { 

				 
				raf.close(); 

				
				System.out.println(" Input name"
								+ " does not exists. "); 
			} 
		} 

		catch (IOException ioe) { 
			System.out.println(ioe); 
		} 

		catch (NumberFormatException nef) { 
			System.out.println(nef); 
		} 
		}
public void showPolice(){
	try { 

      
      String nameNumberString; 
      String policeName;
String policeId;

String gender;
String activeStatus;
      int index; 

      
      File file = new File(" New Police.txt"); 

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
        
      policeName = nameNumberString 
            .substring(0, index); 
        policeId =  nameNumberString 
            .substring(index+1, index2); 
          
            gender =nameNumberString 
            .substring(index2+1, index3);
            activeStatus =nameNumberString 
            .substring(index3+1, index4);

      
        
        System.out.println("Police Name: "
                + policeName+"\n"
                +"Police Id :  "
                +policeId+"\n"
                +"Police gender : "
                +gender+"\n"
                +"Active Status : "
                +activeStatus+"\n..............................\n");
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


