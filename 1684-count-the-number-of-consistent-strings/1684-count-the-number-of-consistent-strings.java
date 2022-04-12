class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;
	int[] all = new int[26];

	for (char c : allowed.toCharArray()){
		all[c-'a']++;
	}

	for (String word : words) {
		
		for (char c : word.toCharArray()) {
			if (all[c-'a'] <= 0){
				count--;
				break;
			}
		}
	}
	return count;
    }
}