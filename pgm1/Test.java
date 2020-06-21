package inheritance1;

public class Test {

	public static void main(String[] args) {
		Animal ani=new Animal();
		System.out.println("-----Animal as reference and Animal obj-----");
		ani.eat();
		ani.sleep();
		System.out.println("-----Bird as reference and Bird obj-----");
		Bird bird=new Bird();
		bird.eat();
		bird.fly();
		bird.sleep();
		System.out.println("-----Animal as reference and Bird obj-----");
		ani=new Bird();
		ani.eat();
		ani.sleep();
	}

}
