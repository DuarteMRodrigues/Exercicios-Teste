package indie;

public class Player extends SensibleDummy{
	private Integer fatigue;
	private Integer attack;
	private Integer defence;
	private char faceTo;
	
	public Player(){
		
	}
	public Player(Integer fatigue, Integer attack, Integer defence, char faceTo, String nome, String cor){
		super(nome, cor);
		this.fatigue=fatigue;
		this.attack=attack;
		this.defence=defence;
		this.faceTo=faceTo;
	}
	
	public Integer getFatigue(){
		return fatigue;
	}
	public void setFatigue(Integer fatigue){
		this.fatigue=fatigue;
	}
	
	public Integer getAttack(){
		return attack;
	}
	public void setAttack(Integer attack){
		this.attack=attack;
	}
	
	public Integer getDefence(){
		return defence;
	}
	public void setDefenc(Integer defence){
		this.defence=defence;
	}
	
	public char getFaceTo(){
		return faceTo;
	}
	public void setFaceTo(char faceTo){
		this.faceTo=faceTo;
	}
}
