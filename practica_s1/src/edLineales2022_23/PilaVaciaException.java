package edLineales2022_23;

public class PilaVaciaException extends Exception{
	
	public PilaVaciaException(String mensajeerror) {
		super(mensajeerror); //HEREDA, DE AHI EL SUPER
	}
}