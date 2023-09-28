package birds;

public class Parrot extends bird implements BirdThatCanFly{

	public Parrot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parrot(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	

	public void who () {
		System.out.println("I am a parrot");
	}
	
	interface BirdThatCanFly {
	    // Marker interface for birds that can fly
	}
	
}
