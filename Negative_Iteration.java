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

   System.out.println("x-Naught is f(x)=" + (m * x - b));
   Double x_Naught = (m * x + b); //Starts iterations process
   
   
   //Iteration of f(x) for x_One using x_Naught
   System.out.println("x-One is f(x)=" + (m * x_Naught - b));
   Double x_One = (m * x_Naught - b);
   
   //Iteration of f(x) for x_Two using x_one
   System.out.println("x-Two is f(x)=" + (m * x_One - b));
   Double x_Two = (m * x_One - b);
   
   //Iteration of f(x) for x_Three using x_Two
   System.out.println("x-Three is f(x)=" + (m * x_Two - b));
   Double x_Three = (m * x_Two - b);
   
   //Iteration of f(x) for x_Four using x_Three
   System.out.println("x-Four is f(x)=" + (m * x_Three - b));
   Double x_Four = (m * x_Three - b);
   
   //Iteration of f(x) for x_Five using x_Four
   System.out.println("x-Five is f(x)=" + (m * x_Four - b));
   Double x_Five = (m * x_Four - b);
   
   //Iteration of f(x) for x_Six using x_Five
   System.out.println("x-Six is f(x)=" + (m * x_Five - b));
   Double x_Six = (m * x_Five - b);
   
   //Iteration of f(x) for x_Seven using x_Six
   System.out.println("x-Seven is f(x)=" + (m * x_Six - b));
   Double x_Seven = (m * x_Six - b);
   
   //Iteration of f(x) for x_Eight using x_Seven
   System.out.println("x-Eight is f(x)=" + (m * x_Seven - b));
   Double x_Eight = (m * x_Seven - b);
   
   //Iteration of f(x) for x_Nine using x_Eight
   System.out.println("x-Nine is f(x)=" + (m * x_Eight - b));
   Double x_Nine = (m * x_Eight - b);
   
   //Iteration of f(x) for x_Ten using x_Nine
   System.out.println("x-Ten is f(x)=" + (m * x_Nine - b));
   Double x_Ten = (m * x_Nine - b);
   
   
   stdin.close(); //Closes Scanner
   
   }
}
