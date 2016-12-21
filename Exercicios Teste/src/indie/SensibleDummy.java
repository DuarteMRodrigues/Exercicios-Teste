package indie;

public abstract class SensibleDummy {
	private String nome;
	private String cor;
	
	public SensibleDummy(){
		
	}
	public SensibleDummy(String nome, String cor){
		this.nome=nome;
		this.cor=cor;
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome=nome;
	}
	
	public String getCor(){
		return cor;
	}
	public void setCor(String cor){
		this.cor=cor;
	}
	
	public void move(Integer x, Integer y){
		
	}
}
