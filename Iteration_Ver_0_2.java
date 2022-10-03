/*
Version 0.2
Code Name = TOTAL_OVERHAUL
*/

/*
Now Supports:
- Negative user input
 - User input of 0
- Overhauled by using an array and a for loop

Need to do:
- Add a loop to repeat the program and break out of it upon user input
- Add input-validation to each input
- Close stdin


Student: Kenneth Jenkins
Class: MATH 1501
Instructor: Dr. Christopher Raridan
*/

import java.util.Scanner;

public class Iteration_Ver_0_2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        //Starts scanner object stdin
        System.out.println("Greatings! Welcome to the Iteration Program!");
        System.out.println("This program follows the format of f(x)= m*(seed)+b");
        System.out.println("Please input how many iterations you would like to perform; (Whole number only)");

        int size = stdin.nextInt();
        //Initalizes an int variable input as iterations

        System.out.println("Please input Seed value (whole number or float only)");
        double seed = stdin.nextDouble(); //Initalizes a double variable input as seed

        System.out.println("Please input m value (whole number of float only)");
        double m = stdin.nextDouble(); //Initalizes a double variable input as m

        System.out.println("Please input b value (whole number or float only)");
        double b = stdin.nextDouble(); //Initalizes a double variable input as c

        double[] interationArray = new double[size+1];
        //Creates an array of size iterations

        interationArray[0] = ((m * seed) + b);

        System.out.println("x_Naught is = " + interationArray[0]);

    for(int i = 1; i <= size; i++) {
        interationArray[i] = ((m * interationArray[i-1]) + b);
        System.out.println("x_" + i +" is = " + interationArray[i]);
    }
    }
}
