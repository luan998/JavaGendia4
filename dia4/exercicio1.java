package dia4;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		int valor[]=new int[5];
		int x,maior=0;
		Scanner read = new Scanner(System.in);
		
		for(x=0;x<5;x++) {
			System.out.println("Entre com uma pontuação");
			valor[x]=read.nextInt();
			while(valor[x]<0) {//Não quero que possua valores negativos digitados
				System.out.println("Entre com uma pontuação");
				valor[x]=read.nextInt();
			}
		}
		for(x=0;x<5;x++) {
			System.out.printf("\nO valor da pontuação foi %d",valor[x]);
		}
		for(x=0;x<5;x++) {
			if(valor[x]>maior) {
				maior=valor[x];
			}
		}
		System.out.printf("\nE a maior pontuação digitada foi: %d",maior);
	}

}
