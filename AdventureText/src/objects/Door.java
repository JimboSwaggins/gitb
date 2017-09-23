package objects;

public class Door extends Exit {
	protected boolean open;
	protected boolean locked;
	@SuppressWarnings("unused")
	private int keyID;
	
	public Door(int direction, Room leadsTo, boolean openState, boolean lockState) {
		super(direction, leadsTo);
		this.open = openState;
		this.locked = lockState;
	}
	
	public Door(int direction, Room leadsTo, boolean openState, boolean lockState, int keyID) {
		super(direction, leadsTo);
		this.open = openState;
		this.locked = lockState;
		this.keyID = keyID;
	}
	
	public void tryToOpen() {
		if(!locked&&!open){
			open = true;
		}if(locked&&!open) {
			
		}
	}
}
