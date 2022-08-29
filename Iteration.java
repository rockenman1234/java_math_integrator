import java.util.Scanner;

public class Iteration {
   public static void main(String[] args){
   Scanner stdin = new Scanner(System.in);
   //Starts Method and starts scanner
   
   System.out.println("This program follows the format of f(x)=mx+b"); //Prints User directions
   
   System.out.println("Please input m value (whole number of float only)");  
   double m = stdin.nextDouble(); //Initalizes a double variable input as m
   
   
   System.out.println("Please input x value (whole number or float only)");
   double x = stdin.nextDouble(); //Initalizes a double variable input as x
   
   System.out.println("Please input c value (whole number or float only)");
   double b = stdin.nextDouble(); //Initalizes a double variable input as b
   


   System.out.println("");
   System.out.println("");
   System.out.println("");
   System.out.println("");
   //Adds Space
      
   System.out.println("The following was inputed");
   System.out.println("Value of m is " + m);
   System.out.println("Value of x is " + x);
   System.out.println("Value of b is " + b);
   
   
   System.out.println("");
   System.out.println("");
   System.out.println("");
   System.out.println("");
   //Adds Space

   Double x_Naught = (m * x + b); //Starts iterations process
   System.out.println("x-Naught is f(x)=" + x_Naught);

   
   //Iteration of f(x) for x_One using x_Naught
   Double x_One = (m * x_Naught + b);
   System.out.println("x-One is f(x)=" + x_One);
   
   //Iteration of f(x) for x_Two using x_one
   Double x_Two = (m * x_One + b);
   System.out.println("x-Two is f(x)=" + x_Two);

   //Iteration of f(x) for x_Three using x_Two
   Double x_Three = (m * x_Two + b);
   System.out.println("x-Three is f(x)=" + x_Three);
   
   //Iteration of f(x) for x_Four using x_Three
   Double x_Four = (m * x_Three + b);
   System.out.println("x-Four is f(x)=" + x_Four);
   
   //Iteration of f(x) for x_Five using x_Four
   Double x_Five = (m * x_Four + b);
   System.out.println("x-Five is f(x)=" + x_Five);
   
   //Iteration of f(x) for x_Six using x_Five
   Double x_Six = (m * x_Five + b);
   System.out.println("x-Six is f(x)=" + x_Six);
   
   //Iteration of f(x) for x_Seven using x_Six
   Double x_Seven = (m * x_Six + b);
   System.out.println("x-Seven is f(x)=" + x_Seven);
   
   //Iteration of f(x) for x_Eight using x_Seven
   Double x_Eight = (m * x_Seven + b);
   System.out.println("x-Eight is f(x)=" + x_Eight);

   //Iteration of f(x) for x_Nine using x_Eight
   Double x_Nine = (m * x_Eight + b);
   System.out.println("x-Nine is f(x)=" + x_Nine);

   //Iteration of f(x) for x_Ten using x_Nine
   Double x_Ten = (m * x_Nine + b);
   System.out.println("x-Ten is f(x)=" + x_Ten);

   
   stdin.close(); //Closes Scanner
   
   }
}
