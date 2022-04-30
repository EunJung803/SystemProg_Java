

class Card {
	private String suit; // spade, heart, diamond, club 중 하나
	private int count; // 1이상 13이하의 정수 
	public Card(String s, int c) { suit = s; count = c; }
	public String getSuit() { return suit; }
	public int getCount() { return count; }
	public String toString() { return suit + ":" + count; }
}

public class Q3 {

	public static int getBestResult(Card[] cards) {
		// fill here!
		int big1 = 0;
		int sum = 0;
		int max = 0;
		for(int i=0; i<cards.length; i++) {
			for(int j=0; j<i; j++) {
				if(cards[i].getCount() > cards[j].getCount()) {
					big1 = cards[i].getCount();
				}
			}
		}
		for(int i=0; i<cards.length; i++) {
			sum = big1 + cards[i].getCount();
			if(sum > 10) {
				sum = sum-10;
			}
			if(sum > max) {
				max = sum;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Card[] cards = new Card[4]; 
		cards[0] = new Card("club", 1);
		cards[1] = new Card("spade", 4);
		cards[2] = new Card("diamond", 5);
		cards[3] = new Card("heart", 6);
		System.out.println(getBestResult(cards)); // 9
		
		cards[0] = new Card("club", 1);
		cards[1] = new Card("spade", 4);
		cards[2] = new Card("diamond", 3);
		cards[3] = new Card("diamond", 4);
		System.out.println(getBestResult(cards)); // 8
		
		cards[0] = new Card("club", 1);
		cards[1] = new Card("spade", 2);
		cards[2] = new Card("diamond", 5);
		cards[3] = new Card("diamond", 6);
		System.out.println(getBestResult(cards)); // 8
	}
}
