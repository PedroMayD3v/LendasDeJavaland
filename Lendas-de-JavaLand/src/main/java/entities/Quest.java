package entities;

import entities.Character;
import entities.Enemy;
import entities.Wizard;

public class Quest {
	
	private String name;
	private Integer level;
	private String description;
	private Character character;
	private Enemy enemy;
	
	
	public Quest(String name, Integer level, String description) {
		this.name = name;
		this.level = level;
		this.description = description;
		this.character = new Wizard();
		this.enemy = enemy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void questLevelOne(Integer correctNumber, Character charr, Enemy enemie) {
			if(correctNumber == 5) {
				System.out.println("Você acertou o numero!");
				enemie.setStrenght(50.0);
				System.out.println();
				
			} else if(correctNumber != 5){
				charr.setHealth(150.0);
				System.out.println("Você tomou um dano de 50");
			}
		}
		
	}