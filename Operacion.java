package ejercicio2LR02;

import java.util.ArrayList;
import java.util.Scanner;

import listas.tda.ArrayList.TdaList;
/**
 * Clase Operaciones implementa las fucniones para craer lista y realizar busquedas
 * @author willim frasser acevedo
 *@since 2021-02-24
 */
public class Operacion {
	private TdaList listaNumeros;
	private Scanner leerDato =new Scanner(System.in);
	/**
	 * 
	 */
	public Operacion() {
		listaNumeros =new TdaList();
	}	
	/**
	 * Método para generar una lista de numeros aleatorios
	 * @param dato determina el tamaño de la lista
	 */
	public void generarLista(int dato) {
		for (int i = 0; i < dato; i++) {
			listaNumeros.addFinal(Math.random());
		}
	}
	/**
	 * 
	 * @return un entero el numero mayor de la lista 
	 */
	public int buscarMayor() {
		int mayor = 0;
		ArrayList<Integer> lista = listaNumeros.getLista();
		
		for (Integer numero : lista) {
			if(numero > mayor)  {
				mayor = numero;
				break;
			}
		}
		
		return mayor;
	}
	/**
	 * 
	 * @return en numero menor encorntado en la lista
	 */
	public int buscarMenor() {
		int menor = 10000000;
		ArrayList<Integer> lista = listaNumeros.getLista();
		
		for (Integer numero : lista) {
			if(numero < menor)  {
				menor = numero;
				break;
			}
		}
		
		return menor;
	}
	/**
	 * 
	 * @return el promedio de los datos contenidos en la lista
	 */
	public double promedio() {
		int suma=0;
		
		ArrayList<Integer> lista = listaNumeros.getLista();
		
		for (Integer integer : lista) {
			suma += integer;
		}
		
		return suma / listaNumeros.tamanio();
	}
	
	public boolean buscarNumero(int dato) {
		ArrayList<Integer> lista = listaNumeros.getLista();
		boolean encontro=false;
		for (Integer numero : lista) {
			if(dato == numero)  {
				encontro =true;
				break;
			}
		}
		return encontro;
	}
	/**
	 * 
	 */
	public void nemu() {
		int opc = 0;;
		boolean salir=false;
		while(!salir) {
			System.out.println("Operaciones con una Lista Numeros Enteros");
			System.out.println("1. Crear lista");
			System.out.println("2. El Mayor");
			System.out.println("3. El Menor");
			System.out.println("4. Buscar numero");
			System.out.println("5. Promedio");
			System.out.println("6. Mostrar lista");
			System.out.println("7. Salir");
			System.out.print("Entrar una de las opciones");
			opc = leerDato.nextInt();
			
			switch (opc) {
				case 1:
					System.out.println("Craer Lista");
					System.out.println("Cuantos datos en la lista");
					generarLista(leerDato.nextInt());
					break;
				case 2:
					System.out.println("El Mayor número en la Lista es: " + buscarMayor());break;
				case 3:
					System.out.println("El Menor número en la Lista es: " + buscarMenor());break;
				case 4: 
					System.out.println("Buscar un número en la lista");
					System.out.println("Entrar el número a buscar");
					int numero = leerDato.nextInt();
					if(buscarNumero(numero)) {
						System.out.println("Numero Encontrado");
					}else {
						System.out.println("Numero no encontado");
					};break;
				case 5:
					System.out.println(promedio());break;
				case 6:listaNumeros.muestra();break;	
				case 7:salir=true;break;	
				default: 
					System.out.println("Solo números entre 1 y 7");break; 
		   }
		}
	}
	
}
