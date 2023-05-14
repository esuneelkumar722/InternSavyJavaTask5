package InternSavy;

import java.util.Scanner;

interface Calculator {
    public void add(int a, int b);
    public void subtract(int a, int b);
    public void multiply(int a, int b);
    public void divide(int a, int b);
}

class BasicCalculator implements Calculator {
    public void add(int a, int b) {
        System.out.println("The Addition of "+ a + " + " + b + " = " + (a + b));
    }
    
    public void subtract(int a, int b) {
        System.out.println("The Subtraction of "+a + " - " + b + " = " + (a - b));
    }
    
    public void multiply(int a, int b) {
        System.out.println("The Multiplication of "+a + " * " + b + " = " + (a * b));
    }
    
    public void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            System.out.println("The Division of "+a + " / " + b + " = " + (a / b));
        }
    }
}

public class CalculatorUsingInterface {
    public static void main(String[] args) {
        Calculator calculator = new BasicCalculator(); 
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the number1");
        int number1=sc.nextInt(); 
        System.out.println("Enter the number1");
        int number2=sc.nextInt();
        
        calculator.add(number1, number2);
        calculator.subtract(number1, number2);
        calculator.multiply(number1, number2);
        calculator.divide(number1, number2);
        
        sc.close();
    }
}