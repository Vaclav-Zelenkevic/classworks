package lt.vtmc.adapter1;

public class SDMemoryCard extends AbstractMemoryCard{

	@Override
	void insert() {
		System.out.println("SC card inserted ...");		
	}

	@Override
	void copyDataToComputer() {
		System.out.println("Data copying from SD card to computer ...");		
	}

}
