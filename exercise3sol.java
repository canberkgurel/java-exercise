//(Selected) Solutions for Exercise 3
//--------------------------------

//Task 2.

// a class to prompt the user  
// to enter three doubles
// and print their average

import java.util.Scanner; 
public class PrintAverage {   
  public static void main(String [] args) { 
	Scanner input = 	new Scanner(System.in); 
	System.out.println("Enter a number: "); 
	double a = input.nextDouble(); 
	System.out.println("Enter a number: "); 
	double b = input.nextDouble(); 
	System.out.println("Enter a number: "); 
	double c = input.nextDouble(); 
	System.out.println("Average = " + (a+b+c)/3); 
  } 
  }
}


//Task 7a.

// a class to prompt the user  
// to enter two doubles  
// and print the largest 
import java.util.Scanner; 
public class PrintLargest {  
  public static void main(String [] args) { 
	Scanner input = new Scanner(System.in); 
	System.out.println("Enter a number: "); 
	double a = input.nextDouble(); 
	System.out.println("Enter a number: "); 
	double b = input.nextDouble(); 
	if (a>b) { 
	  System.out.println("Largest = " + a); 
	} 
	else { 
	  System.out.println("Largest = " + b); 
	} 
  } 
}


//Task 7b.

// a class to prompt the user  
// to enter two integers  
// and print the smallest
import java.util.Scanner; 
public class PrintSmallest {   
  public static void main(String [] args) { 
	Scanner input = new Scanner(System.in); 
	System.out.println("Enter a number: "); 
	int a = input.nextInt(); 
	System.out.println("Enter a number: "); 
	int b = input.nextInt(); 
	if (a<b) { 
	  System.out.println("Smallest = " + a); 
	} 
	else { 
	  System.out.println("Smallest = " + b); 
	}
  } 
}



//Task 8.

// a class to prompt the user  
// to enter a integer 1,2,3 or 4  
// and print the associated meaning  
// 1="up", 2="down", 3="left", 4="right"
// Use a switch statement
import java.util.Scanner; 
public class Switch {  
  
  public static void main(String [] args) { 
	Scanner input = new Scanner(System.in); 
	System.out.println("Enter an integer 1-4: "); 
	int a = input.nextInt(); 
	switch(a) { 
	  case 1: System.out.println("up"); 
		  break; 
	  case 2: System.out.println("down"); 
		  break; 
	  case 3: System.out.println("left"); 
		  break; 
	  case 4: System.out.println("right"); 
		  break; 
	  default: System.out.println("unknown action"); 
		  break; 
	} 
  } 
}
