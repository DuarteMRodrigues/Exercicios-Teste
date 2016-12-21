package aulas;

public class ProvaOral extends MomentoAvaliacao {
	private Integer fluencia;
	public Integer dominioMateria;
	
	public ProvaOral(){
		
	}
	public ProvaOral(Integer fluencia, Integer dominioMateria, Aluno aluno, Integer nota, Integer dificuldade, String data){
		super(aluno, nota, dificuldade, data);
		this.fluencia=fluencia;
		this.dominioMateria=dominioMateria;
	}
	
	public Integer getFluencia(){
		return fluencia;
	}
	public void setFluencia(Integer novaFluencia){
		this.fluencia=novaFluencia;
	}
	
	public Integer getDominioMateria(){
		return dominioMateria;
	}
	public void setQuestoes(Integer dominioMateria){
		this.dominioMateria=dominioMateria;
	}
}
