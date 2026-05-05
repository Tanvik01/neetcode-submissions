class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] counts = new int[26];

        for(char c : s.toCharArray())
        { 
            counts[c - 'a']++; 
            }
        for(char d : t.toCharArray()){
            if(counts[d - 'a'] > 0){
                counts[d - 'a']--;
            }
            else{ 
                return false;
            }
        }
        return true;

    }
}