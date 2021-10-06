package dia4;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		int n1[][]= new int[2][2];
		int n2[][]= new int[2][2];
		int n3[][]= new int[2][2];
		int soma=0,somad=0,linha,coluna,op;
		
		Scanner read = new Scanner(System.in);
		
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.printf("Entre com o valor [%d][%d] da primeira matriz: ",linha+1,coluna+1);
				n1[linha][coluna]= read.nextInt();
				System.out.printf("Entre com o valor [%d][%d] da segunda matriz: ",linha+1,coluna+1);
				n2[linha][coluna]= read.nextInt();
			}
		}
		System.out.println("\nDigite que operação você quer fazer com essas matrizes.");
		System.out.println("\n(1) somar as duas matrizes ");
		System.out.println("\n(2) subtrair a primeira matriz da segunda  ");
		System.out.println("\n(3) adicionar uma constante as duas matrizes ");
		System.out.println("\n(4) imprimir as matrizes  ");
		op = read.nextInt();
		
		
		switch(op){
		
		case 1: for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				n3[linha][coluna]=n1[linha][coluna]+n2[linha][coluna];
				System.out.printf("[%d]",n3[linha][coluna]);
			}
			System.out.println();
		}
			break;
		
		case 2: 
			
			for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				n3[linha][coluna]=n1[linha][coluna]-n2[linha][coluna];
				System.out.printf("[%d]",n3[linha][coluna]);
			}
			System.out.println();
		}
			break;
		
		case 3:
			System.out.println("Informe o valor da constante:  ");
			int constante = read.nextInt();
			for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				n1[linha][coluna]+=constante;
				n2[linha][coluna]+=constante;
			}
		}
			System.out.println("O resultado da matriz 1 com a adição da constante é: \n");
			for(linha=0;linha<2;linha++) {
				for(coluna=0;coluna<2;coluna++) {
					System.out.printf("[%d]",n1[linha][coluna]);
				}
				System.out.println();
			}
			System.out.println("O resultado da matriz 2 com a adição da constante é: \n");
			for(linha=0;linha<2;linha++) {
				for(coluna=0;coluna<2;coluna++) {
					System.out.printf("[%d]",n2[linha][coluna]);
				}
				System.out.println();
			}
			
			break;
			
		case 4: 
			System.out.println("Os valores da matriz 1:\n");
			for(linha=0;linha<2;linha++) {
				for(coluna=0;coluna<2;coluna++) {
					System.out.printf("["+n1[linha][coluna]+"]");
			}
				System.out.println();
		}
			System.out.println("Os valores da matriz 2:\n");
			for(linha=0;linha<2;linha++) {
				for(coluna=0;coluna<2;coluna++) {
					System.out.print("["+n2[linha][coluna]+"]");
			}
				System.out.println();
		}
			break;
		
		default: 
			System.out.println("Você inseriu outro valor.");
			
		}
		
		
	}

}
