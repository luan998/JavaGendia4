package dia4;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		int n1[][]= new int[4][6];
		int n2[][]= new int[4][6];
		int nsoma[][]= new int[4][6];
		int ndif[][]= new int[4][6];
		int linha,coluna;
		Scanner read = new Scanner(System.in);
		
		for(linha=0;linha<4;linha++) {
			for(coluna=0;coluna<6;coluna++) {
				System.out.printf("Entre com o valor M[%d][%d] da primeira matriz: ",linha+1,coluna+1);
				n1[linha][coluna]=read.nextInt();
			}
		}
		for(linha=0;linha<4;linha++) {
			for(coluna=0;coluna<6;coluna++) {
				System.out.printf("Entre com o valor M[%d][%d] da segunda matriz: ",linha+1,coluna+1);
				n2[linha][coluna]=read.nextInt();
			}
		}
		for(linha=0;linha<4;linha++) {
			for(coluna=0;coluna<6;coluna++) {
				nsoma[linha][coluna]=n1[linha][coluna]+n2[linha][coluna];
				System.out.printf("[%d]",nsoma[linha][coluna]);
			}
			System.out.println();
		}
		for(linha=0;linha<4;linha++) {
			for(coluna=0;coluna<6;coluna++) {
				ndif[linha][coluna]=n1[linha][coluna]-n2[linha][coluna];
				System.out.printf("[%d]",ndif[linha][coluna]);
			}
			System.out.println();
		}
		
	}

}
