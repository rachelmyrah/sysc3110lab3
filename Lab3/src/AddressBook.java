import java.util.ArrayList;

public class AddressBook {
	
	private ArrayList<BuddyInfo> book;
	
	public AddressBook () {
		book = new ArrayList<BuddyInfo>();
	}
	
	public ArrayList<BuddyInfo> getAddressBook() {
		return book;
	}
	
	public void addBuddy(String name, String address, String phoneNumber) {
		BuddyInfo buddy = new BuddyInfo(name, address, phoneNumber);
		book.add(buddy);
	}
	
	public void removeBuddy(String name) {
		for (int i = 0; i < book.size(); i++) {
			if (book.get(i).getName().equals(name)) {
				book.remove(i);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy("Rachel", "123street", "123456789");
		addressBook.removeBuddy("Rachel");
		String s = "hi";
	}
}
