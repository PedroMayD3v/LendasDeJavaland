package entities;


import attacks.WizardSpells;
import exception.PowerException;

public class Wizard extends Character implements WizardSpells {

	private String name;
	private Double mana;
	private Double health;

	public Wizard(String name, Double mana, Double health) {
		super(name, mana, health);
		this.mana = 50.0;
	}

	public Wizard() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMana() {
		return mana;
	}

	public void setMana(Double mana) {
		this.mana = mana;
	}

	public Double getHealth() {
		return health;
	}

	public void setHealth(Double health) {
		this.health = health;
	}

	@Override
	public Double useCure(Double mana, Double health) {
		if (mana < 150) {
			throw new PowerException("Está lhe faltando mana, faça algumas quests para conseguir mais " + getName());
		} else if (mana > 150) {
			// Deduzir a quantidade de mana gasta da mana atual
			setMana(getMana() - mana);

			// Adicionar a quantidade de mana gasta à saúde atual
			setHealth(getHealth() + mana); // Assumindo que 150 de mana equivale a 150 de cura

			// Retornar o novo valor da saúde após a cura
			return getHealth();
		}

		// Se a mana for insuficiente, retornar o valor atual da saúde sem modificá-lo
		return health;
	}

	@Override
	public Double useFireball(Double mana) {
		// TODO Auto-generated method stub
		return null;
	}

}
