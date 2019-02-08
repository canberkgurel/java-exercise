Exercise 8
Task 1:

Write a program called decibels to convert values of Power Gain or Voltage Gain, into decibels, 
and prints out the results to 3 decimal places. Use two methods called power( ) and voltage( ) 
to do the actual calculation. Program it such that, if the user enters the number 1, main calls 
the power( ) method which prompts the user to enter a value of power gain, does the conversion 
and prints it out. If the user enters the number 2, the main calls the voltage( ) method which 
prompts the user to enter a value of voltage gain, does the conversion and prints it out. 
Test it with positive values for each.


hints: 
Power Gain in dB =10 log10 (Power Gain)
Voltage Gain in dB =20 log10 (Voltage Gain)
Use the Math.log10() method to find the log values necessary.


import java.util.Scanner;
public class Decibels  { 
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
        	System.out.println("Press 1 to enter a power gain value, or 2 to enter a voltage gain value: ");
        	int choice=s.nextInt();
        	if (choice==1) {
            		power();
		}
        	else if (choice==2) {
            		voltage();
		}
        } //end main
        
        public static void power() {
		Scanner s=new Scanner(System.in);
            	System.out.println("Enter the power gain value, to convert into decibels:");
            	System.out.println("The answer is:"+10*Math.log10(s.nextDouble()));
        } //end power

        public static void voltage()  {
		Scanner s=new Scanner(System.in);
            	System.out.println("Enter the voltage gain value, to convert into decibels:");
            	System.out.println("The answer is:"+20*Math.log10(s.nextDouble()));
        } //end voltage
} //end class


Task 2:

Write a program called ReversedArray that contains an additional method called reverseArray  that reverses the order of an array it receives through a parameter. The original array should be inputted by the user (in the main method) by entering integers. The program should print out both the original array and the reversed array, in its final output, as shown in the example below:

Example Output:

Enter the no. of elements in the array: 3
Now input the integers one by one: 
6
15
2

The original array you entered was: 6,15,2
The reversed array is: 2,15,6

NOTE: You should reverse the order of the array, not just print it out in reverse.
HINT: Use a temporary array to help swap values.


import java.util.Scanner;
public class ReversedArr {
	public static void main(String args[]) {
          Scanner s=new Scanner(System.in);
          System.out.println("Enter no. of elements in your array: ");
          int n=s.nextInt();
          int a[]=new int[n];
          System.out.println("Now input the numbers one by one");
          for (int i=0; i<n;i++) {
            a[i]=s.nextInt();
          } //end for
          System.out.print("The original array you entered was: ");
          for (int i=0; i<n;i++) {
            if (i==n-1) {
               System.out.println(a[i]);
            }
            else {
               System.out.print(a[i]+",");
            }
          } // end for
          //call reverseArray
          reverseArray(a);
         } //end main

        public static void reverseArray(int a[]) {
            int temp[]=new int[a.length];
            int j=0;
            for (int i=a.length-1; i>=0;i--) {
                temp[j++]=a[i];
            } //end for
            for(int i=0;i<a.length;i++)      {
                a[i]=temp[i];
            } //end for
            System.out.print("The reversed array is: ");
            for (int i=0; i<a.length;i++)    {
                if (i==a.length-1) {
                   System.out.println(a[i]);
                }
                else   {
                   System.out.print(a[i]+",");
                }
            } //end for
        } //end reverseArray
} //end class



Task 3:


import java.util.Scanner;
public class Resistance{

 public static void main(String args[]) {

  Scanner input=new Scanner(System.in);
  System.out.println("Enter radius");
  double rad=input.nextDouble();

  System.out.println("Enter length");
  double len=input.nextDouble();

  System.out.println("Enter resistance");
  double resist=input.nextDouble();


  System.out.printf("Resistivity is %.3f\n",calcResistivity(rad,len,resist));

  System.out.printf("Heated Resistivity is %.3f\n",calcResistHeat(calcResistivity(rad,len,resist)));


 }

 public static double calcResistivity(double rad,double len,double resist) {
 
  return resist*Math.PI*rad*rad/len;

 }

 public static double calcResistHeat(double resist) {

  Scanner input=new Scanner(System.in);
  System.out.println("Enter initial temperature");
  double Ti=input.nextDouble();

  System.out.println("Enter heated temperature");
  double T=input.nextDouble();

  System.out.println("Enter temperature coefficient");
  double a=input.nextDouble();

  return resist*(1+a*(T-Ti));

 }

}
