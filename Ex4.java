package LacosRepeticao;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		/*Uma empresa desenvolveu uma pesquisa para saber as características
		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)
		 o número de pessoas calmas;
		 o número de mulheres nervosas;
		 o número de homens agressivos;
		 o número de outros calmos;
		 o número de pessoas nervosas com mais de 40 anos;
		 o número de pessoas calmas com menos de 18 anos.*/
		
		int i=0,idade,s,h,f=0,m=0,o=0,c=0,menor=0,maior=0;
		
		Scanner ler = new Scanner(System.in);
		
		while(i<150) {
			System.out.println("\nIdade: ");
			idade=ler.nextInt();
			
			System.out.println("Sexo [Digite 1 para feminino, digite 2 para masculino e 3 para outros]: ");
			s=ler.nextInt();
			
			System.out.println("Humor da pessoa[Digite 1 para calma, digite 2 para nervoso e 3 agressiva]: ");
			h=ler.nextInt();
			
			if (s == 1 && h==2) {
				f++;
			}
			else if (s==2 && h==3) {
				m++;
			}
			else if (s==3 && i==1) {
				o++;
			}
			if (h==1) {
				c++;
			}
			if (idade<18 && h==1) {
				menor++;
			}
			else if (idade>40 && h==2) {
				maior++;
			}
			i++;
		}
			
		System.out.println("O número de pessoas calmas: "+c);	
		System.out.println("O número de mulheres nervosas: "+f);
		System.out.println("O número de homens agressivos: "+m);
		System.out.println("O número de outros calmos: "+o);
		System.out.println("O número de pessoas nervosas com mais de 40 anos: "+maior);
		System.out.println("O número de pessoas calmas com menos de 18 anos.: "+menor);

	}

}
