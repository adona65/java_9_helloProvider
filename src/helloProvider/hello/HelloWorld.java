package helloProvider.hello;

import nonExported.privateHello.PrivateWorld;

/**
 * This class will be used to export our "Hello World" String that will be import in module's tutorial main project.
 */
public class HelloWorld {
	public String sayHelloWorld() {
	      return "Hello World!";
	}
	
	// We can use all public classes from inside the same module, even if this classes are in package than won't be exported.
	// So this package will be invisible for other modules only.
	public String forbiddenPrivateworld() {
		return "It's forbidden to call from other modules : " + new PrivateWorld().myPrivateWorld();
	}
}
