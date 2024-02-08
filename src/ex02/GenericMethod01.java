package ex02;

class Box<T> {
	private T obj;

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}
}

class BoxFactory {
	//제네릭 메서드<T>, Box<T>: 반환 타입, makeBox: 함수명, (T o): 매개변수
	public static <T> Box<T> makeBox(T o) {
		Box<T> box = new Box<>();
		box.set(o);
		return box;
	}
}
public class GenericMethod01 {

	public static void main(String[] arg) {
		Box<String> sBox = BoxFactory.makeBox("korea");
		System.out.println(sBox.get());
		
		Box<Integer> iBox = BoxFactory.makeBox(100);
		System.out.println(iBox.get());
				
	}
}
