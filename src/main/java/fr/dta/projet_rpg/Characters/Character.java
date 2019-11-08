package fr.dta.projet_rpg.Characters;

import Monsters.Monster;

public class Character {
	String name;
	private double health_pt;
	private double experience_pt;
	private double level = 1;
	private double strengh;
	private double agility;
	private double intelligence;

	public Character() {

	}

	public Character(double health_pt, double experience_pt, double level, double strengh, double agility, double intelligence, String name) {
		super();
		this.health_pt = health_pt;
		this.experience_pt = experience_pt;
		this.level = level;
		this.strengh = strengh;
		this.agility = agility;
		this.intelligence = intelligence;
		this.name = name;
	}

	public double getHealth_pt() {
		return health_pt;
	}

	public void setHealth_pt(double health_pt) {
		this.health_pt = health_pt;
	}

	public double getExperience_pt() {
		return experience_pt;
	}

	public void setExperience_pt(double experience_pt) {
		this.experience_pt = experience_pt;
	}

	public double getLevel() {
		return level;
	}

	public void setLevel(double level) {
		this.level = level;
	}

	public double getStrengh() {
		return strengh;
	}

	public void setStrengh(double strengh) {
		this.strengh = strengh;
	}

	public double getAgility() {
		return agility;
	}

	public void setAgility(double agility) {
		this.agility = agility;
	}

	public double getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(double intelligence) {
		this.intelligence = intelligence;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double physicalAttack(Monster monster) {
		double damage = 0;
		double luck = Math.random();

		double hit_chance = 0.7 //chance for the player to touch the monster
				+ (this.getLevel() - monster.getLevel() * 0.1 + (this.getAgility() - monster.getAgility()) * 0.05);

		if (hit_chance >= 1 || hit_chance >= luck) { //touch if the luck is 
			damage = this.getStrengh() * (Math.random() * 12);

		} else {
			damage = 0;

		}
		return damage;

	}

	public double magicAttack(Monster monster) {
		double damage = 0;
		double luck = Math.random() * 0.9;

		double curse_chance = 0.9
				+ (this.getLevel() - monster.getLevel() * 0.1 + (this.getAgility() - monster.getAgility()) * 0.05);

		if (curse_chance >= 1 || curse_chance >= luck) {
			damage = this.getIntelligence() * (Math.random() * 12);

		} else {
			damage = 0;
		}
		return damage;

	}

	@Override
	public String toString() {
		return " health=" + health_pt + ", \n"
				+ "experience=" + experience_pt + ", \n"
				+ "level=" + level + ", \n"
				+ "strengh=" + strengh + ", \n"
				+ "agility=" + agility + ", \n"
				+ "intelligence=" + intelligence + "";
	}
	
	

}
