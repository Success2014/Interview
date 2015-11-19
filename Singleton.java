package DesignPattern;

public class Singleton {
	private static Singleton ins = new Singleton();
	private Singleton() {};
	public static Singleton getInstance() {
		return Singleton.ins;
	}
	public void showMessage() {
		System.out.println("Hello Hello!");
	}

}
