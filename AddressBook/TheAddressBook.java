/*
*Write a program for Address book, which can add new members and their details, edit the  phone number, delete a member,
* sort by name and pincode also print the Address book .
*/


import AddressBookPackage.UserAddition;
import java.util.*;


public class TheAddressBook {
	public static final int USER_ADD = 1;
	public static final int USER_EDIT = 2;
	public static final int DELETE = 3;
	public static final int NAME_SORT = 4;
	public static final int PINCODE_SORT = 5;
	public static final int PRINT = 6;
	public static final int EXIT = 7;

	private static LinkedList<UserAddition> addressBookList;
	static Scanner sc = new Scanner(System.in);
	public TheAddressBook () {
		addressBookList = new LinkedList<>();
	}
	public void adduser(String firstname, String lastname, String address, int pincode, String phone) {
		UserAddition addressBookUser = new UserAddition( firstname,lastname,address,pincode,phone);
		addressBookList.add(addressBookUser);
	}

	//For sorting according to name
	static void nameSort() {
		for(int i=0;i<addressBookList.size();i++) {
			for(int j=i+1;j<addressBookList.size();j++) {
				UserAddition obj1= addressBookList.get(i);
				UserAddition obj2= addressBookList.get(j);
				if(obj1.getFirstname() .compareTo(obj2.getFirstname())>0)
					Collections.swap(addressBookList, i, j);
				if(obj1.getFirstname() .equals(obj2.getFirstname()) && obj1.getLastname() .compareTo(obj2.getLastname())>0)
					Collections.swap(addressBookList, i, j);
			}
		}
	}

	//For sorting according to pincode
	static void pincodeSort() {
		for(int i=0;i<addressBookList.size();i++) {
			for(int j=i+1;j<addressBookList.size();j++) {
				UserAddition obj1= addressBookList.get(i);
				UserAddition obj2= addressBookList.get(j);
				if(obj1.getPin()>obj2.getPin())
				Collections.swap(addressBookList, i, j);
			}
		}
	}

	//Finding names in Address Book	
	static int findUser () {
		System.out.println("Enter the first name of contact ");
		String fname = sc.next();
		 System.out.println("Enter the last name of contact ");
                String lname = sc.next();
		for(int i=0;i<addressBookList.size();i++) {
			UserAddition obj= addressBookList.get(i);
			if(fname.equals(obj.getFirstname()) && lname.equals(obj.getLastname())) {
				return i;
			}
		}
		return -1;
	}

	//For editing number of the member
	static int editUser() {
		int position = findUser();
		if(position >= 0) {
			UserAddition temp= addressBookList.get(position);
			System.out.println("Enter the new number to updated");
			String number =sc.next();
			temp.setPhone(number);
		}
		else
			System.out.println("Enter a valid name");
		return 0;
	}

	//For Removing from the Address book
	static int removeUser() {
		int position = findUser();
			if(position < 0)
				System.out.println("Enter a valid name");
			else
				addressBookList.remove(position);
			return 0;
	}

	//For printing
	static void print() {
		System.out.println("\n***********ADDRESSBOOK ************");
		for(int i=0;i<addressBookList.size();i++)
			System.out.println(i+1 +" "+addressBookList.get(i));
		System.out.println("**********************************************");
	}

	 public static void main(String args[]) {
                int option =0;
                TheAddressBook user = new TheAddressBook();
                while(option != 7 ) {
                        System.out.println("\n*******ADDRESSBOOK MENU*****\n");
                        System.out.println("Choose what option to perform ");
                        System.out.println("1. Add a new member");
                        System.out.println("2. Edit the details");
                        System.out.println("3. Deletion from address book");
                        System.out.println("4. For sorting with First name");
                        System.out.println("5. For sorting with pincode");
                        System.out.println("6. For Printing");
                        System.out.println("7. For exit\n");
                        option=sc.nextInt();

                        switch(option) {

                                case USER_ADD:
                                        user.adduser("Nidhi","Tensy","Kerala", 683456,"6784356780");
                                        user.adduser("Sethu","Lakshmi","Karnataka", 414004,"8236356780");
                                        user.adduser("Anna","Marina","Kerala", 682017,"9123456780");
                                        user.adduser("David","TJ","Hyderabad", 345634,"9342356780");
                                        user.adduser("Gauri","Singh","Punjab", 254634,"7542356780");
					user.adduser("Anna","Paul","Delhi", 754634,"7266356780");
                                        break;

                                case USER_EDIT:
                                        editUser();
                                        break;

                                case DELETE:
                                        removeUser();
                                        break;

                                case NAME_SORT:
                                        nameSort();
                                        break;

                                case PINCODE_SORT:
                                        pincodeSort();
                                        break;

                                case PRINT:
                                        print();
                                        break;

                                case EXIT:
                                        System.out.println("Thank You!");
                                        break;

                                default:
                                        System.out.println("Enter the correct choice");
                        }
                }
        }

}

