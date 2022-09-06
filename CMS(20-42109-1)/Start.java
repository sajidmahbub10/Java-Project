import java.util.concurrent.TimeUnit;
import java.util.Calendar;
import java.io.File; 
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.RandomAccessFile; 
import java.lang.NumberFormatException; 
import java.util.Scanner; 

public class Start extends Police{





static String adminName = "Sajid";
static String adminPass  = "1234";
static String policeName = "Tarif";
static String policePass  = "4321";









public static void main(String[] args) throws InputMismatchException{
	
	try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}

	
	
	while(true){try{
		
		
		


		
		
	
    Scanner input =new Scanner(System.in);
Start ob = new Start();
Calendar calendar = Calendar.getInstance();

int a;
String b;

 System.out.print("\n");
      System.out.print("\t\t\t\t\t\t **********************************\n");
      System.out.print("\t\t\t\t\t\t ----------------------------------\n");
      System.out.print("\t\t\t\t\t\t ----------------------------------\n");
      System.out.print("\t\t\t\t\t\t     !|CRIME MANAGEMENT SYSTEM|!\n");
      System.out.print("\t\t\t\t\t\t ----------------------------------\n");
      System.out.print("\t\t\t\t\t\t ----------------------------------\n");
      System.out.print("\t\t\t\t\t\t **********************************\n");
      System.out.print("\n\n");
      System.out.print("\n\n");
      System.out.print("\t\t\t\t\t");
      System.out.print("Project Prepared By : ");

      System.out.print("SAJID IBNA MAHBUB & ZUHAIR AHMED");
      System.out.print("\n\n");
      System.out.print("\n\n");
      System.out.print("\t\t\t\t\t");
      System.out.print("Project Team Name : ");
      
      System.out.print("OTAKU CODERS (Team--7)");
      System.out.print("\n\n");
      System.out.print("\n\n");
	  System.out.println("\t\t\t................."+"Current Date and Time = " + calendar.getTime()+".................");
      System.out.print("\t\t\t\t");


      System.out.print("\n\n");
      System.out.print("\n\n");
      System.out.print("\t\t\t\t");
   System.out.print("Loading"); for(int i = 0; i<=2; i++){ try{TimeUnit.SECONDS.sleep(3);}
catch(Exception e){System.out.println(e);} System.out.print(".................");}



try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}



do{
System.out.println("\n\n\n\t\t\t\t\t\t     MAIN MENU ");
System.out.println("\t\t\t\t\t\t    *********** \n");
System.out.println("\n\n\n\n\t\t\t\t ---------------------------------------------------");
System.out.println("\t\t\t\t ---------------------------------------------------");
System.out.println("\t\t\t\t ---------------------------------------------------");
System.out.println("\t\t\t\t Press 1 for Admin Menu\n\n");
System.out.println("\t\t\t\t Press 2 for Police Menu\n\n");
System.out.println("\t\t\t\t Press 3 for Civilian Menu\n\n");
System.out.println("\t\t\t\t Press 8 to Exit The Program\n\n");

System.out.println("\t\t\t\t ----------------------------------------------------");
System.out.println("\t\t\t\t ----------------------------------------------------");
System.out.println("\t\t\t\t ----------------------------------------------------");

a = input.nextInt();

try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}
try{
if (a==1)
{
    
    String o,p,k;
    System.out.println("\n\n\n\n\n\n\n\n\t\t\t\t\t---------------------------------------");
    System.out.println("\t\t\t\t\t ---------------------------------------");
    System.out.println("\t\t\t\t\t Welcome to Admin Menu\n\n");
k =input.nextLine();
    System.out.print("\t\t\t\t\t Enter Name : ");
    o = input.nextLine();
    System.out.print("\t\t\t\t\t Enter Password : ");
     p = input.nextLine();
     System.out.println("\t\t\t\t\t ---------------------------------------");
     System.out.println("\t\t\t\t\t ---------------------------------------");
    if (o.equals(adminName)==true && p.equals(adminPass) ==true){
   try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}
   do{
        System.out.println("\n\n\n\t\t\t\t  ADMIN MENU ");
        System.out.println("\t\t\t\t ************ \n");
        System.out.println("\n\n\n\t\t\t\t ---------------------------------------");
        System.out.println("\t\t\t\t ---------------------------------------");
        System.out.println("\t\t\t\t ---------------------------------------");
        System.out.println("\t\t\t\t Press 1 to Add Police\n");
        System.out.println("\t\t\t\t Press 2 to Delete Police\n");
        System.out.println("\t\t\t\t Press 3 to Update Police\n");
        System.out.println("\t\t\t\t Press 4 to Show All Police Info\n");
        System.out.println("\t\t\t\t xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
        System.out.println("\t\t\t\t Press 5 to Add Criminal Info \n");
        System.out.println("\t\t\t\t Press 6 to Delete Criminal Info\n");
        System.out.println("\t\t\t\t Press 7 to Show All Criminal Info\n");
        System.out.println("\t\t\t\t Press 9 to Exit Admin Menu\n");
        System.out.println("\t\t\t\t ----------------------------------------");
        System.out.println("\t\t\t\t ----------------------------------------");
        System.out.println("\t\t\t\t ----------------------------------------");
        a=input.nextInt();
		
		
		try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}

		
        if(a==1)
        {
            
ob.addPolice();


	System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    
	
	
	try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}




  }

if (a==2)
{
	ob.deletePolice();
		
	
	
		System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    
	
	
	try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}
	
	
	
}

if(a==3){
System.out.println("Start Filling\n");
ob.updatePolice();
	
	 



	System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    
	
	
	try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}


	}
	
	

if(a==4)
{
	ob.showPolice();
	System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    
	
	
	try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}
	
	
	
	
	}


if(a==5)
{
	ob.addCriminal();


	System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    
	
	
	try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}




	}	
	if(a==6){

      ob.deleteCriminal();
	
	System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    
	
	
	try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}




	}
	
	if(a==7){
		
	  ob.showCriminal();
	 	System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    
	
	
	try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}
	
	
	
	
	} 
	 
	  
	  
	
	
	
	
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\tExiting"); for(int i = 0; i<=2; i++){ try{TimeUnit.SECONDS.sleep(1);}
catch(Exception e){System.out.println(e);} System.out.print(".................");}

