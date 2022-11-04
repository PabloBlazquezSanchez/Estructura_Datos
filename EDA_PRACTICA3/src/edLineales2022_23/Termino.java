package edLineales2022_23;

public class Termino {
private String definicion;
private String nombre;

public Termino(String nombre, String definicion) {
	this.definicion = definicion;
	this.nombre = nombre;
}

public String getDefinicion() {
	return definicion;
}
public void setDefinicion(String definicion) {
	this.definicion = definicion;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

}
