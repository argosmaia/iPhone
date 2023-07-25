/**
 * 
 */
package iPhoneReprodutorMusical;

import iPhone.IPhone;
import reprodutorMusical.ReprodutorMusical;
/**
 * @author argosmaia
 *
 */
public class IPhoneReprodutorMusical extends IPhone implements ReprodutorMusical {

	/**
	 * @param modelo
	 * @param numeroDeSerie
	 * @param capacidadeArmazenamento
	 * @param cor
	 */
	public IPhoneReprodutorMusical(String modelo, String numeroDeSerie, int capacidadeArmazenamento, String cor) {
		super(modelo, numeroDeSerie, capacidadeArmazenamento, cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tocarMusica() {
		System.out.println("Tocando música...");
		
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausando música...");
	}

	@Override
	public void ajustarVolume() {
		System.out.println("Ajustando volume...");
	}

}
