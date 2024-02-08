package ex01;

class A {
	@Override
	public String toString() {
		return "A class";

	}
}

class B extends A {
	@Override
	public String toString() {
		return "B class";

	}
}

class C extends B {
	@Override
	public String toString() {
		return "C class";

	}
}

//A클래스 이거나 A를 상속한 클래스만 T 전달 가능
class Exam<T> {
	private T obj;

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}
}

public class ExamEx1 {

	public static void main(String[] args) {

		Exam<A> aExam = new Exam<A>();
		Exam<B> bExam = new Exam<B>();
		Exam<C> CExam = new Exam<C>();

//		Exam<Integer> iExam = new Exam<>();
	}

}
