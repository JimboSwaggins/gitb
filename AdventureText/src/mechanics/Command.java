package mechanics;

public class Command {
	boolean isUnlocked;
	String displayName;
	String description;
	
	public Command(String name, boolean isUnlocked, String description) {
		this.displayName = name;
		this.isUnlocked = isUnlocked;
		this.description = description;
	}
}
