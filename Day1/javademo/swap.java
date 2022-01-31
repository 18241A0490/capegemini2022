package javademo;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		int t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		t=num1;
		num1=num2;
		num2=t;
	    
		System.out.println("after swapping num1 is "+num1);
		System.out.println("after swapping num2 is "+num2);
		
}

	}


