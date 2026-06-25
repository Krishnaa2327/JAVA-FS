
public class Subdemo<T,P> extends Generics<T> {
	private P temp;

	public Subdemo(T data, P temp) {
		super(data);
		this.setTemp(temp);
	}

	public P getTemp() {
		return temp;
	}

	public void setTemp(P temp) {
		this.temp = temp;
	}

	public static void main(String[] args) {
		Subdemo<String, Integer> sd = new Subdemo<String,Integer>("Krishna",21);
		System.out.println(sd.getData() + "\t" + sd.getTemp());
		
		Subdemo<Integer, Person> s2 = new Subdemo<Integer, Person>(101, new Person("Neha" , 21));
		System.out.println(s2.getData() + "\t" + s2.getTemp());
	}
	
	



}
