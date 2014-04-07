package template;

public class Rapacity {
	
	private boolean predator;
	
	public Rapacity(boolean predator) {
		this.predator = predator;
	}

	public int foodComsuptions() {
		if (predator) {
			return 2;
		} else {
			return 3;
		}
	}

	public String getFood() {
		if (predator) {
			return "meat";
		} else {
			return "herbals";
		}
	}

	public String getEatingHabits() {
		if (predator) {
			return "Predatory";
		} else {
			return "Herbivorous";
		}
	}
	
}
