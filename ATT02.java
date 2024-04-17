package LPA;

import java.util.Scanner;

public class ATT02 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double numero,soma=0, media;

		for (int i=0; i <=4; i++) {
			System.out.println("Informe um valor: ");
			numero=ler.nextDouble();	
			soma = soma+numero;

		}
		media = (soma)/5;
		System.out.println("O resultado dessa soma é: " + soma);
		System.out.println ("O resultado da média é igual a: " + media);

		ler.close();
	}

}
