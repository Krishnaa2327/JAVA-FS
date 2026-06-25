
public class Person implements Cloneable{
	private String name;
	private int age;
	
	public Person() {
//		name = "Anonymous";
//		age = -1;
		
		this("Anonymous" , -1);  // This is constructor chaining....it will call another constructor automatically
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void Print() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(this.age == p.age && name.equals(p.name))
				return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person("Krishna",20);
		p1.Print();
		Person p2 = new Person();
		p2.Print();
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1);
		
		System.out.println(p1.equals(p2));
		
		Person pc = (Person)p1.clone(); //shallow cloning (bit by bit)
		System.out.println(pc);
	}
}
