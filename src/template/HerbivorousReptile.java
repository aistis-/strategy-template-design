package template;

public class HerbivorousReptile extends Reptile {

	private Rapacity rapacity;
	
	public HerbivorousReptile(String name) {
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
