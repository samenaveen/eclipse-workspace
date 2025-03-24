package javapractice;

import java.util.Scanner;

public class ifcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner Scanner =new Scanner (System.in);
    System.out.println("enter a number");
    int value=Scanner.nextInt();
    Scanner.close();
 
    if (value%2 ==0)
    	System.out.println("enter a Number is even");
    else 
    	System.out.println("enter a number is  odd");
    
	}

}
