package mechanics;

public class Dice {		
	public long roll(int x) {
		return System.currentTimeMillis() % x;
	}
}
