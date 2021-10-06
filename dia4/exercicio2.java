package dia4;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int dado[] = new int[10];
		float somadado=0,media,maior=0,maiorx=0;
		int x;
		
		Scanner read = new Scanner(System.in);
		
		for(x=0;x<10;x++) {
			System.out.println("Digite o resultado do dado.");
			dado[x] = read.nextInt();
			while(dado[x]<1 || dado[x]>6) {
				System.out.println("Digite o resultado do dado válido.");
				dado[x] = read.nextInt();
			}
		}
		for(x=0;x<10;x++) {
			somadado+=dado[x];			
		
		if(dado[x]>maior) {
			maiorx=1;
			maior=dado[x];
		}
		else if(dado[x]==maior){
			maiorx++;
			}
		}
		System.out.printf("\nO valor da média dos dados foi %.2f",somadado/10);
		System.out.println("\nE o número de vezes que o "+maior+" caiu, foram "+maiorx+" vezes");
	}

}
