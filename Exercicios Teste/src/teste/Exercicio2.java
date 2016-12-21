package teste;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

	public Exercicio2() {
		Scanner scan = new Scanner(System.in);
		int numero=0,aux=0,contador=0;
		char carater;
		
		Random rand = new Random();
		numero = rand.nextInt(10);
		aux=numero;
		
		do{
			System.out.println("O Numero é: "+numero+"\n");
			do{
				System.out.print("Insira se o numero vai ser maior ou menor: "); 
				carater = scan.next().charAt(0);
			}while(carater!='c'&&carater!='b'&&carater!='C'&&carater!='B');
			
			do
				numero = rand.nextInt(10);
			while(numero==aux);
			
			if(aux<numero&&(carater=='c'||carater=='C')){
				aux=numero;
				contador++;
			}else if(aux>numero&&(carater=='b'||carater=='B')){
				aux=numero;
				contador++;
			}else
				break;
		}while(numero>=0);
		
		System.out.println("\nO numero era: "+numero+"!");
		System.out.println("\nAcertou "+contador+" vezes antes de perder");
	}
}
