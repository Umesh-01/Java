package cse_pblj;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class CollectUniqueCards {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<UniqueCard> set = new HashSet<>();
		
		for (int i = 0; i < 8; i++) {
			System.out.println("Enter a card:");
			UniqueCard uCard = new UniqueCard();
			
			uCard.setSymbol(sc.nextLine().charAt(0));
			uCard.setNumber(sc.nextInt());
			sc.nextLine();
			
			set.add(uCard);
		}
		System.out.println("Four symbols gathered in eight cards.");
		System.out.println("Cards in Set are:");
		
		for (UniqueCard uCard : set) 
			System.out.println(uCard.getSymbol() + " " + uCard.getNumber());		
		
		sc.close();
	}

}
