package edLineales2022_23;

public class PilaVaciaExcepcion extends RuntimeException{
	
	public PilaVaciaExcepcion(String mensajeerror) {
		super(mensajeerror); //HEREDA, DE AHI EL SUPER
	}
}