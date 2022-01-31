package javademo;

class Addition{
	void add() {
		int l=10;
		int b=20;
		int area=l*b;
		System.out.println(area);
		
		
	}
	void sub() {
		int a=20;
		int b=10;
		int res=a-b;
		System.out.println(res);
		
		
	}
	
}

public class methods {
	public static void main(String args[]) {
		Addition a1=new Addition();
		a1.add();
		a1.sub();
		
	}
}
