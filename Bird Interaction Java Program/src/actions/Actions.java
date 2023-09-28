package actions;
import birds.*;

public class Actions {
	
	bird Bird;
	
	public void myname(bird Bird) {
		System.out.println("hello Iam "+Bird.getName());
	}
	 public void canFly(bird Bird) {
	        if (Bird instanceof BirdThatCanFly) {
	            System.out.println("Yes, I can fly");
	        } else {
	            System.out.println("No, I can't fly");
	        }
	    }
	
}
