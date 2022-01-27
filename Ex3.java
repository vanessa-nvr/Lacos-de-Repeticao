package LacosRepeticao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99.*/
		
		int idade = 0, j = 0, i = 0;
		
		Scanner ler=new Scanner(System.in);
				
		while(idade!=-99) {
			System.out.println("Digite a idade: ");
			idade=ler.nextInt();
			if (idade<21 && idade>=0) {
				j++;
			}
			if(idade>50) {
				i++;
			}
		}
		System.out.println("Total de pessoas com menos de 21 anos: "+j);
		System.out.println("Total de pessoas com mais de 50 anos: "+i);
	}

}
