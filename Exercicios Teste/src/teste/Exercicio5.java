package teste;

public class Exercicio5 {

	public Exercicio5() {
		int[] array = {5,2,7};
		int produto=0;
		
		for(int i=0; i<3; i++){
			if(i==0)
				produto=array[i];		
			else{
				produto*=10;
				produto+=array[i];
			}
		}
		
		System.out.print("Produto: "+produto);
	}

}
