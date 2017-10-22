package by.htp.pc;

public class Cdrom {
	private String model;
	private int speed;
	
	public Cdrom (String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
		
}
