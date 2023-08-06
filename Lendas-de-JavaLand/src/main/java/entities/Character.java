package entities;

public abstract class Character {

	private String name;
	private Double strenght;
	private Double health;

	public Character(String name, Double strenght, Double health) {
		this.name = name;
		this.strenght = strenght;
		this.health = health;
	}

	public Character() {

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

	public Double getHealth() {
		return health;
	}

	public void setHealth(Double health) {
		this.health = health;
	}

}
