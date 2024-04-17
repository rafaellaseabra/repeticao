package LPA;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
	 Scanner ler = new Scanner (System.in);
	 String nome;
	 
	 for (int i=0; i < 6; i++ ) {
	   System.out.println( "Qual seu nome: " );
	   nome = ler.next();
	   System.out.println("Meu nome é:" + nome);
		 
	 } 
       ler.close(); 
	}

}
