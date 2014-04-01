package strategy;

public class Reptile {

	String name;
	int lives;
	Rapacity rapacity;
	
	public Reptile(String name, Rapacity rapacity) {
		this.name = name;
		this.lives = 2;
		this.rapacity = rapacity;
	}
	
	public void printStatus() {
		if (lives >= 0) {
			System.out.println(rapacity.getEatingHabits() + " " + name + " is alive, he found some " + rapacity.getFood());
		} else {
			System.out.println(rapacity.getEatingHabits() + " " + name + " is dead, because he didn't found enough " + rapacity.getFood());
		}
	}
	
	public int eat(int food) {
		if (food < rapacity.foodComsuptions()) {
			lives--;
		}
		
		printStatus();
		
		return food - rapacity.foodComsuptions() < 0 ? 0 : food - rapacity.foodComsuptions();
	}

	public boolean getAlive() {
		return lives > 0;
	}
	
}
