Solutions to Exercise 6
-----------------------

Task 1:
What does the following program print out?
Note: A ‘String’ is a data-type which can store words and sentences.

public class Hello {
public static void main (String args[]) {
String name = "There";
int numb=2;
/* System.out.println(name);
*/System.out.println("Hello + numb");
            }
}

Solution:
Hello + numb

Task 2:
Write a program called PassFail which prints "PASS" if the int variable "mark" is more than or equal to 40, else prints “FAIL”. 
The value of the ‘mark’ variable is to be accepted using the ‘Scanner’ method.

Solution:

import java.util.Scanner;

public class PassFail {

   
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int mark;
        System.out.println("Enter the mark:");
        mark=s.nextInt();
        if (mark>=40)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
}


Task 3:
Write a program called PrintNumbers which prints "ONE", "TWO",... , "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, etc using switch statements.
The value of the ‘number’ variable is to be accepted using the ‘Scanner’ method.

Solution:

import java.util.Scanner;
public class PrintNumbers {   
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int number;
        System.out.println("Enter the number:");
        number=s.nextInt();
        switch(number)
        {
            case 1: System.out.println("ONE");break;
            case 2: System.out.println("TWO");break;
            case 3: System.out.println("THREE");break;
            case 4: System.out.println("FOUR");break;
            case 5: System.out.println("FIVE");break;
            case 6: System.out.println("SIX");break;    
            case 7: System.out.println("SEVEN");break;    
            case 8: System.out.println("EIGHT");break;    
            case 9: System.out.println("NINE");break;    
            default: System.out.println("OTHER");
                
        }
    }
}

Task 4:
Modify the program in Task 3, so as to use nested if-statements, instead of switch statements.

Solution:

import java.util.Scanner;

public class PrintNumbers{   
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int number;
        System.out.println("Enter the number:");
        number=s.nextInt();
        if (number==1)
        System.out.println("ONE");
        else if (number==2)
            System.out.println("TWO");
        else if (number==3)
            System.out.println("THREE");
        else if (number==4)
        System.out.println("FOUR");
        else if (number==5)
            System.out.println("FIVE");
        else if (number==6)
            System.out.println("SIX");  
        else if (number==7)
            System.out.println("SEVEN");
        else if (number==8)
            System.out.println("EIGHT");
        else if (number==9)
            System.out.println("NINE");  
        else 
            System.out.println("OTHER");
       
    }
}

Task 5:
Identify what’s wrong with the following piece of code, and correct it.

int i = 5;
while (i < 5) {
i++; System.out.println(i);
}

Solution:

Since i=5, it will not even enter the while loop to begin with. An alternative would be;

int i = 5;
while (i < 10) {
i++; System.out.println(i);
}


Task 6:
Using a for-loop, write a program called SumAvg to sum up all the numbers from 1 to 100. Also compute and display the average using a variable called ‘avg’. 
The output should look like:

The sum is 5050
The average is 50.5

Solution:

public class SumAvg {   
    public static void main(String[] args) {
        
        double sum=0;
        double avg;
        for (int i=1;i<=100;i++)
        {
         sum=sum+i;
        }  
        avg=sum/100;
       System.out.println("The sum is: "+sum);
       System.out.println("The avg is: "+avg);
    
    }
}

Task 7:
Modify the program to only sum up the odd numbers from 1 to 100, and compute the average.
Hint: Use the ‘%’ operator.

Solution:

public class SumAvg{   
    public static void main(String[] args) {
        
        double sum=0;
        double avg;
        for (int i=1;i<=100;i++)
        {        
         if (i%2!=0)		 //checking if the number is odd  
         sum=sum+i;
        }  
        avg=sum/100;
       System.out.println("The sum is: "+sum);
       System.out.println("The avg is: "+avg);
    
    }
}








Task 8:
Modify the previous program to work with a do-while loop.

Solution:

public class SumAvg {   
    public static void main(String[] args) {
        
        double sum=0;
        double avg;
        int i=1;
        do
        {        
         	if (i%2!=0) //checking if the number is odd  
        	 {
            	     sum=sum+i;
        	 }
       	 i++;
        } while (i<=100); 

        avg=sum/100;
       System.out.println("The sum is: "+sum);
       System.out.println("The avg is: "+avg);
    
    }
}


Task 9:

Write a program called Grade, which reads in ‘n’ number of grades (n is an int variable, with a permitted value of 0-100 marks) and displays the average. You should keep the grades in an integer array. 

Your output should look like:

Enter the number of students: 3
Enter the grade for student 1: 55
Enter the grade for student 2: 108
Invalid grade, try again...
Enter the grade for student 2: 56
Enter the grade for student 3: 57
The average is 56.0





Solution:

public class Grade {   
    public static void main(String[] args) {
        int n;
        int[] grade=new int[50];
        Scanner s= new Scanner(System.in);
        double sum=0;
        double avg;
        System.out.println("Enter the number of students: ");
        n=s.nextInt();
        for (int i=0;i<n;i++)
        {   
            System.out.println("Enter the grade for student "+(i+1)+":");
            grade[i]=s.nextInt();
            
            if (grade[i]>100)
            {
               do { 
                    System.out.println("Invalid grade, try again...");
                    System.out.println("Enter the grade for student "+(i+1)+":");
                    grade[i]=s.nextInt();
                  } while (grade[i]>100); 
            }
            sum+=grade[i];
        }
            avg=sum/n;
       System.out.println("The avg is: "+avg);
    
    }
}
