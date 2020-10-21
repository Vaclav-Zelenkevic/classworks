package lt.vtmc.facade1;

public class ComputerFacade {
	private Cpu cpu;
	private Memory memory;
	private HardDisk hdd;
	
	public ComputerFacade() {
		this.cpu = new Cpu();
		this.memory = new Memory();
		this.hdd = new HardDisk();
	}
	
	public void copyingData() {
		hdd.readData();
		memory.loadData();
		cpu.processingData();
		hdd.writeData();
	}
}
