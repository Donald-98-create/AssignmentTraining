package Assignment2;

import java.util.ArrayList;

public class videos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> evenNumberBy2And5 = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0 && i % 5 == 0) {
				evenNumberBy2And5.add(i);
			}

		}
		if (evenNumberBy2And5.size() >= 4) {
			Integer elementsAtIndex3 = evenNumberBy2And5.get(3);
			evenNumberBy2And5.remove(3);
		}
	}

}
