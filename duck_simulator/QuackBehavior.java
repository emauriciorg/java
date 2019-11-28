
public interface QuackBehavior{
	public void quack(){}

}

public class MuteQuack implements QuackBehavior{
	public void quack(){
		System.out.println("<<Silence>>");
	}
}
public class Quack implements QuackBehavior{
	public void quack(){
		System.out.println("Quack");
	}
}

public class Squeak implements QuackBehavior{
	public void quack(){
		System.out.println("Squek");
	}
}
