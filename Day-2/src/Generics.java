
public class Generics<T> {
	private T Data;

	public Generics(T data) {
		Data = data;
	}

	public T getData() {
		return Data;
	}

	public void setData(T data) {
		this.Data = data;
	}
	
	public static void main(String[] args) {
		Generics<String> d1 = new Generics<String>("Hello");
		System.out.println(d1.getData());
				
		
	}
	
}
