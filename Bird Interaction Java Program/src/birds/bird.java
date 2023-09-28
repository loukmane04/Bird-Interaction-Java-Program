package birds;

import actions.Actions;
public class bird extends Actions {
	
	String name;

	public bird() {
		super();
	}
	public bird(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
