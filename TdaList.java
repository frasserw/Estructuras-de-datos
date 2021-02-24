package ejercico2P;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * Programa TDA para implemnetar lista que contengan cualquier tipo de dato primario o instancias de una clase
 * @author william frasser acevedo
 * @since 2021-01-02
 * @param <E> cualquier tipo de objeto
 */
public class TdaList<E> {
	private ArrayList<E> lista;
	/**
	 * Constructor de la clase
	 */
	public TdaList() {
		this.lista =new ArrayList();
	}
	/**
	 * Método para obtener el estado de la lista vacio o no vacia
	 * @return true si la lista esta vacio, false si la lista no esta vacia
	 */
	public boolean esvacia() {
		return lista.isEmpty();
	}
	/**
	 * Método para obtener el número de elementos de la lista.
	 * @return un entreo con el numero de elementos de la lista
	 */
	public int tamanio() {
		return lista.size();
	}
	/**
	 * Método para adicionar instancias ala final de la lista
	 * @param dato instancia de una clase 
	 * @return true on false
	 */
	public boolean addFinal(E dato) {
		return lista.add(dato);
	}
	/**
	 * Método para adicionar una instancia al inicio de la lista, siempre en el nodo cero
	 * @param dato instancia de una clase 
	 */
	public void addInicio(E dato) {
		lista.add(0, dato);
	}
	/**
	 * Método para adicionar una instancia entre Nodos
	 * @param index especifica el número del nodo que se desea insertar
	 * @param dato
	 */
	public void addEntreNodo(int index ,E dato) {
		lista.add(index,dato);
	} 
	/**
	 * 
	 * @param dato instancia a buscar en la lista
	 * @return true si encontro la instancia y false si no lo encontro
	 */
	public boolean contiene(E dato) {
		return lista.contains(dato);
	}
	/**
	 * Método Reemplaza el elemento en la posición especificada en esta lista
	 * con el elemento especificado como indice.
	 * @param index un darto entero número de indice
	 * @param dato instancai a reemplazar
	 */
	public void actualiza(int index ,E dato) {
		lista.set(index, dato);
	}
	/**
	 * Método que recibe una instancia Devuelve el índice de la primera aparición del elemento
	 * especificado en esta lista, o -1 si esta lista no contiene el elemento. 
	 * @param dato instancia a buscar
	 * @return un entero con el índice de la primera aparición del elemento buscado
	 */
	public int indexOf(E dato) {
		return lista.indexOf(dato);
	}
	/**
	 * Método para borrar una Nodo de lista sabiendo su indice 
	 * @param index es el número del indice del nodo a borrar
	 */
	public void removerI(int index) {
		lista.remove(index);
	}
	/**
	 * Método para borrar un Nodo de la lista  
	 * @param dato es la instancia a borrar
	 */
	public void removerO(E dato) {
		lista.remove(dato);
	}
	
	/**
	 * 	Método que muestra los datos contenidos en los nodos de la lista
	 */
	public void mostrar() {
		Iterator iteraLista = lista.iterator();
		while(iteraLista.hasNext()) {
		   Object element = iteraLista.next();
		   System.out.print(element + " ");
		}
	}
	/**
	 * Método que muestra los datos contenidos en los nodos de las lista.
	 * Implementa expresiones lambda son funciones anónimas
	 * funciones que no necesitan una clase.
	 */
	public void muestra() {
		lista.forEach((n)->System.out.println(n));
			
	}
	/**
	 * 
	 * @return la lista de elementos 
	 */
	
	public ArrayList<E> getLista(){
		return this.lista;
	}
	
	
	
}













