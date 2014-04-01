package template;

public class HerbivorousBird extends Bird {

	public HerbivorousBird(String name) {
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
