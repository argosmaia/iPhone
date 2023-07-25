package iPhoneNavegadorInternet;

import iPhone.IPhone;
import navegadorInternet.NavegadorInternet;

/**
 * @author argosmaia
 *
 */
public class IPhoneNavegadorInternet extends IPhone implements NavegadorInternet {

	/**
	 * @param modelo
	 * @param numeroDeSerie
	 * @param capacidadeArmazenamento
	 * @param cor
	 */
	public IPhoneNavegadorInternet(String modelo, String numeroDeSerie, int capacidadeArmazenamento, String cor) {
		super(modelo, numeroDeSerie, capacidadeArmazenamento, cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void abrirURL(String url) {
		System.out.println("Abrindo URL: " + url);
	}

	@Override
	public void fecharNavegador() {
		System.out.println("Navegador fechado.");
    }

	@Override
	public void pesquisar(String termo) {
		System.out.println("Pesquisando por: " + termo);
    }

}
