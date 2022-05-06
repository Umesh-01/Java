package cse_pblj;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringList stringList = new StringList();
		
		int choice = 0;
		String item;
		
		System.out.println("1. Insert");
		System.out.println("2. Search");
		System.out.println("3. Delete");
		System.out.println("4. Display");
		System.out.println("5. Exit");
		
		do {
			System.out.print("Enter your choice (1 to 5): ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				System.out.print("Enter the item to be inserted: ");
				item = sc.nextLine();
				if (stringList.insert(item))
					System.out.println("Inserted successfully.");
				else
					System.out.println("Already exists.");
				break;
				
			case 2:
				System.out.print("Enter the item to search: ");
				if (stringList.search(sc.nextLine()))
					System.out.println("Item found in the list.");
				else
					System.out.println("Item not found in the list.");
				break;
				
			case 3:
				System.out.print("Enter the item to delete: ");
				if (stringList.delete(sc.nextLine()))
					System.out.println("Deleted successfully.");
				else
					System.out.println("Items does not exist.");
				break;
				
			case 4:
				System.out.println("The items in the list are: ");
				stringList.display();
				break;
				
			case 5:
				System.out.println("Exiting..!!");
			}
			
		} while (choice != 5);
		
		sc.close();
	}

}
