package strategy;

public class Bird {
	
	String name;
	boolean alive;
	Rapacity rapacity;

	public Bird(String name, Rapacity rapacity) {
		this.name = name;
		this.alive = true;
		this.rapacity = rapacity;
	}
	
	public void printStatus() {
		if (this.alive) {
			System.out.println(rapacity.getEatingHabits() + " " + name + " is alive, he found some " + rapacity.getFood());
		} else {
			System.out.println(rapacity.getEatingHabits() + " " + name + " is dead, because he didn't found enough " + rapacity.getFood());
		}
	}
	
	public int eat(int food) {
		if (food < rapacity.foodComsuptions()) {
			alive = false;
		}
		
		printStatus();
		
		return food - rapacity.foodComsuptions();
	}
	
	public boolean getAlive() {
		return alive;
	}
	
}
