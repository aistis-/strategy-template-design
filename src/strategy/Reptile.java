package strategy;

public abstract class Reptile {

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
	
	public int getEat(int food) {
		if (food < foodComsuptions()) {
			lives--;
		}
		
		printStatus();
		
		return food - foodComsuptions() < 0 ? 0 : food - foodComsuptions();
	}
	
	public abstract int foodComsuptions();
	
	public abstract String getFood();
	
	public abstract String getEatingHabits();
	
}
