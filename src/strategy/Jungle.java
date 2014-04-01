package strategy;

public class Jungle {

	int herbals;
	int meat;
	
	Bird parrot = new Bird("parrot", new Herbivorous());
	Bird eagle = new Bird("eagle", new Predatory());
	
	Reptile turtle = new Reptile("turtle", new Herbivorous());
	Reptile tigger = new Reptile("tigger", new Predatory());
	
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
			
			if (parrot.getAlive() && eagle.getAlive() && turtle.getAlive() && tigger.getAlive()) {
				System.out.println();
			} else {
				break;
			}
		}
	}
	
}
