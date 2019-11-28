

public abstract class Duck  {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck(){}

	public abstract void display();

	public void PerformFly(){
		flyBehavior.fly();
	}

	public void PerformQuack(){
		quackBehavior.quak();
	}

	public void Swim(){
		System.out.println("All ducks float even the decoy ones! ");
	}
}
