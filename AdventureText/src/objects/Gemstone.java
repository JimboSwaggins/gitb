package objects;

public class Gemstone extends Loot{
	protected double size;
	protected double clarity;
	
	public enum GEMSTONE_TYPE{
		DIAMOND, BERYL_EMERALD, BERYL_RUBY, BERYL, MOONSTONE, ONYX, QUARTZ
	}
	
	public Gemstone(double size, String name, double clarity) {
		super(name);
		this.size = size;
		this.clarity = clarity;
		this.objType = type.GEMSTONE;
	}
	
	public double getClarity() {return this.clarity;}
	public double getSize() {return this.size;}
	
	public void setSize(int newSize) {this.size = newSize;}
	public void setClarity(double newClarity) {this.clarity = newClarity;}
}

class cutGemstone extends Gemstone{
	private double quality;
	
	public double getQuality() {return this.quality;}
	public void setQuality(double newQuality) {this.quality = newQuality;}
	
	public cutGemstone(double skill, double size, String name, double clarity) {
		super(size, name, clarity);
		this.size = (clarity/1 * size * (skill/size));
	
	}
	
}