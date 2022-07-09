package oops;

import java.util.Scanner;

public class addressBook {

	public static void main(String[] args) {
		/**
		 * generating 4 random numbers
		 * 1 for adding contacts, 2 for update, 3 for delete, 4 for view
		 */
		System.out.println("<<<<<Welcome to Address Book>>>>>");
		contactDetails contact = new contactDetails();
		String name;
		int input;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println(" Enter 1 for add");
			System.out.println(" Enter 2 for update");
			System.out.println(" Enter 3 for delete");
			System.out.println(" Enter 4 for showing");
			input = scanner.nextInt();
			switch (input) {
			case 1:
				contact.addPerson();
				System.out.println("Contact Added Successfully");
				break;
			case 2:
				contact.update();
				break;
			case 3:
				contact.delete();
				break;
			case 4:
				System.out.println("");
				System.out.println("               " + "First Name " + " Last Name" + " Address" + " City" + " State"
						+ " Zip" + " Number" + " E-mail");
				contact.show();
				break;
			case 5:
				System.exit(0);
			}
		}
	}

}

