
package javaapplication18;

import java.util.Scanner;

public class CircleArea {
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        double radius, area, pi;
        
        System.out.println("Enter the value of radius: ");
        radius = input.nextDouble();
        
        pi=3.1416;
        
        area = pi*radius*radius;
        
        System.out.println("The area of circle is: "+area);
        
        
        
    
    }
    
}
