
public class AnimalCounterApp {

	public static void main(String[] args) {

		System.out.println("Counting alligators...\n");
		Countable a = new Alligator();
		count(a, 3);

		System.out.println("Counting Sheep...\n");
		Sheep blackie = new Sheep("Blackie");
		count(blackie, 2);

		Sheep dolly;
		try {
			dolly = (Sheep) blackie.clone();
			dolly.setName("Dolly");
			count(dolly, 3);
		} catch (CloneNotSupportedException e) {
			System.out.println("Error cloning blackie!");
		}

		count(blackie, 1);

	}

	public static void count(Countable c, int maxCount) {

		c.resetCount();

		for (int i = 0; i < maxCount; i++) {
			c.incrementCount();
			System.out.println(c.getCountString());
		}

		System.out.println();
	}

}
