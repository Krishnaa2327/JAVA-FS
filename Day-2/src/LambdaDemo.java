
@FunctionalInterface
interface Hello{
	String Greet();
	
	default void demo() {
		System.out.println("Hello demo! " + temp());
	}
	
	static void test() {
		System.out.println("Hello test");
	}
	
	private String temp() {
		return "hello temp!";
	}
}

@FunctionalInterface
interface Printer {
	void print(String name);
}

public class LambdaDemo {
	
	public static void main(String[] args) {
		Hello h1 = () -> "Hello lambda!";
		System.out.println(h1.Greet());
		h1.demo();
		Hello.test();
		
		Hello h2 = () -> {
			String msg = "Hola amigo!";
			return msg;
		};
		System.out.println(h2.Greet());
		
		Printer p1 = (name) -> System.out.println(name);
		p1.print("Krishna");
		
		Printer p2 = System.out::println; // :: called as method refrence
		p2.print("WOW");
	}
}
