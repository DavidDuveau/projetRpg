package Monsters;

public class Monster {
	private int health_pt;
	private int level = 1;
	private int strengh;
	private int agility;
	private int intelligence;

	public Monster() {

	}

	public Monster(int health_pt, int level, int strengh, int agility, int intelligence) {
		super();
		this.health_pt = health_pt;
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

}
