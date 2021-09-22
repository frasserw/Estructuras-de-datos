package ListaBuces;
/**
 * 
 * @author willi
 *
 */
public class Bus {
	private int numero;
	private int kilomestro;
	/**
	 * @param numero
	 * @param kilomestro
	 */
	public Bus(int numero, int kilomestro) {
		super();
		this.numero = numero;
		this.kilomestro = kilomestro;
	}
	/**
	 * @return the kilomestro
	 */
	public int getKilomestro() {
		return kilomestro;
	}
	
	
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	@Override
	public String toString() {
		return "Bus [numero=" + numero + ", kilomestro=" + kilomestro + "\n";
	}
	
}
