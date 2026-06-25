
public class StringDemo {
	
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

		s1 =s1 +"World";
		System.out.println(s1);
		
		String name = "Krishna";
		String nameRegex = "[A-Z]{1}[a-z]{3,}";
		System.out.println(name.matches(nameRegex));
		
		String cell = "7219727881";
		String cellRegex = "[6-9][0-9]{9}";
		System.out.println(cell.matches(cellRegex));
		
		String email = "krishnachaudhari0205@gmail.com";
		String emailRegex = "[a-z0-9]+@+gmail.com";
		System.out.println(email.matches(emailRegex));
		
	}
}
