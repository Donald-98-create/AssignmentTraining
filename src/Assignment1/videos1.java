package Assignment1;

public class videos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int numDogs = 7;
		final int numCats = 12;
		final int numCows = 15;

		String result = compare(numDogs, numCats, numCows);
	}

	private static String compare(int numDogs, int numCats, int numCows) {
		// TODO Auto-generated method stub
		final int numPets = numDogs + numCats;
		final int numFarms = numCows;
		final String result;
		if (numPets < numFarms) {
			result = "weniger Heimtiere";
		} else if (numPets == numFarms) {
			result = "Gleich viele Heim- und Nutztiere";
		} else {
			result = "Mehr Heimtiere";
		}

		return result;
	}

}
