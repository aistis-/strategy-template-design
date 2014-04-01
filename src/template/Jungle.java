package template;

public class Jungle {

	int herbals;
	int meat;
	
	Bird parrot = new HerbivorousBird("parrot");
	Bird eagle = new PredatoryBird("eagle");
	
	Reptile turtle = new HerbivorousReptile("turtle");
	Reptile tigger = new PredatoryReptile("tigger");
	
	public Jungle(int herbals, int meat) {
		this.herbals = herbals;
		this.meat = meat;
	}

	public void run() {
		
		while (true) {
			System.out.println("Herbals: " + herbals);
			System.out.println("Meat: " + meat);
			
			herbals = parrot.getEat(herbals);
			herbals = turtle.getEat(herbals);
			meat = eagle.getEat(meat);
			meat = tigger.getEat(meat);
			
			if (parrot.getAlive() && eagle.getAlive() && turtle.getAlive() && tigger.getAlive()) {
				System.out.println();
			} else {
				break;
			}
		}
	}
	
}
