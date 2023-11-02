package Assignment2;

public class javaGdi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zahl1 = 10;
		int zahl2 = 5;
		int k = tausch(zahl1, zahl2); /* Uebergabe von Variablenadressen */
		System.out.println(k); /* Gibt 5 aus !!! */
		return;
	}

	static void tausch(int a, int b) /* " Variablenzeiger " */ {
		int hilf;
		hilf = a; /* Wir arbeiten hier mit den ... */
		a = b; /* ... Zeigern auf "int " und ... */
		b = hilf; /* ... nicht mit int - Werten ! */
	}

}
