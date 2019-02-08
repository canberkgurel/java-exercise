EXERCISE 7
Task 1:

Write a simple program called Addition, which prompts the user to enter two integer numbers and sums them up using an additional method called sumUp.

Solution:

import java.util.Scanner;
public class Addition {
public static void main(String [ ] args) {   
                 System.out.println("Enter two integer numbers :");
                 sumUp();
	}

	public static void sumUp() {		
                            Scanner s=new Scanner(System.in);
                             int a = s.nextInt();
                	int b = s.nextInt();
		 int sum = a + b;
                 System.out.println("The sum is : "+sum);
	}
}

Task 2:

(I) Write a program called Statistics, which reads in grades for n students, where n is given by the user. 
The grades should have a permitted range of 0-100 and have to be stored in an integer array. 

(II) Calculate the average, maximum, minimum grades using 3 different methods.

Your output shall look like:
Enter the number of students: 4
Enter the grade for student 1: 50
Enter the grade for student 2: 51
Enter the grade for student 3: 56
Enter the grade for student 4: 53
The average is 52.5
The minimum is 50
The maximum is 56

NOTE:  Declare the integer array as a global variable, and pass n to the methods via parameters.




Solution:

import java.util.Scanner;
public class Statistics {
	//define integer array as a global variable
 	static int grades[]=new int[50];

	public static void main(String [ ] args) {   	
                Scanner s=new Scanner(System.in);
                 System.out.println("Enter no. of students :");
                 int n=s.nextInt();
                 for (int i=0; i<n;i++)   {   
                    System.out.println("Enter the grade for student " + (i+1) + " : ");
                    grades[i]=s.nextInt();                       
                 }
                 calcAvg(n);
                 calcMax(n);
                 calcMin(n);
	}  //end main
  
	public static void calcAvg (int n) { 
             double sum=0;
      for (int i=0; i<n;i++) {   
                      sum += grades[i];                       
                    } //end for
                 System.out.println("The average is: "+ (sum/n));
	} // end calcAvg 

             public static void calcMax (int n)	{
	  int max=grades[0];
                 for (int i=0; i<n;i++) {   
                    if (grades[i]>max)
                        max=grades[i];
                 } //end for
                 System.out.println("The maximum is: "+ max);
	} //end calcMax

            public static void calcMin(int n) {
	  int min=grades[0];
                 for (int i=0; i<n;i++) {   
                    if (grades[i]<min)
                        min=grades[i];
                    }
	  } //end for
                 System.out.println("The minimum is: "+ min);
	} //end calcMin
}



Task 3:


This ideal op-amp is setup in an inverting amplifier configuration. 
Write a program which calculates Vout through an additional method called calc. The values of Vin, Rin, and Rf are to be passed to the method via parameters. Their values must be entered in by the user during run-time and then passed onto the calc method to calculate and print out Vo.

Assume:    V_out= -V_in  R_f/R_in 

Solution:

import java.util.Scanner;
public class Vout { 
	public static void main(String [ ] args) {
    	   Scanner s=new Scanner(System.in);
                
                  System.out.println("Enter the value of V-in: ");
                  int vin=s.nextInt();
                  System.out.println("Enter the value of R-in: ");
                  int rin=s.nextInt();
                  System.out.println("Enter the value of R-f: ");
                  int rf=s.nextInt();
                  calc(vin,rin,rf);
	}   

	public static void calc(int v1, int r1,  int r2) {      
                  System.out.println("The output voltage is:"+ (-v1*(r2/r1)));
	}


}








Task 4:

Now, write a program called SimpleMath, which reads in two integer numbers using a Scanner. Write two methods, called by main, where one multiplies the two numbers, and the other divides the two numbers, and each returning the result. Pass the numbers (entered by the user) to both the methods using parameters.

Solution:

import java.util.Scanner;
public class SimpleMath    { 
	public static void main(String [ ] args) {   	
                Scanner s=new Scanner(System.in);
                System.out.println("Enter 2 numbers: ");
                double a=s.nextDouble();
                double b=s.nextDouble();
                System.out.println("The product is " + multiply(a,b));
                System.out.println("The quotient is " + divide(a,b));
	}   

	public static double multiply (double a, double b)  {      
          	   return a*b;   
	}

        	public static double divide (double a, double b) {      
          	   return a/b;   
	}
}
