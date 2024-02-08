package ex05;

class Box<T> { // T--> String
	protected T obj;

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return this.obj;
	}
}

class SteelBox<T> extends Box<T> {
	public SteelBox(T o) {
		obj = o;
	}
}

public class GenericMethod01 {

	public static void main(String[] arg) {

		Box<Integer> ibox = new SteelBox<>(1234);
		Box<String> sbox = new SteelBox<>("korea");

		System.out.println(ibox.get());
		System.out.println(sbox.get());
	}
}
