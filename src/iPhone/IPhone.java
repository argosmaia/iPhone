package iPhone;

/**
 * @author argosmaia
 *
 */
public class IPhone {
	private String modelo;
	private String numeroDeSerie;
	private int capacidadeArmazenamento;
    private String cor;
	/**
	 * @param modelo
	 * @param numeroDeSerie
	 * @param capacidadeArmazenamento
	 * @param cor
	 */
	public IPhone(String modelo, String numeroDeSerie, int capacidadeArmazenamento, String cor) {
		this.modelo = modelo;
		this.numeroDeSerie = numeroDeSerie;
		this.capacidadeArmazenamento = capacidadeArmazenamento;
		this.cor = cor;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the numeroDeSerie
	 */
	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}
	/**
	 * @param numeroDeSerie the numeroDeSerie to set
	 */
	public void setNumeroDeSerie(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}
	/**
	 * @return the capacidadeArmazenamento
	 */
	public int getCapacidadeArmazenamento() {
		return capacidadeArmazenamento;
	}
	/**
	 * @param capacidadeArmazenamento the capacidadeArmazenamento to set
	 */
	public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
		this.capacidadeArmazenamento = capacidadeArmazenamento;
	}
	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}
	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}
    
	public void ligar() {
		System.out.println("iPhone ligado");
	}
	
	public void desligar() {
		System.out.println("iPhone desligado");
	}
	
	public void enviarMensagem(String destinatario, String mensagem) {
        System.out.println("Enviando mensagem para " + destinatario + ": " + mensagem);
    }
	
	public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero);
    }
}
