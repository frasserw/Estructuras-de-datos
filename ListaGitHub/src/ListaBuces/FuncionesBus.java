package ListaBuces;

import java.util.ArrayList;

public class FuncionesBus {
	private ArrayList<Bus> listaBus;
	/**
	 * Constructor
	 */
	public FuncionesBus() {
		listaBus =new ArrayList();
	}
	/**
	 * Crea una lista de nodos y asigna el campo dato una instancia de la clase Bus
	 * @param dato
	 */
	public void crearLista(int dato) {
		for(int i=0; i < dato;i++) {
			int codigo = (int)(Math. random()*30+1);
			int km = (int)(Math. random()*80+1);
			
			Bus miBus =new Bus(codigo,km);
			
			listaBus.add(miBus);
			
		}
	}
	/**
	 *Muestra la lista de buses 
	 */
	public void mostrarLista() {
		listaBus.forEach((b)->System.out.print(b+" "));
		
		
	}
	/**
	 * Método calcula el promedio de los kilometros recorridos por los buses.
	 */
	public int promidoKm() {
		int suma=0;
		for (Bus bus : listaBus) {
			suma += bus.getKilomestro();
		}
		return suma/listaBus.size();
	}
	/**
	 * Función para buscar el nodo que contega un menor dato
	 * @return
	 */
	public int busMenorKilometros() {
		int menorKm = 10000;
		
		for (Bus bus : listaBus) {
			if(bus.getKilomestro() < menorKm) {
				menorKm = bus.getKilomestro();
			}
		}
		
		return menorKm;
	}
	/**
	 * Función borra un elemento nodo de la ista 
	 * @param numero
	 */
	public void borrarBus(int numero) {
		for (Bus bus : listaBus) {
			if(bus.getNumero() == numero) {
				listaBus.remove(listaBus.indexOf(bus));
				break;
			}
		}
	}

}









