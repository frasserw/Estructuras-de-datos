package borraNumeros;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Programa para borrar datos de una lista
 * @author william frasser acevedo
 *
 */
public class NumerosBorrar {
	private ArrayList<Integer> numeros;
	public Scanner leerDato =new Scanner(System.in);
	
	public int sumaPar=0,sumaImpar=0;
	
	public NumerosBorrar() {
		numeros =new ArrayList();
		
	}
	/**
	 * Función para crear una listade N números enteros
	 */
	public void creaLista() {
	
		System.out.println("Cuanto números desea generar");
		int dato = leerDato.nextInt();
		
		for (int i = 0; i < dato; i++) {
			numeros.add((int)(Math. random()*10+1));
		}
		System.out.println("Lista Inicial de Números");
		muestra();
		eliminar();
	}
	/**
	 * Función para eliminar nodos de la lista en un posición definida
	 */
	public void eliminar() {
		for (int i=0; i<numeros.size(); i++) {
			if((i%2)==0)
				sumaImpar += (int)numeros.get(i);
			else
				sumaPar += (int) numeros.get(i);
		}
		
		System.out.println("\n Suma Par " + sumaPar + " Suma Impar " + sumaImpar);
		
		if(sumaPar == sumaImpar) {
			System.out.println("Borra Posiciones Pares");
			for (int i=1; i<numeros.size(); i++) {
				numeros.remove(i);
			}
		}else {
			System.out.println("Borra Posiciones Impares");
			for (int i=0; i<numeros.size(); i++) {
				numeros.remove(i);
			}
		}
		System.out.println("\n");
		System.out.println("Lista Final de Números");
		
	}
	/**
	 * Muestar los datos asignados alños nodos de la lista
	 */	
	public void muestra() {
		numeros.forEach((n)->System.out.print(n+" "));
	}
		
}
