package vegetablesOOP; //not required
import java.lang.Math;

public class Tomato extends Vegetables{


	@Override
	public void eat() {
		System.out.println("I am a tomato.");
		System.out.println("You should consume " + (int)(Math.random() * 10) + " servings of tomato today.\n");
	}
}