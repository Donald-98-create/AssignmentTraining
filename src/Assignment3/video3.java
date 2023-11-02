package Assignment3;

public class video3 {

	public static void main(String[] args) {

		Dog lassie = new Dog("Lassie", 12, null);
		Dog tom = new Dog("Tom", 14, lassie);

		lassie.friend = tom;

	}

}
