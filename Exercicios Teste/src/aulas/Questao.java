package aulas;

public class Questao {
	private Integer numero;
	private Integer cotacao;
	private String pergunta;
	
	public Questao(){
		
	}
	public Questao(Integer numero, Integer cotacao, String pergunta){
		this.numero=numero;
		this.cotacao=cotacao;
		this.pergunta=pergunta;
	}
	
	public Integer getNumero(){
		return numero;
	}
	public void setNumero(Integer numero){
		this.numero=numero;
	}
	
	public Integer getCotacao(){
		return cotacao;
	}
	public void setCotacao(Integer cotacao){
		this.cotacao=cotacao;
	}
	
	public String getPergunta(){
		return pergunta;
	}
	public void setPergunta(String pergunta){
		this.pergunta=pergunta;
	}
}
