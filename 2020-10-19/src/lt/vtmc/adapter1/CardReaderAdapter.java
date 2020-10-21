package lt.vtmc.adapter1;

public class CardReaderAdapter implements USB{

	private AbstractMemoryCard abstractMemoryCard;
	
	public CardReaderAdapter(AbstractMemoryCard abstractMemoryCard) {
		this.abstractMemoryCard = abstractMemoryCard;
	}

	@Override
	public void connectUsb() {
		this.abstractMemoryCard.insert();
		this.abstractMemoryCard.copyDataToComputer();
	}
	
	
}
