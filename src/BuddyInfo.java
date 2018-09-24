/**
 * 
 * @author Ryan Tordesillas(101041626)
 * This class will implement a BudddyInfo object where it will contain the name, age, address
 * and phone number of one buddy.
 */
public class BuddyInfo {

	/** The age of the buddy. */
	private int age;
	/** The place where the buddy lives. */
	private String address;
	/** The buddy's phone number */
	private String phoneNumber;
	/** The name of the buddy. */
	private String name;
	
	/**
	 * This is the constructor for the buddy object.
	 * @param age the age of the buddy.
	 * @param address the address of the buddy.
	 * @param phoneNumber the buddy's phone number.
	 * @param name the buddy's name
	 */
	public BuddyInfo(int age, String address, String phoneNumber, String name) {
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.name = name;
	}
	
	/**
	 * Gets the age of the buddy.
	 * @return the age of the buddy.
	 */
	public int getAge() {
		return age;
	}


	/**
	 * Sets the age of the buddy.
	 * @param age the age for the buddy to be set to.
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Returns the address of the buddy.
	 * @return address of the buddy.
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address of the buddy.
	 * @param address the address to be set.
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Returns the buddy's phone number.
	 * @return phoneNumber the buddy's phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the buddy's phone number.
	 * @param phoneNumber the buddy's new number.
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Returns the buddy's name.
	 * @return name the name of the budy.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the buddy.
	 * @param name the name of the buddy.
	 */
	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo buddy = new BuddyInfo(19, "209 Kiwais Ct", "613-501-9782", "Ryan");
		System.out.println("Hello " + buddy.getName());
	}

}
