package edLineales2022_23;

public class EmptyStackException extends RuntimeException{
	
	public EmptyStackException (String mensajeerror) {
		super(mensajeerror); //HEREDA, DE AHI EL SUPER
	}
}