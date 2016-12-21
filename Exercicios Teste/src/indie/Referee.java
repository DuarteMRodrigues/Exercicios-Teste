package indie;

public class Referee extends SensibleDummy{
	private Integer strickness;
	
	public Referee(){
		
	}
	public Referee(Integer strickness, String nome, String cor){
		super(nome, cor);
		this.strickness=strickness;
	}
	
	public Integer getStrickness(){
		return strickness;
	}
	public void setStrickness(Integer strickness){
		this.strickness=strickness;
	}
}
