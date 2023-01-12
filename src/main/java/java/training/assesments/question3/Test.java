package java.training.assesments.question3;

public class Test {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.sleep();
		bird.eat();
		bird.fly();
		WildAnimal wildAnimal = new WildAnimal();
		wildAnimal.eat();
		wildAnimal.sleep();
		wildAnimal.kill();
		Animal animal = new Bird();
		Animal animal2 = new WildAnimal();
		animal.eat();
		animal.sleep();
		animal2.eat();
		animal2.sleep();
	}
}
