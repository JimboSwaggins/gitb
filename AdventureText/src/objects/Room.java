package objects;

import java.util.Vector;

public class Room extends GameObject{
	private Vector<GameObject> roomObjects;
	private Vector<Exit> exits;
	private String roomDesc;
	
	public void addExit(Exit exit){
		exits.addElement(exit);
	}
	
	public Room(){
		super(null);
		this.setType(type.ROOM);
	}

	public Vector<GameObject> getRoomObjects() {
		return roomObjects;
	}

	public void setRoomObjects(Vector<GameObject> roomObjects) {
		this.roomObjects = roomObjects;
	}

	public String getRoomDesc() {
		return roomDesc;
	}

	public void setRoomDesc(String roomDesc) {
		this.roomDesc = roomDesc;
	}
}