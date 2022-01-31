package JavaAssignments;

class Box {
	public void initialize(double h,double w,double d){
		double height=h,width=w,depth=d;
	}
		public double vol(double h,double w,double d) {
		return h*w*d;
		}
		public static void main(String args[]) {
			Box b=new Box();
			b.initialize(1,2,3);
			System.out.println("volume is "+b.vol(1,2,3));		
		
	}
	

}
