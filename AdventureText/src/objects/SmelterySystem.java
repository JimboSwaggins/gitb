package objects;

public class SmelterySystem extends GameObject{
	private boolean isActive;
	
	public boolean getIsActive() {return isActive;}
	public void setIsActive(boolean toSet) {isActive = toSet;}
	
	public SmelterySystem() {
		super("Foundry");
		isActive = false;
	}
}
