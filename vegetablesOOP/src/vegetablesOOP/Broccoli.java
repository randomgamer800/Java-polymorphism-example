package vegetablesOOP; //not required
import java.lang.Math;

public class Broccoli extends Vegetables{


	@Override
	public void eat() {
		System.out.println("I am a broccoli.");
		System.out.println("You should consume " + (int)(Math.random() * 10) + " servings of broccoli today.\n");
	}
}