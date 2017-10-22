package by.htp.pc;

import java.util.Date;

public class Pc {
	private String manufacturer;
	private String yearOfIssue;
	private Hdd hdd;
	private Ram ram;
	private Cpu cpu;
	private Cdrom cdrom;
	private boolean pcon = false;
	private int pcCount = 0;

	public Pc() {
	}

	public Pc(String manufacturer, String yearOfIssue) {
		this.manufacturer = manufacturer;
		this.yearOfIssue = yearOfIssue;
	}

	public Pc(String manufacturer, String yearOfIssue, Hdd hdd, Ram ram, Cpu cpu, Cdrom cdrom) {
		this.manufacturer = manufacturer;
		this.yearOfIssue = yearOfIssue;
		this.hdd = hdd;
		this.ram = ram;
		this.cpu = cpu;
		this.cdrom = cdrom;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getYearOfIssue() {
		return yearOfIssue;
	}

	public void setYearOfIssue(String yearOfIssue) {
		this.yearOfIssue = yearOfIssue;
	}

	public Hdd getHdd() {
		return hdd;
	}

	public void setHdd(Hdd hdd) {
		this.hdd = hdd;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	public Cdrom getCdrom() {
		return cdrom;
	}

	public void setCdrom(Cdrom cdrom) {
		this.cdrom = cdrom;
	}

	public boolean isPcon() {
		return pcon;
	}

	public void setPcon(boolean pcon) {
		this.pcon = pcon;
	}

	public int getPcCount() {
		return pcCount;
	}

	public void setPcCount(int pcCount) {
		this.pcCount = pcCount;
	}

	public void pcOn() {
		if (!pcon) {
			pcon = true;
			System.out.println("Pc " + manufacturer + " is ON");
		} else {
			System.out.println("Pc " + manufacturer + " is already ON");
		}
	}

	public void pcOff() {
		if (pcon) {
			pcon = false;
			System.out.println("Pc " + manufacturer + " is OFF");
		} else {
			System.out.println("Pc " + manufacturer + " is already OFF");
		}
	}

	public String scanPc(Pc pc) {
		if (pc.isPcon()) {
			if(pc.getHdd().getNumberOfViruses() > 0) {
				 return "PC is infected! Number of viruses is " + pc.getHdd().getNumberOfViruses();
			} else {
				return "No viruses in " + pc.getManufacturer();
			}
		} else {
			return "Scan error - PC " + pc.getManufacturer() + " is OFF";
		}
	}

}
