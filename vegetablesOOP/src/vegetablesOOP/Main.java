package vegetablesOOP; //not required

public class Main {

	public static void main(String[] args) {
		
		// polymorphism = 	greek word for poly-"many", morph-"form"
		//					The ability of an object to identify as more than one type
		//https://www.youtube.com/watch?v=2hkngtWLGvE
		
		Tomato tomato = new Tomato();
		Broccoli broccoli = new Broccoli();
		Carrot carrot = new Carrot();
		
		Vegetables[] veggies = {tomato,broccoli,carrot};
		
		//looping through each element in array
		for(Vegetables x : veggies) {
			x.eat();
		}
		
	}
}

