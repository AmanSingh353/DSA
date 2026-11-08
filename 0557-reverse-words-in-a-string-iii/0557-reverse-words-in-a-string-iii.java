class Solution {
    public String reverseWords(String s) {
        String[] original = s.split(" ");
        String result = "";

        for (String word : original) {
            String reverse = "";
            for (int i = (word.length() - 1); i >= 0; i--) {
                reverse = reverse.concat(String.valueOf(word.charAt(i)));
            }
            if(result.isEmpty()){
                result = reverse;
            }
            else{
                result = String.join(" ", result, reverse);
            }
        }

        return result;
    }
}