try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}

	
	}while(a!=9);
	
	try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}
	
	} 




try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}






}}catch(Exception d){System.out.print(d);}

if(a==2){String q,w,z;
      
			System.out.println("\n\n\n\n\n\n\n\n\t\t\t\t\t ---------------------------------------");
			System.out.println("\t\t\t\t\t ---------------------------------------");
	System.out.println("\t\t\t\t\t Welcome to Police Log In Menu\n\n");
q =input.nextLine();
	System.out.print("\t\t\t\t\t Enter Name : ");
	w = input.nextLine();
	System.out.print("\t\t\t\t\t Enter Password : ");
	 z = input.nextLine();
	 System.out.println("\t\t\t\t\t ---------------------------------------");
	 System.out.println("\t\t\t\t\t ---------------------------------------");
	if (w.equals(policeName)==true && z.equals(policePass) ==true){
		
		try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}

			do{
				
	    System.out.println("\n\n\n\t\t\t\t  POLICE MENU ");
        System.out.println("\t\t\t\t ************* \n");
	    System.out.println("\n\n\n\t\t\t\t ---------------------------------------");
		System.out.println("\t\t\t\t ---------------------------------------");
		System.out.println("\t\t\t\t ---------------------------------------");
		System.out.println("\t\t\t\t Press 1 to Add Criminal info\n");
		System.out.println("\t\t\t\t Press 2 to Delete Criminal\n");
		System.out.println("\t\t\t\t Press 3 to Update Criminal Info\n");
		System.out.println("\t\t\t\t Press 4 to Show All Criminal Info\n");
		System.out.println("\t\t\t\t xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
		System.out.println("\t\t\t\t Press 5 to View Emergency\n");
		System.out.println("\t\t\t\t Press 6 to View Missing Report\n");
		System.out.println("\t\t\t\t Press 7 to Exit Police Menu\n");
		System.out.println("\t\t\t\t ---------------------------------------");
		System.out.println("\t\t\t\t ---------------------------------------");
		System.out.println("\t\t\t\t ---------------------------------------");
		a=input.nextInt();
		
		
		try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}

				
				
      
	  if (a==0){}
		if(a==1){ob.addCriminal();
		
		
		
			System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    
	
	
	try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}
		
		
		
		
		}
			if(a==2){

      ob.deleteCriminal();
		
		
			System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    
	
	
	try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}
		
		
		
		
		}

		if(a==3){ob.updateCriminal();
		
		
		
		
			System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    
	
	
	try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}
		
		
		
		
		
		
		}
		if(a==4){ob.showCriminal();
			System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    
	
	
	try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}
		
		
		
		
		}
	
			if (a==5){ob.viewEmergency();
			System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    
	
	
	try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}
		
		
		
		
		}

		
		if(a==6){ob.viewMissingReport();
		

	System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    
	
	
	try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}		
		
		
		
		}
		
		
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\tExiting"); for(int i = 0; i<=2; i++){ try{TimeUnit.SECONDS.sleep(1);}
catch(Exception e){System.out.println(e);} System.out.print(".................");}	
		
		
		try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}

		
		
		}while(a!=7);
	}



