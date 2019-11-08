package fr.dta.projet_rpg.Characters;

public class Warrior extends Character {
	private int health_pt = 300;
	private int experience_pt = 0;
	private int level = 1;
	private int strengh = 10;
	private int agility = 8;
	private int intelligence = 6;

	public Warrior() {
	}

	public Warrior(int health_pt, int experience_pt, int level, int strengh, int agility, int intelligence) {
		super();
		this.health_pt = health_pt;
		this.experience_pt = experience_pt;
		this.level = level;
		this.strengh = strengh;
		this.agility = agility;
		this.intelligence = intelligence;
	}

	public void level_up(Warrior warrior) {
		setStrengh(warrior.getStrengh() + 4);
		setAgility(warrior.getAgility() + 1);
		setIntelligence(warrior.getIntelligence() + 1);
		setHealth_pt(warrior.getHealth_pt() + warrior.getHealth_pt() * 0.1);
		
	}

}
