package java9features;

public interface Animal {

	String name = "hello;";
	
	// default :: default method is by default public instance method so private,protected 
//															access modifiers are not allowed
	//                                                   ||
	//                   instance method so can be overridden so final is prevented
	//                   already implemented so no meaning of adding "ABSTRACT"
	
	default String walk() {
		System.out.println("Animal is walking...");
		born();
//		getCategory(null);
		makeSound(null);
		sam();
		return "walking";
	}
	
	public default void makeSound(String sound) {
		System.out.println("Animal making :: "+sound);
	}
	
	static void born() {
		
		System.out.println("static public method");
		
	}
	
	public abstract void sam();
//	static void statsam();
	
//	private static String getCategory(String name) {
////		sam();
//		System.out.println("private static method");
//		return name;
//	}
//	
//	private void m() {
//		walk();
//		getCategory(null);
//		born();
//		
//	}
}
