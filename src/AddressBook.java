import java.util.*;
public class AddressBook {

	private ArrayList<BuddyInfo> array;

	public AddressBook() {
		array = new ArrayList<BuddyInfo>();
	}

	private void addBuddy(BuddyInfo buddy) {
		if(buddy != null) {
			array.add(buddy);
		}
	}

	private void removeBuddy(int index) {
		if(index >= 0 && index < array.size()) {
			array.remove(index);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo buddy = new BuddyInfo(19,"Carleton","613-613-6131","Tom");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);
	}

}
