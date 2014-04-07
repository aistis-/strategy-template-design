package template;

public class PredatoryReptile extends Reptile {
	
	private Rapacity rapacity;

	public PredatoryReptile(String name) {
		super(name);
		
		rapacity = new Rapacity(true);
	}

	public int foodComsuptions() {
		return rapacity.foodComsuptions();
	}

	public String getFood() {
		return rapacity.getFood();
	}

	public String getEatingHabits() {
		return rapacity.getEatingHabits();
	}
	
}
