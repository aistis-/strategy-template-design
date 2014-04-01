package template;

public class PredatoryReptile extends Reptile {

	public PredatoryReptile(String name) {
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
