package dia4;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int n1[] = new int[10];
		int imparcont=0,somapar=0;
		int x;
		
		Scanner read = new Scanner(System.in);
		
		for(x=0;x<6;x++) {
			System.out.println("\nDigite um número inteiro");
			n1[x] = read.nextInt();
			if(n1[x]%2==0) {
				System.out.printf("O número digitado é um número par, e foi o número %d",n1[x]);
				somapar+=n1[x];
			}
			else {
				System.out.printf("O número digitado é um número impar, e foi o número %d",n1[x]);
				imparcont++;
			}
		}
		
		System.out.printf("\nO valor da soma dos números pares é: %d",somapar);
		System.out.printf("\nA quantidade de números impares digitados foi de: %d",imparcont);
	}
}
