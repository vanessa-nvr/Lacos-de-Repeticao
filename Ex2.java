package LacosRepeticao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		
		Scanner ler = new Scanner(System.in);
		
		int par=0,impar=0;
		
		for (int i=0;i<10;i++) {
			System.out.println("Digite o "+(i+1)+"º número: ");
			int n=ler.nextInt();
			
			if (n%2==0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println("Há "+par+" números pares e "+impar+" números ímpares");
	}

}
