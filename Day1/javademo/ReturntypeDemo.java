package javademo;

class Multiply {
	
	int Mul() {
		int num1 = 10;
		int num2 = 20;
        int  result = num1*num2;
        return result;
	}
	

}
public class ReturntypeDemo {
	
	public static void main(String ar[]) {
		
		Multiply m1  = new Multiply();// this is object
		
		int temp = m1.Mul();
		
		System.out.println(" from main outout is  "+temp);

	}

}
