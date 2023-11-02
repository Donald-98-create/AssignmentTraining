package Assignment4.video4;

public class Farm {

	private final String name;
	private Stable stable;

	public Farm(String name) {
		this.name = name;

		this.stable = new Stable(new Cow(2), new Cow(4));

	}

	public Stable getStable() {
		return this.stable;
	}

	public String toString() {
		return "Bauernhofsname ist" + name + " Stalldeteils:" + stable.toString();
	}
}
