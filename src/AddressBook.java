import java.util.*;
public class AddressBook {
	/** The array that all the buddy's will be stored in. */
	private ArrayList<BuddyInfo> array;

	/**
	 * The Constructor for a new AddressBook.
	 */
	public AddressBook() {
		array = new ArrayList<BuddyInfo>();
	}
	/**
	 * Adds a buddy to the AddressBook.
	 * @param buddy the buddy to be added to the AddressBook.
	 */
	private void addBuddy(BuddyInfo buddy) {
		if(buddy != null) {
			array.add(buddy);
		}
	}

	/**
	 * Removes the buddy at the index.
	 * @param index the index containing the buddy to be deleted.
	 */
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
