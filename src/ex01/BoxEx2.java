package ex01;

import java.util.concurrent.atomic.AtomicLong;

//Box 클래스를 통해서 생성되는 대상은 정수 및 실수 클래스만 생성한다.
class Exam2<T extends Number> {
	private T obj;

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}
}

public class BoxEx2 {

	public static void main(String[] args) {

		Exam2<Integer> ibox = new Exam2<Integer>();
		Exam2<Double> dbox = new Exam2<Double>();
		Exam2<AtomicLong> atbox = new Exam2<AtomicLong>();
		Exam2<Short> sbox = new Exam2<Short>();
//		Box<Integer> ibox = new Box<>();
	}

}
