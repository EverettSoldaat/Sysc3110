import java.util.ArrayList;

public class AddressBook {

	private ArrayList<BuddyInfo> addressbook = new ArrayList<BuddyInfo>();
	
	public AddressBook () {
		
	}
	
	public void addBuddy(BuddyInfo buddy) {
		addressbook.add(buddy);
	}
	
	public void removeBuddy (BuddyInfo buddy) {
		addressbook.remove(buddy);
	}
	
}
