package Assignment1;

public class video2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 5;
		tausch(a, b);
		System.out.println(b); // Immer noch 10!
	}

	static void tausch(int a, int b) {
		int hilf;
		hilf = a;
		a = b;
		b = a;
	}
}
