package dia4;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		int valor[]={1,0,5,-2,-5,7};
		int x,soma=0;
		Scanner read = new Scanner(System.in);
		soma = valor[0]+valor[1]+valor[5];
		for(x=0;x<6;x++) {
			if(x==3) {
				valor[x]=100;
			}
		}
		
		System.out.println("Os valores do vetor A são:");
		for(x=0;x<6;x++) {
			System.out.println(valor[x]);
		}
		System.out.println("E o resultado da soma pedida é: "+soma);
	}

}
