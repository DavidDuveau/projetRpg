package fr.dta.projet_rpg.Characters;

import Monsters.Monster;

public class Character {
	private int health_pt;
	private int experience_pt;
	private int level = 1;
	private int strengh;
	private int agility;
	private int intelligence;

	public Character() {

	}

	public Character(int health_pt, int experience_pt, int level, int strengh, int agility, int intelligence) {
		super();
		this.health_pt = health_pt;
		this.experience_pt = experience_pt;
		this.level = level;
		this.strengh = strengh;
		this.agility = agility;
		this.intelligence = intelligence;
	}

	public int gethealth_pt() {
		return health_pt;
	}

	public void sethealth_pt(int health_pt) {
		this.health_pt = health_pt;
	}

	public int getexperience_pt() {
		return experience_pt;
	}

	public void setexperience_pt(int experience_pt) {
		this.experience_pt = experience_pt;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getStrengh() {
		return strengh;
	}

	public void setStrengh(int strengh) {
		this.strengh = strengh;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public double physicalAttack(Monster monster) {
		double damage = 0;
		double luck = Math.random() * 0.7;

		double hitchance = 0.7
				+ (this.getLevel() - monster.getLevel() * 0.1 + (this.getAgility() - monster.getAgility()) * 0.05);

		if (hitchance >= 1 || hitchance >= luck) {
			damage = this.getStrengh() * (Math.random() * 12);

		} else {
			damage = 0;

		}
		return damage;

	}

	public double magicAttack(Monster monster) {
		double damage = 0;
		double luck = Math.random() * 0.9;

		double cursechance = 0.9
				+ (this.getLevel() - monster.getLevel() * 0.1 + (this.getAgility() - monster.getAgility()) * 0.05);

		if (cursechance >= 1 || cursechance >= luck) {
			damage = this.getIntelligence() * (Math.random() * 12);

		} else {
			damage = 0;
		}
		return damage;

	}

}
