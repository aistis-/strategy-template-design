package strategy;

public class Jungle {

	int herbals;
	int meat;
	
	public Jungle(int herbals, int meat) {
		this.herbals = herbals;
		this.meat = meat;
	}

	public void run() {
		Bird parrot = new HerbivorousBird("parrot");
		Bird eagle = new PredatoryBird("eagle");
		
		Reptile turtle = new HerbivorousReptile("turtle");
		Reptile tigger = new PredatoryReptile("tigger");
		
		while (true) {
			System.out.println("Herbals: " + herbals);
			System.out.println("Meat: " + meat);
			
			herbals = parrot.getEat(herbals);
			herbals = turtle.getEat(herbals);
			meat = eagle.getEat(meat);
			meat = tigger.getEat(meat);
			
			if (!parrot.alive || !eagle.alive || turtle.lives == 0 || tigger.lives == 0) {
				break;
			} else {
				System.out.println();
			}
		}
	}
	
}
