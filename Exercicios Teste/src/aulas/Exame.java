package aulas;

public class Exame extends MomentoAvaliacao{
	private Questao questoes[];
	
	public Exame(){
		
	}
	public Exame(Questao[] questoes, Aluno aluno, Integer nota, Integer dificuldade, String data){
		super(aluno, nota, dificuldade, data);
		this.questoes=questoes;
	}
	
	public Questao[] getQuestoes(){
		return questoes;
	}
	public void setQuestoes(Questao[] questoes){
		this.questoes=questoes;
	}
}
