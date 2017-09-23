package objects;

public class Organic extends GameObject{
	public Organic(String displayName) {
		super(displayName);
		// TODO Auto-generated constructor stub
	}
	protected int Level;
	
	//Health related variables
	protected int BaseHealth;
	protected int Health;
	
	//Health related getters and setters
	public void setBaseHealth(int newBaseHealth){this.BaseHealth = newBaseHealth;}
	public int getBaseHealth() {return this.BaseHealth;}
	
	public void setHealth(int toHealth) {this.Health = toHealth;}
	public void getHealth(int toDo) {this.Health += toDo;}
	/**	If health is greater than base health (overhealing),
	*	it should slowly decrease back down to base health on its own, based on how far above
	*	the maximum it is (maybe have a logarithmic progression?)
	*/ 	
	
	//Mana related variables
	protected int BaseMana;
	protected int Mana;
	
	public void setBaseMana(int newBaseMana) {this.BaseMana = newBaseMana;}
	public int getBaseMana() {return this.BaseMana;}
	
	public void manaCost(int manaCost) {
		if(manaCost >= Mana) {
			//Uses health to cover the unpaid mana usage
			Health += (Mana - manaCost);
		}
	}
}
