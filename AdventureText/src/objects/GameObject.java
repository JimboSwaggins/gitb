package objects;

import java.util.ArrayList;
public abstract class GameObject{
	protected type objType; 
	protected String displayName;
	
	public String getDisplayName() {return this.displayName;}
	public void setDisplayName(String newName) {this.displayName = newName;}
	public ArrayList<GameObject> inventory = new ArrayList<GameObject>();
	
	
	public GameObject(String displayName) {
		this.displayName = displayName;
	}
	
	protected enum type{
		ROOM, WEAPON, FURNITURE, GEMSTONE, EXIT, KEY
	}
	
	public void add(GameObject toInsert) {
		this.add(toInsert);
	}
	
	public void remove(GameObject toRemove) {
		this.remove(toRemove);
	}
	
	public void setType(type newClass) {
		this.objType = newClass;
	}
	
	protected boolean getAKey(int KeyID) {
		for(int i = 0; i < inventory.size();i++) {
			if(inventory.get(i).objType.equals(type.KEY)) {
				Key tempKey = (Key)inventory.get(i);
				if(tempKey.getKeyID() == KeyID) {
					return true;
				}
			}
		}
		return false;
	}
}
