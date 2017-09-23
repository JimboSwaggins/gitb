package objects;

public abstract class Loot extends GameObject{
	
	
	public Loot(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	//Monetary Value of the item
	protected int value;
	
	public void setValue(int newValue){this.value = newValue;}
	public int getValue() {return this.value;}
	
	
}
