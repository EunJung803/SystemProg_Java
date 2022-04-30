package programming_cse2016_final;

interface Keys { public boolean equals(Keys m); }
interface Records { public Keys keyOf(); }
class DataBases {
	private Records[] base;
	public DataBases(int initial_size) {
		if (initial_size < 0) initial_size = 1;
		base = new Records[initial_size];
	}
	public Records find(Keys k) {
	for (int i = 0; i < base.length; i++)
		if (base[i] != null && base[i].keyOf().equals(k))
				return base[i];
	return null;
	}
	
	public boolean insert(Records r) {
		int i;
		if (find(r.keyOf()) != null) return false;
		for (i = 0; i < base.length; i++)
			if (base[i] == null) {
				base[i] = r; return true;	
			}
		Records[] base_new = new Records[base.length * 2];
		for (i = 0; i < base.length; i++)
			base_new[i] = base[i];
		base = base_new;
		base[i] = r;
		return true;
	}
	public boolean delete(Keys k) {
		for (int i = 0; i < base.length; i++)
			if (base[i] != null && base[i].keyOf().equals(k)) {
					base[i] = null; return true;
		}
	return false;
	}
}
class StringDoubleKey implements Keys {
	private String id_str;
	private double id_double;
	// fill here!
	public StringDoubleKey(String str, double dbl) {
		id_str = str;
		id_double = dbl;
	}
	public boolean equals (Keys otherkeys) {
		String str = ((StringDoubleKey)otherkeys).strOf(); 
		double dbl = ((StringDoubleKey)otherkeys).doubleOf();
		return str.equals(id_str) && (dbl == id_double); 
	}
	public String strOf() {
		return id_str;
	}
	public double doubleOf() {
		return id_double;
	}
	public String toString() { return id_str + id_double; }
}
	
class Class implements Records {
	private StringDoubleKey class_id;
	private String name;
	// fill here!
	public Class(StringDoubleKey cid, String nm) {
		class_id = cid;
		name = nm;
	}
	
	public Keys keyOf() {
		return (Keys)class_id;
	}
	
	public String toString() {
		return class_id.toString() + " " + name;
	}
}
	
public class Q2_5 {
	public static void main(String[] args) {
		DataBases db = new DataBases(100) ;
		Records r1 = new Class(new StringDoubleKey("CS", 2016), "Programming");
		Records r2 = new Class(new StringDoubleKey("CS", 664.18), "Security");
		db.insert(r1); db.insert(r2); db.delete(r1.keyOf());
		System.out.println(db.find(r1.keyOf())); // null
		System.out.println(db.find(r2.keyOf())); // CS664.18 Security
	}
}