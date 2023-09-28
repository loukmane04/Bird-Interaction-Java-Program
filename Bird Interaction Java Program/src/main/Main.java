package main;
import actions.Actions; 
import birds.*;

public class Main {
	public static void main(String[] args){
		Parrot myparrot = new Parrot();
		Chicken mychicken = new Chicken();
		Actions action = new Actions();
		myparrot.setName("mark");
		mychicken.setName("filip");
		action.myname(myparrot);
		action.canFly(mychicken);
	
	}

}
