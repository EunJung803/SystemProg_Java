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
		int gap = Math.abs(card.getCount() - card_before.getCount()); //�� ī��� ���� ī���� ���� ����
		boolean same_suit = card.getSuit().equals(card_before.getSuit()); //�� ī��� ���� ī�尡 ����� ������ �ٸ���
		return (same_suit && (gap == 1)) || (!same_suit && (gap == 0)); //���� ���, �ٸ� ���� || �ٸ� ���, ���� ����
	}
	
	
	public Card newCard() { 
		// fill here!
		// Math.random(): 0�̻� 1�̸��� �Ǽ��� �����ϰ� �����Ͽ� ��ȯ�Ѵ�.
		
		Card next_card = null; // �̹��� �� ī�� 
		int index = 0;
		
		// �� ī�尡 ���� (���� �����ִ� ī�尡 ����)
		if ( card_count == 0 ) {
		    	return null;
		}	
		
		// ó�� ī�带 �̱� �� ����
		else if (card_before == null) {
			index = (int)(Math.random() * card_count);
		}	
		
		// ���� ī�� �ֱ�
		else { 
	    	for (int i = 0;  i != card_count;  i = i + 1)
	        	if (isNextCard(deck[i])) {
	        		index = i; 
		        	break; 
		       	}
		    }
		next_card = deck[index];
		card_before = next_card;
		
		//�������� �ѱ��
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


