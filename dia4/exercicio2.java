package dia4;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int n1[] = new int[10];
		int imparcont=0,somapar=0;
		int x;
		
		Scanner read = new Scanner(System.in);
		
		for(x=0;x<6;x++) {
			System.out.println("\nDigite um n�mero inteiro");
			n1[x] = read.nextInt();
			if(n1[x]%2==0) {
				System.out.printf("O n�mero digitado � um n�mero par, e foi o n�mero %d",n1[x]);
				somapar+=n1[x];
			}
			else {
				System.out.printf("O n�mero digitado � um n�mero impar, e foi o n�mero %d",n1[x]);
				imparcont++;
			}
		}
		
		System.out.printf("\nO valor da soma dos n�meros pares �: %d",somapar);
		System.out.printf("\nA quantidade de n�meros impares digitados foi de: %d",imparcont);
	}
}
