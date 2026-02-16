package Q2;

public class Owner {
	private String name;
	private Date dateOfBirth;
	private String nic;
	
	public Owner(String name, String nic, Date dateOfBirth) {
		this.dateOfBirth=dateOfBirth;
		this.name=name;
		this.nic=nic;
	}
	
	@Override
	public String toString() {
		return "Owner: "+ name+" NIC: "+nic+" DOB: "+dateOfBirth;
	}
}
