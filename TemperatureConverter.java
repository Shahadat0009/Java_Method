
package javaapplication18;

import java.util.Scanner;


public class TemperatureConverter {
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit, constant;
        
        System.out.println("Enter the celsius: ");
        celsius = input.nextDouble();
        
        constant = 1.8;
        
        fahrenheit = constant*celsius+32;
        System.out.println("Fahrenheit is: "+fahrenheit);
    
    }
    
}
