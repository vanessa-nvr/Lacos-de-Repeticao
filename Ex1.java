package LacosRepeticao;

public class Ex1 {

	public static void main(String[] args) {
		/*Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.*/
		
		System.out.println("Os n�meros que dividos por 11 d�o resto 0 s�o: ");
		
		for(int i=1000;i<1999;i++) {
			if (i%11==5) {
				System.out.println(i);
			}
		}

	}

}
