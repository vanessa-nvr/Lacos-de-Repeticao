package LacosRepeticao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
		
		Scanner ler = new Scanner(System.in);
		
		int par=0,impar=0;
		
		for (int i=0;i<10;i++) {
			System.out.println("Digite o "+(i+1)+"� n�mero: ");
			int n=ler.nextInt();
			
			if (n%2==0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println("H� "+par+" n�meros pares e "+impar+" n�meros �mpares");
	}

}
