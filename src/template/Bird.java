package template;

public abstract class Bird {
	
	String name;
	boolean alive;
	
	public Bird(String name) {
		this.name = name;
		this.alive = true;
	}
	
	public void printStatus() {
		if (this.alive) {
			System.out.println(getEatingHabits() + " " + name + " is alive, he found some " + getFood());
		} else {
			System.out.println(getEatingHabits() + " " + name + " is dead, because he didn't found enough " + getFood());
		}
	}
	
	public int eat(int food) {
		if (food < foodComsuptions()) {
			alive = false;
		}
		
		printStatus();
		
		return food - foodComsuptions();
	}
	
	public boolean getAlive() {
		return alive;
	}
	
	public abstract int foodComsuptions();
	
	public abstract String getFood();
	
	public abstract String getEatingHabits();
	
}
