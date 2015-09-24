package singleton;


//Step 1
public class HumanSingleton {
	// create static object
	private static HumanSingleton instance = new HumanSingleton();

	// create constructor with private
	private HumanSingleton() {

	}

	public static HumanSingleton getInstance() {
		return instance;
	}

	public void showHello() {
		System.out.println("Hello Singleton");
	}
}


