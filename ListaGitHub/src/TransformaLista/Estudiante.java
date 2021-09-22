package TransformaLista;
/**
 * Clase estudiante permite crear instancia de estudiante
 * @author william frasser acevedo
 * @since 2021-03-1
 *
 */
public class Estudiante {
	private String nombre;
	private int edad;
	private char genero;
	/**
	 * @param nombre
	 * @param edad
	 * @param genero
	 */
	public Estudiante(String nombre, int edad, char genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the genero
	 */
	public char getGenero() {
		return genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(char genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}
}
