package aulas;

public class Aluno {
	private String nome;
	private String turma;
	private Integer numero;
	
	public Aluno(){
		
	}
	
	public Aluno(String nome, String turma, Integer numero){
		this.nome=nome;
		this.turma=turma;
		this.numero=numero;
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome=nome;
	}
	
	public String getTurma(){
		return turma;
	}
	public void setTurma(String turma){
		this.turma=turma;
	}
	
	public Integer getNumero(){
		return numero;
	}
	public void setNumero(Integer numero){
		this.numero=numero;
	}
}
