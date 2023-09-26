/* Write a java program which will ask the user to enter the marks.Define a method that will
 * display grades according to the marks entered as below :
 	91-100 ---- A
 	81-90  ---- B+
 	71-80  ---- B
 	61-70  ---- C
 	51-60  ---- D
 	<=40   ---- Fail
 */
package lab4hometask;

import java.util.Scanner;
public class Lab4HomeTask {

 
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       System.out.println("Enter your the marks: ");
       int marks= input.nextInt();
       
       ShowGrade(marks);
    }
    public static void ShowGrade(int marks){
        if(marks>=91&&marks<=100){
            System.out.println("Grade is: A"); 
        }
        else if(marks>=81 && marks<=90) {
	    System.out.println("Grade is : B+");
	}
		
	else if(marks>=71 && marks<=80) {
	    System.out.println("Grade is : B");
	}
	else if(marks>=61 && marks<=70) {
	    System.out.println("Grade is : C");
	}
		
	else if(marks>=51 && marks<=60) {
            System.out.println("Grade is : D");
	}
		
	else if(marks<=40&&marks>=0) {
	    System.out.println("Grade is : Fail");
	}
	else {
	    System.out.println("Input a valid Marks !");
	}
    
    
    
    }
    
}
