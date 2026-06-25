
public class TestEmployee {

	public static void main(String[] args) {
//		Employee e = new Employee(1000);    can-not directly instantiate as it is an abstract class
//		System.out.println(e.getSalary());
			
		Manager m = new Manager(1500,800);
//		System.out.println(m.getSalary());
		
		Clerk c = new Clerk(1200,400);
//		System.out.println(c.getSalary());
		
		Employee e = m;  // can indirectly instantiate
//		System.out.println(e.getSalary());
		
		
		ShowSalary(m);
		ShowSalary(c);
//		ShowSalary(e);
	}
	
	private static void ShowSalary(Employee e) {
		if (e instanceof Manager) 
			System.out.println("Manager salary: " + e.getSalary());
		else
			System.out.println("Clerk salary: " + e.getSalary());
		
	}
	
//	private static void ShowSalary(Employee e) {
//		System.out.println("Employee salary:" + e.getSalary());
//	}
//
//	private static void ShowSalary(Clerk c) {
//		System.out.println("clerk salary: " + c.getSalary());
//	}
//
//	private static void ShowSalary(Manager m) {
//		System.out.println("manager salary: " + m.getSalary());
		
}
