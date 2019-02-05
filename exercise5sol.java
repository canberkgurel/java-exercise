Solutions to Exercise 5
-----------------------


Task 1.
public class ArrayTest1
{
	// Store the following data items in an array
	// then calculate their sum and average using a for-loop.
	// Print out the results.
	// 3.2, 2.4, 6.6, 7.3, 4.2, 9.9, 12.0, -3.2, -4.1, 5.4
	// Later, convert the class to use a while-loop
	// instead of a for-loop.

    public static void main(String[] args) {
        double sum=0;
	double average=0;
        double [] test = {3.2, 2.4, 6.6, 7.3, 4.2, 9.9, 12.0, -3.2, -4.1, 5.4};
        for (int i=0; i<test.length; i++) {
            sum += test[i];
        }
        average = sum/test.length;
        System.out.println("Sum = " + sum + ", average = " + average);
    }
}

Task 2. Version with while loop:

  public static void main(String[] args) {
        double [] test = {3.2, 2.4, 6.6, 7.3, 4.2, 9.9, 12.0, -3.2, -4.1, 5.4};
        double sum=0, average;
        int i=0;
        while(i<test.length) {
            sum +=test[i];
            i++;
        }
        average = sum/test.length;
        System.out.println("Sum = " + sum + ", average = " + average);
   }


Task 3. 

public class ArrayTest2
{
	// Store the following data in an integer array
	// then calculate and print out the sum of their square roots
	// 2, 34, 17, 12, 96, 44, 72, 63

	// ignore the following:
	// Later, store the data items above in a new array
	// in ascending order, i.e.
	// 2, 12, 17, 34, 44, 63, 72, 96

      //start of solution:	
      public static void main(String[] args) {
        double sum = 0;
        int [] arr = {2, 34, 17, 12, 96, 44, 72, 63};
        for (int i=0; i<arr.length; i++) {
          sum += Math.sqrt(arr[i]);
        }
        System.out.println("Sum of the square roots = " + sum);


        /* ignore the following solution to re-arrange the elements in
           ascending order:
	int i, j, size;
        int min, minidx, temp, moves = 0;
        size = arr.length;
        for ( i = 0; i < (size - 1); i++)
        {
      		min = arr[i];   // assume minimum is the first array element
      		minidx = i;     // index of minimum element
      		for(j = i + 1; j < size; j++)
      		{
        	  if (arr[j] < min)   // if we've located a lower value
        	  {                   // capture it
	  		min = arr[j];
	  		minidx = j;
        	  }
      		}
      		if (min < arr[i])  // check if we have a new minimum
		{                  // and if we do, swap values
		        temp = arr[i];
		        arr[i] = min;
		        arr[minidx] = temp;
       	 		moves++;
      		}
    	}
    
        System.out.println("The sorted list, in ascending order, is:");
        size = arr.length;
        for (i = 0; i < size; i++)
      	System.out.print("  " + arr[i]);

    	//System.out.println("\n" + moves + " moves were made to sort this list");
       }
       */ end of multi-line comment
 }

Task 4.

public class ArrayTest3
{
	// Store the following data items in an integer array.
	// Then store the squares of their values in an new array
	// 415, 243, 755, 452, 676, -210, -45, 6, 82, -73
	// Later, print out the maximum and minimum values in
	// the new array.

  public static void main(String[] args) {
    int [] arr = {415, 243, 755, 452, 676, -210, -45, 6, 82, -73};
    int [] newarr = new int [arr.length];
    for (int i=0; i<arr.length; i++) {
      newarr[i] = arr[i]*arr[i];
    }
    int min = newarr[0];
    int max = newarr[0];
    for (int i=0; i<newarr.length; i++) {
      if (min > newarr[i])
         min = newarr[i];
      if (max < newarr[i])
         max = newarr[i];
    }
    System.out.println("Minimum = " + min + ", maximum = " + max);

  }
}

Task 5.

public class ArrayTest4
{
	// Store the square roots of numbers 1-100 in an array. 
	// Then, print out each value to an accuracy of 
	// three decimal places*, such that the output appears as a list, 
	// in descending order e.g.  
	// Square root of 100 = 10.000
	// Square root of 99 = 9.950 
	// ... 
	// ... 
	// Square root of 2 = 1.414
	// Square root of 1 = 1.000

	// *using System.out.printf(), introduced in a recent lecture

    public static void main(String[] args) {
        double [] arr = new double [100];
        for (int i=0; i<arr.length; i++) {
          arr[i] = Math.sqrt(i+1);
        }
        for (int i=99; i>=0; i--) {
          System.out.printf("%5.3f\n", arr[i]);
        }
    }

}

Task 6.Two dimensional arrays:

public class ArrayTest5
{

	// Given the following array data:
	// int [][] val = {{8,16,9,52}, {3,15,27,6}, {14,25,2,10}};
	// complete the class so that it adds up the square roots of 
	// all the elements and prints the total. 
	// hint: use nested for loops.

    public static void main(String[] args) {
        int [][] val = { {8,16,9,52}, {3,15,27,6}, {14,25,2,10}};
        int sum = 0;
        for (int i=0; i<val.length; i++)    {
            for (int j=0; j<val[i].length; j++) {
                sum += val[i][j];
            }
        }
        System.out.println("The sum of the elements = " + sum);
        //ignore this test: int [] an1 = new int [] {1,2,3};


    }
}
