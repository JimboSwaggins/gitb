package objects;

public class Exit extends GameObject{
	public static final int UNDEFINED = 0;
	public static final int NORTH = 1;
	public static final int EAST = 2;
	public static final int SOUTH = 3;
	public static final int WEST = 4;
	public static final String[] dirName = {
			"UNDEFINED",
			"NORTH",
			"EAST",
			"SOUTH",
			"WEST"
	};
	private Room leadsTo = null;
	private int direction;
	private String name;
	
	public Exit(){
		super(null);
		setDirection(Exit.UNDEFINED);
		leadsTo = null;
		name = dirName[UNDEFINED];
	}
	
	public Exit(int direction, Room leadsTo){
		super(null);
		this.setType(type.EXIT);
		setDirection(direction);
		if(direction <= dirName.length){
			name = dirName[direction];
		}
		this.leadsTo = leadsTo;
	}
	
	
	public void setDirName(String newDirName){name = newDirName;}
	public String getDirName(){return name;}	
	
	public void setLead(Room newLeadTo){leadsTo = newLeadTo;}
		
	public Room getLead(){return leadsTo;}

	public int getDirection() {return direction;}
	public void setDirection(int tDirection) {this.direction = tDirection;}
}
