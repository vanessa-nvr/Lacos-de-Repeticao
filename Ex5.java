package LacosRepeticao;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		/*Crie um programa que leia um n�mero do teclado at� que encontre um
		n�mero igual a zero. No final, mostre a soma dos n�meros
		digitados.(DO...WHILE)*/
		
		int n, soma=0;
		
		Scanner ler = new Scanner(System.in);
		
		
		do {
			System.out.println("Digite um n�mero: ");
			n=ler.nextInt();
			soma+=n;
		}while(n!=0);
		
		System.out.println("A soma �: "+soma);
	}

}
