package TransformaLista;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Clase Curso  
 * @author williamm clase 
 * @since 2021-03-1
 */
public class Curso {
	//OBJETO O INSTANCIA  TIENE COMO ATRIBUTO UNA LISTA CREA DE LA COLECCIÓN ArryList
	private ArrayList<Estudiante> listaEstudiante;
	
	private Scanner leerDato=new Scanner(System.in);
	/**
	 * Constructor
	 */
	public Curso() {
		listaEstudiante =new ArrayList<Estudiante>();
	}
	/**
	 * Método para adicionar nodos con instancias de la clase estduiante a la lista. 
	 */
	public void crearLista() {
		System.out.println("DATOS DEL ESTUDIANTE");
		System.out.println("Cuanto estudiantes");
		int numero = leerDato.nextInt();
		
		for(int i=0; i < numero ; i++) {
			System.out.println("Entrar el nombre");
			String nombre  = leerDato.next();
			System.out.println("Edad");
			int edad = leerDato.nextInt();
			System.out.println("Enrar el genero");
			char genero = leerDato.next().charAt(0);
			listaEstudiante.add(new Estudiante(nombre,edad,genero));
		}
		
		mostrar();
		
	}
	
	
	public void mostrar() {
		listaEstudiante.forEach((n)->System.out.print(n+" "));
	}
		
	/**
	 * Método parar borar un estduiante de la lista
	 */
	public void borrar() {
		System.out.println("Entrar el nombre");
		String nombre = leerDato.next();
		boolean borrado=false;
		for (Estudiante estudiante : listaEstudiante) {
			if(estudiante.getNombre().equals(nombre)) {
				listaEstudiante.remove(estudiante);
				borrado=true;
			}
		}
		
		if (borrado) {
			System.out.println(nombre + " Fue borrado de la lista");
		} else {
			System.out.println(nombre + " No se encuentra en la lista");
		}
		
		
		
		
	}
	
	
	
	/**
	 * Método para transformar la lista Si el ultimo nodo de la lista es Masculino
	 * la lista transformada de quedar con un nodo femenino y un nodo masculino. 
	 */
	
	public void transformar() {
		Estudiante estudiante;
		Estudiante estnuevo;
		estudiante = (Estudiante) listaEstudiante.get(listaEstudiante.size()-1);
		
		if(estudiante.getGenero()=='M') {
			for (int i = 0; i < listaEstudiante.size(); i++) {
				estudiante = (Estudiante) listaEstudiante.get(i);	
			    if(estudiante.getGenero()=='F' && (i>0 && i<listaEstudiante.size()-1)) {
			       estnuevo = (Estudiante) listaEstudiante.get(i+1);
			       if(estnuevo.getGenero()=='M') {
			    	  listaEstudiante.set(i, estnuevo);
			    	  listaEstudiante.set(i+1, estudiante);
			       }
			   }
	       }
		}else {
			for (int i = 0; i < listaEstudiante.size(); i++) {
				estudiante = (Estudiante) listaEstudiante.get(i);	
			    if(estudiante.getGenero()=='M' && (i>0 && i<listaEstudiante.size()-1)) {
			       estnuevo = (Estudiante) listaEstudiante.get(i+1);
			       if(estnuevo.getGenero()=='F') {
			    	  listaEstudiante.set(i, estnuevo);
			    	  listaEstudiante.set(i+1, estudiante);
			       }
			   }
	       }
		}
	} 
	
	/**
	 * Método para mostar la lista.
	 */
	
	public void menu(){
		int opc;
		boolean salir=false;
		while(!salir) {
			opc=0;
			System.out.println("\n");
			System.out.println("MENU DE OPCIONES");
			System.out.println("1. Nuevo estudiante");
			System.out.println("2. Borrar estudiante");
			System.out.println("3. Transformar Lista");
			System.out.println("4. Mostrar lista");
			System.out.println("5. Salir");
			System.out.println("Entrar un datos enter 1 y 5");
			opc = leerDato.nextInt();
			switch(opc) {
				case 1:crearLista();
					;break;
				case 2:borrar();					
					;break;
				case 3:transformar();
					;break;
				case 4:mostrar();
					;break;	
				case 5:
					salir=true;
					break;
				default:
					System.out.println("Solo númerso del 1 al 5");
					break;
			}
							
		}
			
	}
}
