package nonExported.privateHello;

/**
 * This class will not be exported. So it can't be used from other modules. But it still can be used from classes
 * inside this module.
 */
public class PrivateWorld {
	public String myPrivateWorld() {
	      return "This is a private World, do not enter !!";
	  }
}
