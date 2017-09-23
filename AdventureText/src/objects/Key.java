package objects;

public class Key extends GameObject{
	private int keyID;
	
	public int getKeyID() {return this.keyID;}
	
	public Key(String name,int ID) {
		super(name);
		this.keyID = ID;
	}
}
