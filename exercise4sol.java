Solutions to Exercise 4
-----------------------

Task 1.

// a class to print out  
// the numbers 1-100 
public class Loop1 { 
  public static void main(String [] args) { 
	int i; 
	for (i=1; i<=100; i++) { 
	  System.out.println(i); 
	} 
  } 
}


Task 2.

// a class to print out  
// the square root of numbers 1-100  
// hint:use Math.sqrt
public class Loop2 {   
  public static void main(String [] args) { 
	int i; 
	for (i=1; i<=100; i++) { 
	  System.out.printf("%5.3f\n", Math.sqrt(i)); 
	} 
  } 
}

Task 3.

// a class to prompt the user  
// to enter an integer less than 100  
// and print out all the numbers between  
// in steps of 5. E.g if the user enters  
// 67, the program prints 72,77,82,87,92,97  
import java.util.Scanner; 
public class Loop3 { 
  public static void main(String [] args) { 
	Scanner input = new Scanner(System.in); 
	System.out.println("Enter an integer less than 100:"); 
	int a = input.nextInt(); 
	for (a=a+5; a<100; a=a+5) { 
	  System.out.println(a); 
	} 
  } 
}


Task 4.

//compute the factorial of an integer
//-method good for integers up to 20
import java.util.Scanner;
public class CalculateFactorial {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer:");
    int n = input.nextInt();
    //calculate factorial
    long factorial = 1;
    for(int i=2; i<=n; i++) {
	factorial *= i;
    }
    System.out.println("Factorial = " + factorial);
 }
}

Task 5.

public class convertFtoC {
    public static void main(String[] args) {
        double F=0;
        double C=0, Capprox=0;

        while (Math.abs((C - Capprox)) < 4.0)
        {
            Capprox = (F - 30)/2;
            C = (F-32) * 5 / 9;
            F++;
        }
        System.out.println(F-1);
    }
}

Task 6.

import java.util.Scanner;
public class ValidGrade {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double grade;
    do {
    System.out.println("Enter a grade: ");
    grade = input.nextDouble();
    } while ((grade<0) | (grade>100));

    System.out.println(grade);
  }
}