try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}





}


if(a==3){
	

	do{
	System.out.println("\n\n\n\n\n\t\t\t\t\t ---------------------------------------");
    System.out.println("\t\t\t\t\t ---------------------------------------");
	System.out.println("\t\t\t\t\t ---------------------------------------");
	System.out.println("\t\t\t\t\t Welcome to Civilian Menu\n");
	System.out.println("\t\t\t\t\t Press 1 to Add A Missing Report\n ");
	System.out.println("\t\t\t\t\t Press 2 to File a Emergency\n ");
	System.out.println("\t\t\t\t\t Press 3 to Exit ");
	System.out.println("\t\t\t\t\t ---------------------------------------");
    System.out.println("\t\t\t\t\t ---------------------------------------");
    System.out.println("\t\t\t\t\t ---------------------------------------");
	a=input.nextInt();
	
	
	try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}

	
	if (a==1){ob.addMissingReport();
	
		System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    
	
	
	try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}
	
	
	}
	if (a==2){ob.addEmergency();
	
		System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    
	
	
	try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}
	
	
	
	}
	
	
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\tExiting"); for(int i = 0; i<=2; i++){ try{TimeUnit.SECONDS.sleep(1);}
catch(Exception e){System.out.println(e);} System.out.print(".................");}
	
	
	try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}

	
	
	}while(a!=3);
	
	try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}catch(Exception E)
{
System.out.println(E);}

	
}
if(a==4){}
if(a==8){
System.out.print("\n\nThanks For Staying With Us :) \n\n");
System.out.print("\n\nDEVELOPED BY OTAKU CODERS \n\n");
   System.out.print("Closing"); for(int i = 0; i<=2; i++){ try{TimeUnit.SECONDS.sleep(3);}
catch(Exception e){System.out.println(e);} System.out.print(".................");}

System.exit(0);
}

}while(a!=10);

	}catch(Exception e){
		System.out.println("\n\n\n\n\n\n\n\n\t\t\t\t\tWrong Input!!!!!!\n");
		System.out.println("\t\t\t\t\tRestarting The Program\n");
		System.out.println("\t\t\t\t\tSorry For The Inconvinience :)\n");
		
		
		
		}
	}
	
	}
}

    