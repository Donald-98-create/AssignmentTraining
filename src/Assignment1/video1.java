package Assignment1;

public class video1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int numDogs = 7;
		final int numCats = 12;
		final int numCows = 15;

		final int numPets = numDogs + numCats;
		final int numFarms = numCows;

		if (numPets < numFarms) {
			System.out.println("Anzahl Heimtiere Kleiner ");
		} else if (numPets > numFarms) {
			System.out.println("Anzahl Heimtiere Größer ");
		} else {
			System.out.println("Anzahl Heimtiere und Nutztiere sind gleich ");
		}

	}

}
