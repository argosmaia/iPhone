/**
 * 
 */
package iPhoneAparelhoTelefonico;

import aparelhoTelefonico.AparelhoTelefonico;
import iPhone.IPhone;

/**
 * @author argosmaia
 *
 */
public class IPhoneAparelhoTelefonico extends IPhone implements AparelhoTelefonico {

	/**
	 * @param modelo
	 * @param numeroDeSerie
	 * @param capacidadeArmazenamento
	 * @param cor
	 */
	public IPhoneAparelhoTelefonico(String modelo, String numeroDeSerie, int capacidadeArmazenamento, String cor) {
		super(modelo, numeroDeSerie, capacidadeArmazenamento, cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void conectarLigacao() {
		System.out.println("Ligação conectada.");
    }

	@Override
	public void encerrarLigacao() {
		System.out.println("Ligação encerrada.");
    }

	@Override
	public void verificarSinal() {
		System.out.println("Verificando sinal...");
    }

}
