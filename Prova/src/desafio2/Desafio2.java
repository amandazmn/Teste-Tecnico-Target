package desafio2;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Informe uma string: ");
		String str = leitura.nextLine();
		str = str.toLowerCase();
		int n = verificarA(str);
		System.out.println("A letra 'a' aparece " + n + " vezes.");
		
	}
	
	public static int verificarA(String str) {
		int n = 0;
		for(int i =0; i < str.length(); i++) {
			if(str.charAt(i)=='a') {
				n++;
			}
		}
		return n;
	}

}
