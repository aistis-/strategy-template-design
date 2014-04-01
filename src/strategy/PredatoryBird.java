package strategy;

public class PredatoryBird extends Bird {

	public PredatoryBird(String name) {
		super(name);
	}

	public int foodComsuptions() {
		return 2;
	}

	public String getFood() {
		return "meat";
	}

	public String getEatingHabits() {
		return "Predatory";
	}

}
