package extra;

public class Banks {

		public static void main(String[] args) {
			
			ICICIBank ici = new ICICIBank();
						
			System.out.println("Saving Account Interest Rate in ICICI: "+ici.getSavingInterestRate());
			System.out.println("Fixed Account Interest Rate in ICICI: "+ici.getFixedInterestRate());
			
			KotMBank kotak = new KotMBank();
			
			System.out.println("Saving Account Interest Rate in Kotak Mahendra Bank: "+kotak.getSavingInterestRate());
			System.out.println("Fixed Account Interest Rate in Kotak Mahendra Bank: "+kotak.getFixedInterestRate());
			
						
			GeneralBank gBankICI = new ICICIBank();
			
			System.out.println("\nSaving Account Interest Rate in ICICI Mahendra Bank using the object of General Bank: "+gBankICI.getSavingInterestRate());
			System.out.println("Fixed Account Interest Rate in ICICI Bank using the object of General Bank: "+gBankICI.getFixedInterestRate());

			GeneralBank gBankKot = new KotMBank();
			
			System.out.println("Saving Account Interest Rate in Kotak Mahendra Bank using the object of General Bank: "+gBankKot.getSavingInterestRate());
			System.out.println("Fixed Account Interest Rate in Kotak Mahendra Bank using the object of General Bank: "+gBankKot.getFixedInterestRate());
		}

}

