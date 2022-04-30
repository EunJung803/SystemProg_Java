

interface Key { public boolean equals(Key m); }
interface Record { public Key keyOf(); }
class DataBase {
	private Record[] base;
	public DataBase(int initial_size) {
		if (initial_size < 0) initial_size = 1;
		base = new Record[initial_size];
	}
	public Record find(Key k) {
		for (int i = 0; i < base.length; i++) {
			if (base[i] != null && base[i].keyOf().equals(k)) 
				return base[i];
		}
		return null;
	}
	public boolean insert(Record r) {
		int i; 
		if (find(r.keyOf()) != null) return false;
		for (i = 0; i < base.length; i++) {
			if (base[i] == null) {
				base[i] = r; return true; 
			}
		}
		Record[] base_new = new Record[base.length * 2];
		for (i = 0; i < base.length; i++)  
			base_new[i] = base[i];
		base = base_new; 
		base[i] = r;
		return true; 
	}
	public boolean delete(Key k) {
		for (int i = 0; i < base.length; i++) {
			if (base[i] != null && base[i].keyOf().equals(k)) {
				base[i] = null; return true;
			}
		}
		return false;
	}	
}

class CardKey implements Key { 
	private String suit; 
	private int count;
	public CardKey(String s, int c) {
		// fill here!
		suit = s;
		count = c;
	}
	public boolean equals(Key another_key) {
		// fill here!
		String s = ((CardKey)another_key).getSuit();
		int c = ((CardKey)another_key).getCount();
		return (suit.equals(s))&&(count == c);
	} 
	public String getSuit() {
		// fill here!
		return suit;
	}
	public int getCount() {
		// fill here!
		return count;
	}
	public String toString() { return suit + ": " + count; }
}

class CardRecord implements Record {
	private CardKey key; 
	public CardRecord(CardKey k) { key = k; }
	public String toString() { return key.toString(); }
	public Key keyOf() { return key; }
}

public class Q6 {
	public static void main(String[] args) {
		DataBase db = new DataBase(100) ;
		Record r1 = new CardRecord(new CardKey("spade", 3)); 
		Record r2 = new CardRecord(new CardKey("heart", 4)); 
		db.insert(r1);   db.insert(r2);
		db.delete(r1.keyOf());
		System.out.println(db.find(r1.keyOf())); // null
		System.out.println(db.find(r2.keyOf())); // heart: 4
	}
}
