package ex07;

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
	// super Integer => Integer 이거나 Integer 상위클래면 Ok
	// Integer 계층도 Integer -> Number -> Object
	public static void peekBox(Box<? super Integer> box) {  //? 와일드 카드
		System.out.println(box);
	}
}

class A{
	public String toString() {
		return "A class";
	}
}

public class GenericMethod01 {

	public static void main(String[] arg) {

		Box<Integer> ibox = new Box<>();
		ibox.set(1234);
		Unboxer.peekBox(ibox);
		
		Box<Number> dbox = new Box<>();
		dbox.set(12.5);
		Unboxer.peekBox(dbox);
		
		Box<Object> obox = new Box<>();
		obox.set("설날");
		Unboxer.peekBox(obox);
		
		Box<Object> obox2 = new Box<>();
		obox2.set(new A());
		Unboxer.peekBox(obox2);
	
	}
}
