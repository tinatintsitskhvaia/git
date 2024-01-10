import acm.program.*;
public class Problem57 extends ConsoleProgram{
	public void run() {
		String str1="desserts";
		String str2="stresses";
		println(areAnagrams(str1 , str2));	
	}

	private boolean areAnagrams(String str1, String str2) {
		
		int[] count1 = new int[26];
		int[] count2 = new int[26];
		fillArray(str1, count1);
		fillArray(str2, count2);
		
		if(str1.equals(str2)){
			return false;
		}
		if(str1.length() != str2.length()) {
			return false;
		}
		for(int i = 0; i<str1.length(); i++){
			if(count1[i] != count2[i]) {
				return false;
			}
		}
		
		
		return true;
	}

	private void fillArray(String str1, int[] count1) {
		for(int i = 0; i< str1.length(); i++) {
			char ch = str1.charAt(i);
			count1[ch -'a']++;		
		}
	}

	
}
