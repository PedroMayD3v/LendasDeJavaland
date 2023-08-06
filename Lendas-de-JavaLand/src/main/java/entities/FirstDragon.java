package entities;

import attacks.DragonAttack;

public class FirstDragon extends Enemy implements DragonAttack {

	private Character charr;
	private World world;
	private String name;
	private Double strenght;
	private Double health;
	
	public FirstDragon(String name, Double strenght, Double health) {
		super(name, strenght, health);
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

	public Character getCharr() {
		return charr;
	}

	@Override
	public Double fireBall(Double strenght) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double earthQuake() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double flyAway() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
