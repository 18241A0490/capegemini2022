package JavaAssignments;

import java.util.Scanner;

public class ZeeZeeBank {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String account_num="9876543210";
		System.out.println("Enter the Initial Bal");
		int IB=sc.nextInt();
		System.out.println("Enter the Dep amount");
		int dep=sc.nextInt();
		System.out.println("Enter the withdrawing amount");
		int WA=sc.nextInt();
		int AB=IB+dep;
		 if(WA>AB) {
			 System.out.println("Insufficient balance");
		 }
		 else {
			 AB-=WA;
		 }
		 
		 
		 System.out.println("The available balance is:"+AB);
		 
		
		
	}

}
