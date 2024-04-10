package test;

public class main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Bike a = new Bike(3, 4);
		Bike b = (Bike) a.clone();
		b.setPs(0);
		System.out.println(a.toString());
		System.out.println(b.toString());
	}

}
