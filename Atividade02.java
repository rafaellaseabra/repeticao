package LPA;

import java.util.Scanner;

public class Atividade02 {
	public static void main(String[] args) {
		
		Scanner ler= new Scanner (System.in);
				
	     double n1,n2, n3, n4, n5,soma, media;
	     
		System.out.print ("informe o primeiro valor: "); 
		n1= ler.nextDouble();
		
		System.out.print ("informe o segundo valor: ");
		n2= ler.nextDouble();
		
		System.out.print ("informe o terceiro valor: ");
		n3= ler.nextDouble();
		
		System.out.print ("informe o quarto valor: "); 
		n4= ler.nextDouble();
		
		System.out.print ("informe o quinto valor: "); 
		n5= ler.nextDouble();
		
		media = (n1 + n2 + n3 + n4 + n5)/5;
		soma = (n1 + n2 + n3 + n4 + n5);
		System.out.print ("O valor da media é:" + media);
		System.out.print ("O valor da soma é:" + soma);
		
		
			
		
		
	}
}