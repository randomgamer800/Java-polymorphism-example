package vegetablesOOP; //not required
import java.lang.Math;

public class Carrot extends Vegetables{


	@Override
	public void eat() {
		System.out.println("I am a carrot.");
		System.out.println("You should consume " + (int)(Math.random() * 10) + " servings of carrot today.\n");
	}
}