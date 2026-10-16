class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }

        String prefix = "";
        String check = strs[0];

        for (int j = 0; j < check.length();j++){
            char current = check.charAt(j);

            for (int i = 1; i < strs.length; i++) {
                if (j >= strs[i].length() ||
                    strs[i].charAt(j) != current) {
                    return prefix;
                }
            }

            prefix += current;
        }
        return prefix;
    }
}