package chapter1;

public class BraveKnight implements Knight{
	private Quest quest;
	private Minstrel minstrel;
	public BraveKnight(Quest quest) {
		this.quest=quest;
//		this.minstrel=minstrel;
	}
	
	@Override
	public void embarkOnQuest() {
//		minstrel.singBeforeQuest();
		quest.embark();
//		minstrel.singAfterQuest();
	}
}
