/* Abstract class for enemy. Different than character class
   Only called on random encounter -> create abstract methods for getting/setting stats
   On hp = 0 -> drop currency/item/etc...
   seed -> stats based on how far in map player character is*/

package assignment_3;

public abstract class enemy{
	private int hp = 0;
	private int armour = 0;
	private double evasion = 0;
	
	protected void setHP(int hp){
		this.hp = hp;
	}
	protected int getHP(){
		return hp;
	}
	protected void setArmour(int armour){
		this.hp = hp;
	}
	protected int getArmour(){
		return hp;
	}

	protected void setEvasion(int evasion){
		this.hp = hp;
	}
	protected int getEvasion(){
		return evasion;
	}
	public abstract int randHP(int seed);
	public abstract int randArmour(int seed);
	public abstract double randEvasion(int seed);
	
}