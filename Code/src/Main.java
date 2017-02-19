import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to University of Gugsi \n  Nowhere in Particular\n ");
		boolean flag = true;
		while (flag == true) {
			System.out.print("Please enter User Name: ");
			String UserName = input.next();
			System.out.println();
			System.out.print("Please enter Password : ");
			String Password = input.next();
			System.out.println();
			if (UserName.equalsIgnoreCase("1") && Password.equals("1")) {
				flag = false;
				boolean repeat = true;
				while (repeat == true) {
					System.out.println("--------MAIN MENU--------");
					System.out.println("Please enter the number of your selection");
					System.out.println("1: Add Student Details \n2: Get Reports \n3: Exit \n");
					try {
						int selection = input.nextInt();

						switch (selection) {
						case 1:

							(new Student()).main();
							break;
						case 2:
							Student.studentReport();
							break;
						case 3:
							System.exit(0);
							break;
						default:
							System.out.println("Invalid input");
							break;
						}
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("Invalid input");
					}
					System.out.println("Enter any key to go back to main menu or enter e to Exit");
					input.nextLine();
					String response = input.next();
					if (response.equalsIgnoreCase("e")) {
						System.exit(0);
						repeat = false;
					} else {
						repeat = true;
					}
				}

			} else {
				System.out.println("Login Failed");
				System.out.println("Enter any key to Retry or enter e to Exit");
				String reply = input.next();
				if (reply.equalsIgnoreCase("e")) {
					System.exit(0);
					flag = false;
				}
			}
		}

	}
}
