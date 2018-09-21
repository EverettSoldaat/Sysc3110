
public class BuddyInfo {
	
	private String name;
	private String address;

	
	public BuddyInfo (String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo buddy = new BuddyInfo ("George", "123 Easy St");
		buddy.setName("George");
		
		System.out.println("Hello " + buddy.getName());

	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
