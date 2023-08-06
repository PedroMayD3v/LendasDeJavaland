package entities;

import java.util.ArrayList;
import java.util.List;

public class World {

	private String name;
	private String description;
	private Double[][] size;
	private List<Character> character;
	private Map map;

	public World(String name, String description, Character character) {
		this.name = name;
		this.description = description;
		this.size = size;
		this.character = new ArrayList<>();
		this.map = new Map();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void addCharacter(Character character) {
		this.character.add(character);
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

}