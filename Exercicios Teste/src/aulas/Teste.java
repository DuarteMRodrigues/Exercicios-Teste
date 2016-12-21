package aulas;

public class Teste extends MomentoAvaliacao{
	public String local;
	
	public Teste(){
		
	}
	public Teste(String local, Aluno aluno, Integer nota, Integer dificuldade, String data){
		super(aluno, nota, dificuldade, data);
		this.local=local;
	}
	
	public String getLocal(){
		return local;
	}
	public void setLocal(String local){
		this.local=local;
	}
}
