package LPA;

import java.util.Scanner;

public class Tabuadaex {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
         int n, resultado;
         System.out.print("Informe um número para TABUADA: ");
         n= ler.nextInt();
         
         for (int i=0; i <=10; i++) {
        	 resultado = n*i;
        	 System.out.println(n + "x" + i + "=" + resultado);
	}
         ler.close();
}
	}
