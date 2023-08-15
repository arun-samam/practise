package practice;

public class Fruit {

	private String category;
	
//	static String getname(String name) {
//		return name;
//	}
	 
	 public static void main(String[] args) {
		Apple apple = new Apple();
	}
}

class Apple extends Fruit{
	
	String getname(String name) {
			return name;
		}
	
	String getname(String name, String age){
		return age;
		
	}
	
}
