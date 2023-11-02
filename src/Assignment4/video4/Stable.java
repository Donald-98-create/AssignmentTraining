package Assignment4.video4;

public class Stable {

	private Cow cow1;
	private Cow cow2;

	public Stable(Cow cow1, Cow cow2) {
		this.cow1 = cow1;
		this.cow2 = cow2;
	}

	public void setCow1(Cow cow1) {
		this.cow1 = cow1;
	}

	public void setCow2(Cow cow2) {
		this.cow2 = cow2;
	}

	public void mooing() {
		if (cow1 != null) {
			cow1.moo();
		}
		if (cow2 != null) {
			cow2.moo();
		}
	}

	public String toString() {
		return "Kuh1:" + cow1.toString() + "Kuh2:" + cow2.toString();
	}

}
