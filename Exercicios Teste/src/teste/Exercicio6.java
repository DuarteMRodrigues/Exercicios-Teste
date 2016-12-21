package teste;

import java.util.Scanner;

public class Exercicio6 {

	public Exercicio6() {
		Scanner scan = new Scanner(System.in);
		int numero=0,verificador=0,i=0,j=0;
		
		do{
			System.out.print("Insira um numero: ");
			numero = scan.nextInt();
		}while(numero<0);
		
		System.out.print("2\n");
		for(i=3; i<=numero; i+=2){
			for(j=3; j<(i/2); j+=2){
				if(i%j==0)
					verificador++;
			}
			
			if(verificador==0)
				System.out.println(i);
			
			verificador=0;
		}
	}

}
