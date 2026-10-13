class Solution {
    public int strStr(String haystack, String needle) {
        int Found = 0;
        for(int i = 0; i<haystack.length();i++){
            for(int j =0; j<needle.length(); j++){
                if((i+j)<haystack.length()){
                    if(haystack.charAt(i+j)==needle.charAt(j)){
                        Found++;
                    }
                }
                if(Found == needle.length()){
                    return i;
                }
            }
            Found = 0;
        }
        return -1;
    }
}