package strategy;

public class Reptile implements Animal {

	String name;
	int lives;
	
	public Reptile(String name) {
		this.name = name;
		this.lives = 2;
	}
	
	public void printStatus() {
		if (lives >= 0) {
			System.out.println(getEatingHabits() + " " + name + " is alive, he found some " + getFood());
		} else {
			System.out.println(getEatingHabits() + " " + name + " is dead, because he didn't found enough " + getFood());
		}
	}
	
	public int eat(int food) {
		if (food < foodComsuptions()) {
			lives--;
		}
		
		printStatus();
		
		return food - foodComsuptions() < 0 ? 0 : food - foodComsuptions();
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
	
	public boolean getAlive() {
		return lives > 0;
	}
	
}
