class Solution {
    public int[] plusOne(int[] digits) {
        int i = 0;
        for (i = digits.length - 1; i >= 0; i--) {
            if (i == (digits.length - 1)) {
                digits[i] += 1;
            }
            if (digits[i] > 9) {
                if (i > 0) {
                    digits[i] = 0;
                    digits[i - 1] += 1;
                }
            }
            if (i == 0 && digits[0] > 9) {
                digits = new int[digits.length +1];
                digits[0] = 1;
            }
        }

        
        return digits;
    }
}