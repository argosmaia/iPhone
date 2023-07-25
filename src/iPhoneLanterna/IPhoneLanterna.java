package iPhoneLanterna;

import iPhone.IPhone;
import lanterna.Lanterna;

public class IPhoneLanterna extends IPhone implements Lanterna {

	public IPhoneLanterna(String modelo, String numeroDeSerie, int capacidadeArmazenamento, String cor) {
		super(modelo, numeroDeSerie, capacidadeArmazenamento, cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ligarLanterna() {
		System.out.println("Lanterna ligada");

	}

	@Override
	public void desligarLanterna() {
		System.out.println("Lanterna desligada");
	}

}
