package LacosRepeticao;

public class Ex1 {

	public static void main(String[] args) {
		/*Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.*/
		
		System.out.println("Os números que dividos por 11 dão resto 0 são: ");
		
		for(int i=1000;i<1999;i++) {
			if (i%11==5) {
				System.out.println(i);
			}
		}

	}

}
