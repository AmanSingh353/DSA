class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set =  new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        for(int n = 0; n< nums.length; n++){
            if(!set.contains(n)){
                return n;
            }
        }
        return nums.length;
    }
}