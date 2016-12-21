package teste;

import java.util.Scanner;

public class Exercicio3 {

	public Exercicio3() {
		Scanner scan = new Scanner(System.in);
		int jogo1=0,jogo2=0,jogo3=0,jogo4=0;
		float media=0;
		
		do{
			System.out.print("Insira quantos golos foram marcados no primeiro jogo: ");
			jogo1 = scan.nextInt();
		}while(jogo1<0);
		
		media+=jogo1;
		
		do{
			System.out.print("\nInsira quantos golos foram marcados no segundo jogo: ");
			jogo2 = scan.nextInt();
		}while(jogo2<0);
		
		media+=jogo2;
		
		do{
			System.out.print("\nInsira quantos golos foram marcados no terceiro jogo: ");
			jogo3 = scan.nextInt();
		}while(jogo3<0);
		
		media+=jogo3;
		
		do{
			System.out.print("\nInsira quantos golos foram marcados no quarto jogo: ");
			jogo4 = scan.nextInt();
		}while(jogo4<0);
		
		media+=jogo4;
		
		media/=4;
		System.out.print("\nEm media o jogador marcou "+media+" golos por jogo");
	}

}
