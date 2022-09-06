import java.io.File; 
import java.io.IOException; 
import java.io.RandomAccessFile; 
import java.lang.NumberFormatException; 
import java.util.Scanner;
class Criminal extends Civilian  {

public void addCriminal(){
	
	  Scanner input =new Scanner(System.in);
	try { 

  System.out.print("\n\n\n\n\n\t\t\t\tSTART FILLING\n\n");
      System.out.print("\n\n\n\n\n\t\t\t\tEnter Criminal Name :");
      String newCriminalName = input.nextLine();
      System.out.print("\t\t\t\tEnter Criminal ID : ");
String newCriminalId = input.nextLine();
      System.out.print("\t\t\t\tEnter Criminal Gender : ");
String newGender = input.nextLine();
      System.out.print("\t\t\t\tEnter Crime Brief Report : ");
String newCrime =input.nextLine();

  
      

      String nameNumberString; 
     String criminalName;
String criminalId;

String gender;
String crime;
      int index; 

       
      File file = new File("CriminalInfo.text"); 

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

      criminalName = nameNumberString 
            .substring(0, index); 
        criminalId =  nameNumberString 
            .substring(index+1, index2); 
          
            gender =nameNumberString 
            .substring(index2+1, index3);
            crime =nameNumberString 
            .substring(index3+1, index4);

        
        if (criminalName == newCriminalName || criminalId == newCriminalId || gender == newGender||crime == newCrime) { 
          found = true; 
          break; 
        } 
      } 

      if (found == false) { 

      
        nameNumberString 
          = newCriminalName 
          + "!"
          + newCriminalId
          +"!"
          +newGender
          +"!"
          +newCrime
          +"!";


      
        raf.writeBytes(nameNumberString); 

         
        raf.writeBytes(System.lineSeparator()); 

        
        System.out.println("Criminal Info Added");

         
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
    }
	}
	
	
	public void showCriminal(){
		
		Scanner input =new Scanner(System.in);
		
		try { 

      
      String nameNumberString; 
     String criminalName;
String criminalId;

String gender;
String crime;
      int index; 
      
      File file = new File("CriminalInfo.text"); 

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
        
    criminalName = nameNumberString 
            .substring(0, index); 
        criminalId =  nameNumberString 
            .substring(index+1, index2); 
          
            gender =nameNumberString 
            .substring(index2+1, index3);
            crime =nameNumberString 
            .substring(index3+1, index4);
      
        
        System.out.println("Criminal Name: "
                + criminalName+"\n"
                +"Criminal Id :  "
                +criminalId+"\n"
                +"Criminal gender : "
                +gender+"\n"
                +"Crime Brief Details : "
                +crime+"\n..............................\n");
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
		
		
		
		
		
		public void updateCriminal(){
			Scanner input = new Scanner(System.in);	

	
	
	
	
	
	
		try { 

			System.out.print("\n\n\n\n\n\t\t\t\tSTART FILLING\n\n");
			System.out.print("\n\n\n\n\n\t\t\tEnter The Name Of The Criminal You want to Update : "); 
String newCriminalName = input.nextLine();
System.out.print("\t\t\t\tEnter New Criminal Id : ");
String newCriminalId = input.nextLine(); 
System.out.print("\t\t\t\tEnter New Criminal Gender : ");
String newGender = input.nextLine();
System.out.print("\t\t\t\tEnter New Crime Brief Details : ");
String newCrime = input.nextLine();

			String inputName  = newCriminalName;
			
			String nameNumberString; 
		  String criminalName;
String criminalId;

String gender;
String crime;
int index;

			
			File file = new File("CriminalInfo.text"); 

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
				 
			  criminalName = nameNumberString 
            .substring(0, index); 
        criminalId =  nameNumberString 
            .substring(index+1, index2); 
          
            gender =nameNumberString 
            .substring(index2+1, index3);
            crime =nameNumberString 
            .substring(index3+1, index4);

				 
				if (criminalName.equals(newCriminalName) == true  ) { 
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
					criminalName = nameNumberString.substring(0, index); 

					
					if (criminalName.equals(inputName)) { 

						
						nameNumberString 
					= criminalName 
					+ "!"
					+newCriminalId
					+"!"
					+newGender
					+"!"
					+newCrime
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

				System.out.println("Criminal Info Updated");
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
		
		
		public void deleteCriminal(){
			  Scanner input = new Scanner(System.in);
	try { 

			
		System.out.print("\n\n\n\n\n\t\t\tEnter The Name of The Criminal : ");	
String newCriminalName = input.nextLine();
String inputName  =newCriminalName;
			String nameNumberString; 
     String criminalName;
String criminalId;

String gender;
String crime;
      int index; 
 
			 
			File file = new File("CriminalInfo.text"); 

			 

			
			RandomAccessFile raf 
				= new RandomAccessFile(file, "rw"); 
			boolean found = false; 

		 
		while (raf.getFilePointer() < raf.length()) { 

				 
				nameNumberString = raf.readLine(); 

				 
				index = nameNumberString.indexOf('!'); 
int	index2 = nameNumberString.indexOf('!',index+1);	
				int	index3 = nameNumberString.indexOf('!',index2+1);	
				int	index4 = nameNumberString.indexOf('!',index3+1);	
				
			  criminalName = nameNumberString 
            .substring(0, index); 
        criminalId =  nameNumberString 
            .substring(index+1, index2); 
          
            gender =nameNumberString 
            .substring(index2+1, index3);
            crime =nameNumberString 
            .substring(index3+1, index4);

				
				if (criminalName.equals(newCriminalName) == true) { 
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
					criminalName = nameNumberString.substring(0, index); 

					
					if (criminalName.equals(inputName)==true) { 

						
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

				System.out.println("Criminal Info deleted. "); 
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
			
			
			
		}
		









	} 