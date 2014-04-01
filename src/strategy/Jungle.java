package strategy;

public class Jungle {

	int herbals;
	int meat;
	
	Animal parrot = new Bird("parrot");
	Animal eagle = new Bird("eagle");
	
	Animal turtle = new Reptile("turtle");
	Animal tigger = new Reptile("tigger");
	
	public Jungle(int herbals, int meat) {
		this.herbals = herbals;
		this.meat = meat;
	}

	public void run() {
		
		while (true) {
			System.out.println("Herbals: " + herbals);
			System.out.println("Meat: " + meat);
			
			herbals = parrot.eat(herbals);
			herbals = turtle.eat(herbals);
			meat = eagle.eat(meat);
			meat = tigger.eat(meat);
			
			if (parrot.getAlive() || eagle.getAlive() || turtle.getAlive() || tigger.getAlive()) {
				break;
			} else {
				System.out.println();
			}
		}
	}
	
}
