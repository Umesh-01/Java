package cse_pblj;

public class UniqueCard implements Comparable<UniqueCard> {
	
		private char symbol;
		private int number;
		
		public char getSymbol() {
			return symbol;
		}

		public void setSymbol(char symbol) {
			this.symbol = symbol;
		}
		
		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		@Override
		public int compareTo(UniqueCard o) {
			if (this.symbol < o.symbol) return -1;
			else if (this.symbol > o.symbol) return 1;
			else return 1;
		}
		
		@Override
		public int hashCode() {
	        return String.valueOf(symbol).hashCode();
		}
		
		@Override
	    public boolean equals(Object obj){
	        if (obj instanceof UniqueCard) {
	        	UniqueCard uCard = (UniqueCard) obj;
	            return (uCard.symbol == this.symbol);
	        } 
	        else {
	            return false;
	        }
	    }
	

}

