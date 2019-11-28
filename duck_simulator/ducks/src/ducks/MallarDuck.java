package ducks;

public class MallarDuck extends Duck{
	public MallarDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	public void display(){
		System.out.println("I am a mallar duck");
	}
	
}
