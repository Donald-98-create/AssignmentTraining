package Assignment1;

public class vorlesung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 3;
		Double distanceInKm = 4.609344;
		int k = min(a, b);
		System.out.println(k);
		Double c = toMiles(distanceInKm);
		System.out.println(c);

		System.out.println(c);
	}

	static int min(int a, int b) {
		if (a > b) {
			return a;
		}
		return b;
	}

	static double toMiles(double distanceInKm) {
		double distanceInMiles = distanceInKm / 1.609344;
		return distanceInMiles;
	}

	static double computeAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}

}
