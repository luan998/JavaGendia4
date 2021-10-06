package dia4;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		int n1[][]= new int[3][3];
		int soma=0,somad=0,linha,coluna;
		
		Scanner read = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.printf("Entre com o valor [%d][%d] da matriz: ",linha+1,coluna+1);
				n1[linha][coluna]= read.nextInt();
				soma+=n1[linha][coluna];
			}
		}
		somad=n1[0][0]+n1[1][1]+n1[2][2];
		System.out.println("A soma dos valores da matriz foi: "+soma);
		System.out.println("A soma dos valores da diagonal principal da matriz foi: "+somad);
	}

}
