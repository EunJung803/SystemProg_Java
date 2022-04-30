package programming_cse2016_final;

class Card { 
	public static final String SPADES = "spades"; public static final String HEARTS = "hearts";
	public static final String DIAMONDS = "diamonds"; public static final String CLUBS = "clubs";
	public static final int SIZE_OF_ONE_SUIT = 13;
	private String suit;
	private int count;
	public Card(String s, int c) { suit = s; count = c; }
	public String toString() { return (suit + ": " + count); }
	public String getSuit() { return suit; }
	public int getCount() { return count; }
}


class CardDeck {
	private int card_count;  // how many cards remain in the deck
	private Card card_before = null;  // card returned when newCard() was called last time
	private Card[] deck = new Card[4 * Card.SIZE_OF_ONE_SUIT];
	public CardDeck() { 
	  createSuit(Card.SPADES); createSuit(Card.HEARTS);
	  createSuit(Card.CLUBS); createSuit(Card.DIAMONDS);
	}
	
	
	private boolean isNextCard(Card card) {
		int gap = Math.abs(card.getCount() - card_before.getCount()); //전 카드와 지금 카드의 숫자 차이
		boolean same_suit = card.getSuit().equals(card_before.getSuit()); //전 카드와 지금 카드가 모양이 같은지 다른지
		return (same_suit && (gap == 1)) || (!same_suit && (gap == 0)); //같은 모양, 다른 숫자 || 다른 모양, 같은 숫자
	}
	
	
	public Card newCard() { 
		// fill here!
		// Math.random(): 0이상 1미만의 실수를 랜덤하게 선택하여 반환한다.
		
		Card next_card = null; // 이번에 줄 카드 
		int index = 0;
		
		// 줄 카드가 없음 (덱에 남아있는 카드가 없다)
		if ( card_count == 0 ) {
		    	return null;
		}	
		
		// 처음 카드를 뽑기 전 상태
		else if (card_before == null) {
			index = (int)(Math.random() * card_count);
		}	
		
		// 다음 카드 주기
		else { 
	    	for (int i = 0;  i != card_count;  i = i + 1)
	        	if (isNextCard(deck[i])) {
	        		index = i; 
		        	break; 
		       	}
		    }
		next_card = deck[index];
		card_before = next_card;
		
		//다음으로 넘기기
		for ( int i = index+1;  i != card_count;  i = i + 1 )
			deck[i - 1] = deck[i]; 
		    card_count = card_count - 1;
		    return next_card;
	}
	
	
	private void createSuit(String which_suit) { 
		for ( int i = 1;  i <= Card.SIZE_OF_ONE_SUIT;  i = i + 1 ) { 
			deck[card_count] = new Card(which_suit, i);
	        card_count = card_count + 1;
	    }
	}
}


public class Q1_4 {
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		System.out.println(cd.newCard().toString()); // hearts: 13
		System.out.println(cd.newCard().toString()); // spades: 13
		System.out.println(cd.newCard().toString()); // spades: 12
	}
}


