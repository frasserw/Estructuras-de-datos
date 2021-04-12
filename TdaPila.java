package pilas;

import java.util.Stack;

/**
 * Programa TDA para una pila 
 * @author william frasser acevedo
 * @since 2021-04-05
 * @version 1
 */
public class TdaPila<E> {
    public Stack<E> pila;
    /**
     * Constructor de la clase permite crear una instancia (objeto) de la clase Stack 
     */
    public TdaPila(){
        this.pila =new Stack<>();
    }
    /**
     * Función para determinar si la pila contiene o no elementos 
     * @return true si la pila esta vacia o false si la pila no esta vacia
     */
    public boolean vacio(){
        return this.pila.isEmpty();
    }
    /**
     * Función retornar el numero de elementos en la pila
     * @return un entero con el numero de elemetos en la pila
     */
    public int tamanio(){
        return this.pila.size();
    }
    /**
     * Función apliar
     * @param elemento es la instancia que se deber apilar
     */

    public void apilar(E elemento){
        this.pila.push(elemento);
    }
    /**
     * Función para extraer un elmento de la pila
     * @return retorna la referencia al elemento (dato)  
     */
    public E  desapilar(){
        return this.pila.pop();
    }
    /**
     * 
     * @return la referncia al elemento (dato) sin removerlo 
     */
    public E tope(){
        return this.pila.peek();
    }

}
