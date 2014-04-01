package strategy;

public interface Animal {
	
	public void printStatus();
	
	public int eat(int food);
	
	public int foodComsuptions();

	public String getFood();

	public String getEatingHabits();
	
	public boolean getAlive();
}
