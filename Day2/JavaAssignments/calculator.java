package JavaAssignments;

class calculator {
	static double  powint(int a,int b)
    {
        return Math.pow(a,b);
    }
    static double powdob(double a,int b)
    {
        return Math.pow(a,b);
    }

    public static void main(String[] args) {
        System.out.println("powerint:"+calculator.powint(2,3)+"\npower double:"+calculator.powdob(2.0,2));
    }

}
