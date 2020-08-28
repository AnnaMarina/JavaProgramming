package AddressBookPackage;

public class UserAddition {

	private String phone;
	private int pin;
	private String address;
	private String lastname;
	private String firstname;

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public UserAddition(String firstname, String lastname, String address, int pin, String phone) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.pin = pin;
		this.phone = phone;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
                return lastname;
        }

	public int getPin() {
		return pin;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	//overriding the toString() method
	public String toString(){
		  return firstname+" "+lastname+"- "+phone+" : "+address+" "+pin ;
		 }
}
