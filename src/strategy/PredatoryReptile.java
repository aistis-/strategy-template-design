package strategy;

public class PredatoryReptile extends Reptile {

	public PredatoryReptile(String name) {
		super(name);
	}

	public int foodComsuptions() {
		return 6;
	}

	public String getFood() {
		return "meat";
	}

	public String getEatingHabits() {
		return "Predatory";
	}
	
}
