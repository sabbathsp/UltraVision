package Data;

public class Customer {
	
	private String name, phone, member;
	private static int idC=1;
	private int idCustomer;

	public Customer(String name, String phone, String member) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
		this.phone = phone;
		this.member = member;
		this.idCustomer = idC;
		idC++;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public int getIdCustomer() {
		return idCustomer;
	}
}
