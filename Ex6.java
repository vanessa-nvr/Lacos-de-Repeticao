package LacosRepeticao;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		0(zero).(DO...WHILE)*/
		
		int i=-1,n;
		double soma=0;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Digite um n�mero: ");
			n=ler.nextInt();
			
			if(n%3==0) {
				i++;
				soma+=n;
			}
		}while(n!=0);
		
		if (i==0){
			
		}
		else {
			System.out.printf("A m�dia dos n�meros m�ltiplos de 3 �: %.1f",(soma/i));
		}
	}

}
