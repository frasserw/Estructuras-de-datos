package ejercico2P;

import java.util.ArrayList;
import java.util.Scanner;
public class Curso {
	private TdaList listaEstudiante;
	
	/**
	 * Composición 
	 * @param listaEstudiante
	 */
	public Curso() {
		super();
		this.listaEstudiante =new TdaList();
	}
	/**
	 * Métos para aregar instanca de estudiante a la lista
	 * @param estduiante es una instancia de la clase estusiante para asignarlos como nodo en la lista
	 */
	public void agregarEstudiante(Estudiante estudiante) {
		listaEstudiante.addInicio(estudiante);
	}
	/**
	 * Método para calcular la nota final de cada estduiante
	 */
	public void calcularNota() {
		ArrayList<Estudiante> lista = listaEstudiante.getLista();
		double sumaNota=0;
		for (Estudiante estudiante : lista) {
			ArrayList<Double> nota = estudiante.getNotas();
			for (Double n : nota) {
				sumaNota += n;
			}
			estudiante.setNotaFinal(sumaNota / nota.size());
			
		}
	}
	/**
	 * Método para consultar un estudiante
	 */
	public Estudiante consultarEstudiante(int idEstudiante) {
		Estudiante est=null;
		ArrayList<Estudiante> lista = listaEstudiante.getLista();
		
		for (Estudiante estudiante : lista) {
			if(estudiante.getIdEstudiante() == idEstudiante) {
				est=estudiante;
				break;
			}
		}
		return est;
	}
	/**
	 * Método para mostar por comsola la lista de estudiantes
	 */
	public void mostrarLista() {
		listaEstudiante.muestra();
	}
	
}
