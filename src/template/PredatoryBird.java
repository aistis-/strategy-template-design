package template;

public class PredatoryBird extends Bird {
	
	private Rapacity rapacity;

	public PredatoryBird(String name) {
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
