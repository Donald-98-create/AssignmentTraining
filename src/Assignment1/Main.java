package Assignment1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a;
		final int b;
		final int c;

		a = 7;
		b = 12;
		c = 15;

		int sumabc = a + b + c;
		System.out.println(sumabc);
		if (a < b && b < c) {
			System.out.println("A ist kleiner als B und B kleiner als c ");
		} else if (a > b && b > c) {
			System.out.println("A ist größer als c");
		} else {
			System.out.println("a gleich b und b gleich c");
		}

	}

}
