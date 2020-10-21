package lt.vtmc.adapter1;

public class MicroSDMemoryCard extends AbstractMemoryCard{

	@Override
	void insert() {
		System.out.println("Micro SC card inserted ...");		
	}

	@Override
	void copyDataToComputer() {
		System.out.println("Data copying from micro SD card to computer ...");		
	}

}
