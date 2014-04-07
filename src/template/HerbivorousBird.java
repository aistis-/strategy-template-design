package template;

public class HerbivorousBird extends Bird {
	
	private Rapacity rapacity;

	public HerbivorousBird(String name) {
		super(name);
		
		rapacity = new Rapacity(false);
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
