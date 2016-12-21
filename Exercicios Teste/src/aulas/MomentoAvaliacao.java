package aulas;

public class MomentoAvaliacao {
	private Aluno aluno;
	private Integer nota;
	private Integer dificuldade;
	private String data;
	
	public MomentoAvaliacao(){
		
	}
	public MomentoAvaliacao(Aluno aluno, Integer nota, Integer dificuldade, String data) {
		this.aluno=aluno;
		this.nota=nota;
		this.dificuldade=dificuldade;
		this.data=data;
	}
	
	public Aluno getAluno(){
		return aluno;
	}
	public void setAluno(Aluno aluno){
		this.aluno=aluno;
	}
	
	public Integer getNota(){
		return nota;
	}
	public void setNota(Integer nota){
		this.nota=nota;
	}
	
	public Integer getDificuldade(){
		return dificuldade;
	}
	public void setDificuldade(Integer dificuldade){
		this.dificuldade=dificuldade;
	}
	
	public String getData(){
		return data;
	}
	public void setData(String data){
		this.data=data;
	}
}
