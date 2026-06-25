// Nested and Inner class

interface Greeting {
	void sayHello();
}

public class GreetingDemo {
	class GreetingInnerImpl implements Greeting {
		@Override
		public void sayHello() {
			System.out.println("Greeting inner impl");
		}
	}
	
	public void AnotherDemo() {
		class GreetingNestedImpl implements Greeting {
			@Override
			public void sayHello() {
				System.out.println("Greeting Nested impl");
			}
		};
		new GreetingNestedImpl().sayHello();
	}
	
	public static void main(String[] args) {
		GreetingDemo demo = new GreetingDemo();
		Greeting g1 = demo.new GreetingInnerImpl();
		g1.sayHello();
		demo.AnotherDemo();
		
		
		Greeting g = new Greeting() {
		@Override
		public void sayHello() {
			System.out.println("Greeting from anonymous inner class");
		}
	};
	g.sayHello();
	
	Greeting Greet = () -> System.out.println("Greeting from lambda");
	Greet.sayHello();
}
}
	
	