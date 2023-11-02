package Assignment4;

import Assignment4.video4.Farm;

public class Video4 {

	public static void main(String[] args) {

		Farm farm = new Farm("Maierhof");
		farm.getStable().mooing();

		String description = farm.toString();
	}

}
