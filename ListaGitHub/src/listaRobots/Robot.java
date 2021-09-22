package listaRobots;

public class Robot implements Comparable<Robot>{
	private int codigo;
	private int tipo;
	private Integer porVida;
	/**
	 * @param tipo
	 * @param porVida
	 */
	public Robot(int codigo,int tipo, int porVida) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.porVida = porVida;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the tipo
	 */
	public int getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(int Integer) {
		this.tipo = tipo;
	}
	/**
	 * @return the porVida
	 */
	public Integer getPorVida() {
		return porVida;
	}
	/**
	 * @param porVida the porVida to set
	 */
	public void setPorVida(int porVida) {
		this.porVida = porVida;
	}
	@Override
	public String toString() {
		return "Codigo "+this.codigo + " Tipo " + tipo + ", porVida=" + porVida;
	}
	
	@Override
	public int compareTo(Robot r) {
		// TODO Auto-generated method stub
		return this.porVida.compareTo(r.getPorVida());
		
	}
	
}



