package java.training.assesments.question3;

public class WildAnimal extends Animal{
	@Override
	public void eat() {
		System.out.println("Wild Animal is eating!");
	}

	@Override
	public void sleep() {
		System.out.println("Wild Animal is sleeping!");
	}

	public void kill() {
		System.out.println("Wild Animal is killing!");
	}
}
