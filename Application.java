package com.softwaretestinghelp;
 
public class DemoClass{
public static int  sampleMethod(int a,int b) throws ArithmeticException{ 
//[1] int as data type of return value
      System.out.println("Hello, this is sample method");
      int c = a/b; // int c = 4 / 2 gets calculated as 2 
      System.out.println("c:"+c); // c: 2
      return c;//return statement 
 } 
 
public static void main (String[] args){
    int x = DemoClass.sampleMethod(4,2);//return value is assigned to variable x 
    System.out.println("x:"+x); // x: 2
 }
 public static void main (String[] args){
    System.out.println("Hello , this is sample program");   
    String grade = DemoClass.getGrade(70);
    System.out.println("Grade:"+grade);
 }

 #Code changes by Ethan for Feature2.2 for HDFC Application 
 public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass myObject = new MyClass();

        // Accessing the public field
        System.out.println("Public Field: " + myObject.publicField);

        // Calling the public method
        myObject.publicMethod();
    }
}
#end of feature2.2 method

 #Code Changes for Feature2.1 by Developer Vivek on Feb2024 for Service Module for HDFC Bank ApplicationException
 public class SimpleMethodExample {

    // Method that takes two integers and returns their sum
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        // Calling the method and storing the result
        int result = addNumbers(5, 7);

        // Printing the result
        System.out.println("The sum is: " + result);
    }
}
#End of feature2.1 method


 }
}