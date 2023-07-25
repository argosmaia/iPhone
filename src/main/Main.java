package main;

import java.util.ArrayList;
import java.util.Scanner;

import aparelhoTelefonico.AparelhoTelefonico;
import camera.Camera;
import iPhone.IPhone;
import iPhoneAparelhoTelefonico.IPhoneAparelhoTelefonico;
import iPhoneReprodutorMusical.IPhoneReprodutorMusical;
import iPhoneLanterna.IPhoneLanterna;
import iPhoneNavegadorInternet.IPhoneNavegadorInternet;
import lanterna.Lanterna;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {
        ArrayList<Camera> cameras = new ArrayList<>();
        ArrayList<IPhone> iPhones = new ArrayList<>();
        ArrayList<IPhoneAparelhoTelefonico> aparelhosTelefonicos = new ArrayList<>();
        ArrayList<IPhoneReprodutorMusical> reprodutoresMusicais = new ArrayList<>();
        ArrayList<IPhoneNavegadorInternet> navegadoresInternet = new ArrayList<>();
        ArrayList<IPhoneLanterna> lanternas = new ArrayList<>();

        // Exemplo de uso das listas
        cameras.add(new Camera());
        iPhones.add(new IPhone(null, null, 0, null));
        aparelhosTelefonicos.add(new IPhoneAparelhoTelefonico(null, null, 0, null));
        reprodutoresMusicais.add(new IPhoneReprodutorMusical(null, null, 0, null));
        navegadoresInternet.add(new IPhoneNavegadorInternet(null, null, 0, null));
        lanternas.add(new IPhoneLanterna(null, null, 0, null));

        // Simulação da interação do usuário com o iPhone
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("===== iPhone =====");
            System.out.println("1. Fazer chamada");
            System.out.println("2. Reproduzir música");
            System.out.println("3. Navegar na Internet");
            System.out.println("4. Usar lanterna");
            System.out.println("0. Desligar iPhone");
            System.out.print("Escolha a ação desejada: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                	ligar(iPhones);
                    break;
                case 2:
                    reproduzirMusica(reprodutoresMusicais);
                    break;
                case 3:
                    navegarInternet(navegadoresInternet);
                    break;
                case 4:
                    usarLanterna(lanternas);
                    break;
                case 0:
                    System.out.println("Desligando iPhone...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 0);

        scanner.close();
    }

	private static void usarLanterna(ArrayList<IPhoneLanterna> lanternas) {
		System.out.println("Lanterna ligada");
		
	}

	private static void navegarInternet(ArrayList<IPhoneNavegadorInternet> navegadoresInternet) {
		System.out.println("Entrando na internet");
		
	}

	private static void reproduzirMusica(ArrayList<IPhoneReprodutorMusical> reprodutoresMusicais) {
		System.out.println("Tocando musica");
	}

	private static void ligar(ArrayList<IPhone> iPhones) {
		// TODO Auto-generated method stub
		
	}
}