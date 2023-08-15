package java9features;

public interface Cat {

	default void walk() {
		System.out.println("cat instance method");
	}
	
	static void run() {
		System.out.println("cat staic method");
	}
}
