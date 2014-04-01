package template;

public class HerbivorousReptile extends Reptile {

	public HerbivorousReptile(String name) {
		super(name);
	}

	public int foodComsuptions() {
		return 3;
	}

	public String getFood() {
		return "herbals";
	}

	public String getEatingHabits() {
		return "Herbivorous";
	}
	
}
