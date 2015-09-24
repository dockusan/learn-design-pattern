package singleton;

public class SingletonPatternDemo {
	public static void main(String arg[]) {
		 //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      HumanSingleton object = HumanSingleton.getInstance();

	      //show the message
	      object.showHello();
	}
}
