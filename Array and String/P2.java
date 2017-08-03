//Plindrome Permutation

/*

Question: Check Permutation



*/


public class P2{
	public static void main(String[] args){
	
	}

	public static boolean Permutation(String a, String b){
		if(s.length() != b.length()){
			return false;
		}

		int[] letters = new int[128];

		char[] a_array = s.toCharArray();
		for(char x: a_array){
			letters[c]++;
		}

		for(int i =0; i < b.length(); i++){
			int temp = (int) b.charAt(i);
			letters[c]--;
			if(letters[c]<0){
				return false;
			}
		}
		return ture;
	}
}