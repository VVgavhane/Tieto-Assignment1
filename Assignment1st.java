import java.util.InputMismatchException;
import java.util.Scanner;


public class Assignment1st {

	public static void main(String[] args) {
		Task9.meathodOne();	
		Task1.meathodOne();
		Task2.meathodOne();
		Task2.meathodOne();
		Task2.meathodOne();
		Task2.meathodOne();
		Task2.meathodOne();
		Task2.meathodOne();
		Task2.meathodOne();
		Task2.meathodOne();
		Task2.meathodOne();
		Task2.meathodOne();
		Task3.meathodOne();
		Task3.meathodOne();
		Task3.meathodOne();
		Task3.meathodOne();
		Task3.meathodOne();
		Task3.meathodOne();
		Task3.meathodOne();
		Task3.meathodOne();
		Task3.meathodOne();
		Task3.meathodOne();
		Task3.meathodOne();
		Task4.meathodOne();
		Task5.meathodOne();
		Task6.meathodOne();
		Task7.meathodOne();
		Task8.meathodOne();		
		Task9.meathodOne();	
	}

}
class Task1{
	static void meathodOne(){
		System.out.println("Vishnu");
	}
}

class Task2{
	static void meathodOne(){
		System.out.print("Vishnu");
	}
}
class Task3{
	static void meathodOne(){
		System.out.println("Vishnu");
	}
}

class Task4{
	static void meathodOne(){
		for(int i=0; i<2; i++)
		System.out.println("Vishnu");
	}
}
class Task5{
	static void meathodOne(){
		int i=0;
		while(i<2){
		System.out.println("Vishnu");
	    i++;  
	}
	}	
}
class Task6{
	static void meathodOne(){
		int i=0;
		do{
		System.out.println("Vishnu");
		i++;
		}
	    while(i<1);
	}
}

class Task7{
	static void meathodOne(){
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter number");
		int no= scr.nextInt();
		for (int i = 0; i < no; i++) {
			System.out.println("Vishnu");
		}
	}
	
	}


class Task8{
	static void meathodOne(){
		Scanner scr= new Scanner(System.in);
		 System.out.println("Enter Integer: ");
         int no = 0;
		    while (true) {
		        try {
		            no = scr.nextInt();
		            
		        } catch (InputMismatchException exception) {
		            System.out.println("Not an integer, please try again. Press enter key to exit");
		            if (scr.next().isEmpty()) {
		                break;
		            }
		        }
		        for(int i=1; i<=no; i++)       
		System.out.println("Vishnu");
	}
}
}

class Task9{
	static void meathodOne(){
		System.out.println ( "\"Vishnu\"");
	}
}

