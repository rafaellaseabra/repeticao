package LPA;

import java.util.Scanner;

public class ATIVIDADE01 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int n;
		System.out.println (" Informe um número: ");
		n = ler.nextInt();
		
		
		for (int  i=0; i <=n; i++) { 
		if (i % 2!= 0){
			System.out.println (" os números impares da sugestão informada: " + i);
		}
		
		}
	}

}
