package desafio1;

import java.util.Scanner;

public class Desafio1 {
	
	public static int fibo(int atu, int ant) {
		int f = atu + ant;
		return f;
	}
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("Informe um número: ");
		String nStr = leitura.nextLine();
		int n = 0;
		try {
			n = Integer.valueOf(nStr);
		} catch(Exception e) {
			System.out.println("Erro ao informar número");
		}
		
		if(n == 0 || n == 1) {
			System.out.println("O número " + n + " faz parte da sequência de Fibonacci");
		} else {
			int ant = 1;
			int atu = 1;
			int f = 1;
			while(f<n) {
				f = fibo(atu, ant);
				ant = atu;
				atu = f;
			}
			
			if(f == n) {
				System.out.println("O número " + n + " faz parte da sequência de Fibonacci");
			} else {
				System.out.println("O número " + n + " não faz parte da sequência de Fibonacci");
			}
		}

	}

}
