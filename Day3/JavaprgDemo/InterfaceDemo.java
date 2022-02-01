package JavaprgDemo;
interface Car {

	void speed();

	void brake();

	void Lights();

}

class LuxuryCar implements Car {

	public void speed() {

		System.out.println(" 300 km/hr");
	}

	public void brake() {
		System.out.println(" disk  brake");

	}
	public void Lights() {

		System.out.println(" high visioned lights");
	}

}

class CheapCar implements Car {

	public void speed() {

		System.out.println(" 100 km/hr");
	}

	public void brake() {
		System.out.println(" disk not  brake");

	}

	public void Lights() {

		System.out.println(" low visioned lights");
	}

}
public class InterfaceDemo {
	public static void main(String ar[]) {

		LuxuryCar l = new LuxuryCar();
		l.brake();

		CheapCar c = new CheapCar();
		c.brake();

	}

}
