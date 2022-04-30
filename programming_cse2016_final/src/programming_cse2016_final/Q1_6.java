package programming_cse2016_final;

public class Q1_6 {
	public static int countNumberStrings(String[] strs) {
		// fill here!
		int count = 0;
		int s_int = 0;
		if(strs == null) {
			return 0;
		}
		
		for(int i=0; i<strs.length; i++) {	//for문을 try 밖에서 둘러쌓아서 돌려야함 !!!
			try {
				
				s_int = Integer.parseInt(strs[i]);
				count ++;
			}
			catch(RuntimeException e) {
				
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		String[] strs = {"123", "abc", "12", "", null};
		System.out.println(countNumberStrings(strs)); // 2
	}
}

