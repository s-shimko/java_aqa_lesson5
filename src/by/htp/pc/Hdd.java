package by.htp.pc;

public class Hdd {
	private String model;
	private int capacity;
	private int numberOfViruses;
	
	public Hdd(String model, int capacity) {
		this.model = model;
		this.capacity = capacity;
	}
	
	public Hdd(String model, int capacity, int numberOfViruses) {
		this.model = model;
		this.capacity = capacity;
		this.numberOfViruses = numberOfViruses;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getNumberOfViruses() {
		return numberOfViruses;
	}

	public void setNumberOfViruses(int numberOfViruses) {
		this.numberOfViruses = numberOfViruses;
	}


	
	
	

}
