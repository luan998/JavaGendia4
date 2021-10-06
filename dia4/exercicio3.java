package dia4;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		int n1[][]= new int[3][3];
		int maior=0, linha,coluna;
		
		Scanner read = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.printf("Entre com o valor [%d][%d] da matriz: ",linha+1,coluna+1);
				n1[linha][coluna]= read.nextInt();
				if(n1[linha][coluna]>10) {
					maior++;
				}
			}
		}
		System.out.println("Os números maiores que 10 são:");
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				if(n1[linha][coluna]>10) {
					System.out.print(" "+n1[linha][coluna]);
				}	
			}
		}
		System.out.println("\nA matriz possui "+maior+" números maiores que 10.");
	}

}
