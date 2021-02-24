package ejercico2P;

import java.util.ArrayList;
import java.util.Scanner;

public class Presentación {
	private Scanner leerDato =new Scanner(System.in);
	private Curso miCurso =new Curso();
	
	public void nemu() {
		int opc = 0;;
		boolean salir=false;
		while(!salir) {
			System.out.println("Curso EDL");
			System.out.println("1. Crear estudiante");
			System.out.println("2. Calcular nota");
			System.out.println("3. Consultar estudiante");
			System.out.println("4. Mostrar la lista");
			System.out.println("5. Salir");
			System.out.print("Entrar una de las opciones");
			opc = leerDato.nextInt();
			switch (opc) {
				case 1:
					crearEstudiante();break;
				case 2:
					miCurso.calcularNota();break;
				case 3:
					consultarEstudiante();break;
				case 4: miCurso.mostrarLista();	
				case 5:salir=true;break;	
				default: 
					System.out.println("Solo números entre 1 y 5");break; 
		   }
		}
	}
	
	public void crearEstudiante() {
		System.out.println("Datos del estudiante");
		System.out.println("Id estduiante");
		int id = leerDato.nextInt();
		System.out.println("Nombre");
		String nombre = leerDato.next();
		System.out.println("Notas 1");
		double nota1 = leerDato.nextDouble();
		System.out.println("Notas 2");
		double nota2 = leerDato.nextDouble();
		ArrayList<Double> nota =new ArrayList();
		nota.add(nota1);
		nota.add(nota2);
		Estudiante miestudiante =new Estudiante(id,nombre,nota);
		miCurso.agregarEstudiante(miestudiante);
		
	}
	
	public void consultarEstudiante() {
		System.out.println("Consultra Estudiante");
		System.out.println("Entrar codigo del estudiante");
		int codigo = leerDato.nextInt();
		Estudiante estudiante = miCurso.consultarEstudiante(codigo);
		
		if(estudiante!= null) {
			System.out.println(estudiante);
		}else {
			System.out.println("Estudiante no existe");
		}
		
	}
}
