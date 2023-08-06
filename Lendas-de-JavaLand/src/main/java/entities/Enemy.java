package entities;

public abstract class Enemy  {

	private String name;
	private Double strenght;
	private Double hp;
	
	public Enemy(String name, Double strenght, Double health) {
		this.name = name;
		this.strenght = strenght;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getStrenght() {
		return strenght;
	}

	public void setStrenght(Double strenght) {
		this.strenght = strenght;
	}

	public Double getHp() {
		return hp;
	}

	public void setHp(Double hp) {
		this.hp = hp;
	}
	
	
	
	
}
