package listaRobots;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 
 * @author william
 *
 */
public class Juego {
	private ArrayList<Robot> listaRobot;
	private int codigo=100;
	/**
	 * 
	 */
	public Juego() {
		this.listaRobot =new ArrayList<Robot>();
	}
	/**
	 * Crea una lista de nodos en el dato a signa una instancia de la clase Robot
	 * Adiciona al inicio si el procentaje de vida es menor a 45
	 */
	public void crearLista() {
		int elem = (int) (Math.random()*(20-10)+10);
		for (int i = 0; i < elem; i++) {
			codigo++;
			int porVida =(int) (Math.random()*(100-10)+10);
			if(porVida < 45)
				listaRobot.add(0,new Robot(codigo,1,porVida));
			else
				listaRobot.add(new Robot(codigo,1,porVida));
		}
	}
	/**
	 * 
	 */
	public void mostrar() {
		System.out.println();
		listaRobot.forEach(System.out::println);
		
	}
	/**
	 * 
	 */
	public void muestra60() {
		int numero=0;
		for (Robot robot : listaRobot) {
			if(robot.getPorVida() > 60) {
				System.out.println(robot);
				numero++;
			}
		}
		System.out.println("Numero de Robots com mas 60% de vida " + numero);
	}
	/**
	 * 
	 */
	public void muestaNemores() {
		for(int i=0; i < 3 ;i++) {
			System.out.println(listaRobot.get(i));
		}
	}
	/**
	 * 
	 * @param por
	 */
	public void disminuir(int por) {
		int numero=0;
		for (Robot robot : listaRobot) {
			if(robot.getPorVida() >= 30 && robot.getPorVida() <= 50) {
				robot.setTipo(robot.getPorVida() - 15);
				numero++;
			}
		}
		System.out.println("Numero total de robots modificados " + numero);
	}
	
}
