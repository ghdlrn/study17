package ex03;

/*
 * Box 제네릭 클래스와 제네릭 메서드를 보고서
 * main 메서드를 채우시오
 * T 타입은 String으로 한다.
 */

class Box<T> {  //T--> String
	private T obj;

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return this.obj;
	}
}

class UnBoxer {
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}
}
public class GenericMethod01 {

	public static void main(String[] arg) {
		
		Box<String> oBox = new Box<String>();
		oBox.set("korea");
		String str = UnBoxer.openBox(oBox);
		System.out.println(str);
	}
}
