package by.htp.pc;

public class Cpu {
	private String model;
	private int frequency;
	
	public Cpu(String model, int frequency ) {
		this.model = model;
		this.frequency = frequency;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	
	

}
