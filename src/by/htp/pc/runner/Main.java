package by.htp.pc.runner;

import java.awt.PageAttributes.PrintQualityType;
import java.util.Date;

import by.htp.pc.Cdrom;
import by.htp.pc.Cpu;
import by.htp.pc.Hdd;
import by.htp.pc.Pc;
import by.htp.pc.Ram;


/*
Создать объект класса Компьютер, используя классы Винчестер,
Дисковод, Оперативная память, Процессор. Методы: включить, выклю-
чить, проверить на вирусы, вывести на консоль размер винчестера.

Pc(String manufacturer, String yearOfIssue, Hdd hdd, Ram ram, Cpu cpu, Cdrom cdrom)
 */
public class Main {

	public static void main(String[] args) {

		Hdd hdd1 = new Hdd("Seagate", 500);
		Hdd hddBad = new Hdd("Seagate", 1000, 1);
		
		Cdrom cdrom1 = new Cdrom("Nec", 48);
		Cdrom cdrom2 = new Cdrom("Sony", 50);
		Cpu cpu1 = new Cpu("Intel", 100);
		Ram ram1 = new Ram("Alltair", 8);
		
		Pc pc1 = new Pc("Asus", "2000", hdd1, ram1, cpu1, cdrom1);
		Pc pc2 = new Pc("Intel", "2005", hddBad, ram1, cpu1, cdrom1);
		pc2.setCdrom(cdrom2);
		
		pc1.pcOn();
		pc2.pcOn();
		System.out.println("");
		
		printPcReport(pc1);
		printPcReport(pc2);
		
		pc1.pcOff();
		pc2.pcOff();
	}
	
	public static void printPcReport(Pc pc) {
		System.out.println("PC " + pc.getManufacturer() + " " + pc.getYearOfIssue());
		System.out.println("CPU " + pc.getCpu().getModel() + " " + pc.getCpu().getFrequency() + "MHz");
		System.out.println("RAM " + pc.getRam().getModel() + " " + pc.getRam().getCapacity() + "Gb");
		System.out.println("HDD " + pc.getHdd().getModel() + " " + pc.getHdd().getCapacity() + "Gb");
		System.out.println("CDROM " + pc.getCdrom().getModel() + " " + pc.getCdrom().getSpeed() + "Kb/s");
		System.out.println("Scan status: " + pc.scanPc(pc));
		System.out.println("");
	}
	


}
