package teste;

import java.util.Scanner;

public class Exercicio4 {

	public Exercicio4() {
		Scanner scan = new Scanner(System.in);
		int pessoas=0,dinheiroCamisolas=0;
		float dinheiroBilhetes=0;
		char opt;
		
		System.out.print("Insira \"c\" se o adepto utilizar camisola do clube ou \"n\" se utilizar roupa normal.\n\nInsira \"s\" para parar.\n\n");
		do{
			System.out.print("Insira a opção: ");
			opt = scan.next().charAt(0);
			if(opt=='c'){
				dinheiroCamisolas+=14;
			    dinheiroBilhetes+=7.5;
				pessoas++;	
			}else if(opt=='n'){
				dinheiroBilhetes+=7.5;
				pessoas++;
			}
		}while(opt!='s');
		
		System.out.print("Houveram "+pessoas+" bilhetes comprados.\nO dinheiro dos bilhetes foi: "+dinheiroBilhetes+"€\nO dinheiro das camisolas foi: "+dinheiroCamisolas+"€");
	}

}
