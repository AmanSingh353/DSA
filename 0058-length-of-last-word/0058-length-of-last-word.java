class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int length = 0;
        for(String word: words){
            length = word.length();
        }

        return length;
    }
}