package mechanics;

import java.util.ArrayList;

import objects.GameObject;
import render.Screen;
 
public class Engine{
	private static String inTake;
	private static boolean toCheck;
	public ArrayList<GameObject> inventory = new ArrayList<GameObject>();
	public Command[] commands;
	
	public String getInTake() {return inTake;}
	public void setInTake(String newInTake) {inTake = newInTake;}
	private GAMESTATE gameState;
	
	
	public static void toggleCheck() {
		toCheck = true;
		System.out.println("ToggleCheck()");
	}
	
	public enum GAMESTATE{
		MAINSCREEN, HELP
	}

	public Engine() {
		this.gameState = gameState.MAINSCREEN;
		commands = new Command[]{newCommand("help [command]",true,
				"-> returns a list of commands,\n or information on a specific command"),
				newCommand("check",true,"-> Returns a true/false on whether a system is online"),
				newCommand("back", true,"-> Returns to the previous screen.")};
		start();
	}

	private String removeSpaces(String input) {
		return input.replaceAll(" ", "");
	}
	
	private void back() {
		switch(gameState) {
		case HELP:
			gameState = GAMESTATE.MAINSCREEN;
			Screen.clearOutput();
			break;
			default:
				break;
		}
	}
	
	private void parseText() {
		System.out.println("Hello");
		inTake = Screen.getInputText();
			switch(gameState) {
			default:
				if(removeSpaces(inTake).equalsIgnoreCase("help")){
					Screen.clearOutput();
					gameState = GAMESTATE.HELP;
					Screen.appendOutput("COMMANDS");
					for(int i = 0; i < commands.length; i++) {
						Screen.appendOutput("",100);
						Screen.appendOutput(commands[i].displayName,100);
						Screen.appendOutput(commands[i].description,100);
					}
					Screen.clearInput();
					toCheck = false;
					inTake = ("");
				}if(removeSpaces(inTake).equalsIgnoreCase("back")) {
					back();
					inTake = ("");
				}
				else {
					Screen.clearInput();
					toCheck = false;
				}
				break;
			}
	}

	private Command newCommand(String name, boolean unlocked, String description) {
		return new Command(name, unlocked, description);
	}
	public void start() {
		Screen.appendOutput("Initializing...",500);
		Screen.appendOutput("Running System Checks",200);
		Screen.appendOutput("Systems Online",400);
		Screen.appendOutput("Welcome to DACS Terminal 002a.");
		Screen.appendOutput("Please input a command.");
		while(true) {
			if(toCheck == true) {
				parseText();
			}else {
				System.out.println(".");
			}
		}
	}
}