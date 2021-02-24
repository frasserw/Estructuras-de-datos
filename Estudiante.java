package ejercico2P;

import java.util.ArrayList;
/**
 * Clase Esrudiante para crear instancia de estudiante
 * @author william frasser acevedo
 *
 */
public class Estudiante {
	private int idEstudiante;
	private String nombre;
	private ArrayList<Double> notas;
	private double notaFinal;
	/**
	 * @param idEstudiante identificación del estudiante
	 * @param nombre
	 * @param notas
	 */
	public Estudiante(int idEstudiante, String nombre, ArrayList<Double> notas) {
		super();
		this.idEstudiante = idEstudiante;
		this.nombre = nombre;
		this.notas = notas;
	}
		
	/**
	 * @return the idEstudiante
	 */
	public int getIdEstudiante() {
		return idEstudiante;
	}



	/**
	 * @param idEstudiante the idEstudiante to set
	 */
	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
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
	 * @return the notas
	 */
	public ArrayList<Double> getNotas() {
		return notas;
	}



	/**
	 * @param notas the notas to set
	 */
	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}



	/**
	 * @return the notaFinal
	 */
	public double getNotaFinal() {
		return notaFinal;
	}



	/**
	 * @param notaFinal the notaFinal to set
	 */
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Estudiante [idEstudiante=" + idEstudiante + ", nombre=" + nombre + ", notaFinal=" + notaFinal + "]";
	}
	
}
