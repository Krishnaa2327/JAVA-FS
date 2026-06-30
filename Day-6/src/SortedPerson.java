import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {
	
	public static void main(String[] args) {
		
//		Comparator<Person> ageComp = (p1 , p2) -> p1.getAge() - p2.getAge();
//		Comparator<Person> nameComp = (p1 , p2) -> p1.getName().compareTo(p2.getName());
				
//		TreeSet<Person> people = new TreeSet<Person>(ageComp);
//		TreeSet<Person> people = new TreeSet<Person>(nameComp);
		TreeSet<Person> people = new TreeSet<Person>(); //using compareTo method to sort
		
		people.add(new Person("polo" , 24));
		people.add(new Person("raju" , 20));
		people.add(new Person("sham" , 23));
		people.add(new Person("babu" , 50));
		
		people.forEach(System.out::println);
	}
}
