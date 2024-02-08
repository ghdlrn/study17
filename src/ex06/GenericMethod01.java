package ex06;

class Box<T> { // T--> String
	protected T obj;

	void set(T obj) {
		this.obj = obj;
	}
	
	@Override
	public String toString() {
		return obj.toString();
	}
}

class Unboxer{
	public static <T> void openBox(Box<T> box) {
		System.out.println(box);
		
	}
	public static void peekBox(Box<?> box) {
		System.out.println(box);
	}
}

public class GenericMethod01 {

	public static void main(String[] arg) {

		Box<String> sbox = new Box();
		sbox.set("korea");

		Unboxer.<String>peekBox(sbox);
		Unboxer.<String>openBox(sbox);
	}
}
