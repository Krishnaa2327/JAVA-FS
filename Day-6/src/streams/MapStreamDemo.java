package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class MapStreamDemo {
public static void main(String[] args) {
	
	Map<String , String> p = new HashMap<>();
	p.put("polo","Pune");
	p.put("mike","Mumbai");
	p.put("Dan", "Delhi");
	
	p.values().stream().forEach(System.out::println);
	
	List<String> c = p.values().stream().map(c1 -> c1.toUpperCase())
			.sorted().collect(Collectors.toList());
	c.forEach(System.out::println);
	
	
	System.out.println("\nContacts");
	Map<String, List<String>> contacts = new HashMap<>();
	contacts.put("Frudo", Arrays.asList("1212-3434","5656-7878"));
	contacts.put("Sean", Arrays.asList("2212-3534", "5666-7888", "8989-5050"));
	contacts.put("Ben", Arrays.asList("2112-3334", "5633-1188", "8090-2321"));
	
	contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);
	
	System.out.println("\nNumbers containing 8");
	contacts.values().stream().flatMap(Collection::stream)
			.filter(c2 -> c2.contains("8")).forEach(System.out::println);
	
	System.out.println("\nNumbers without -");
	contacts.values().stream().flatMap(Collection::stream)
			.map(c2 -> c2.replace("-","")).forEach(System.out::println);
	
}
}
