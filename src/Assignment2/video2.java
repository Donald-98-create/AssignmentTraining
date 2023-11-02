package Assignment2;

import java.util.ArrayList;

public class video2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysListsAndLoups();

		String[] cowNames = { "Berta", "Alex" };
		int[] cowAges = { 7, 4 };

		ArrayList<String> cows = combineCowNamesAndCowAges(cowNames, cowAges);
	}

	private static ArrayList<String> combineCowNamesAndCowAges(String[] cowNames, int[] cowAges) {
		// TODO Auto-generated method stub
		ArrayList<String> cows = new ArrayList<String>();
		for (int i = 0; i <= cowNames.length; i++) {
			String cowNameAndAge = "die Küh" + cowNames[i] + "ist" + cowAges[i] + "Jahre alt";
			cows.add(cowNameAndAge);
		}
		return cows;
	}

	public static void ArraysListsAndLoups() {

		int sum = 0;
		for (int i = 0; i < 20; i++) {
			if (i % 2 != 0) {
				continue;
			}
			sum = sum + i;
		}
		/*
		 * int[] myNumber = { 2, 5, 3, 4 }; int sumArray = 0; for (int j = 0; j <= 3;
		 * j++) { sumArray = sumArray + myNumber[j]; }
		 */
		// for (int i = 0; i < myNumber.length; i++) {
		// sumArray = sumArray + myNumber[i];
		// }
		/*
		 * for (int i : myNumber) { sumArray += i; }
		 */
		int[] evenNumber = new int[51];
		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				continue;
			}
			evenNumber[i / 2] = i;
		}
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