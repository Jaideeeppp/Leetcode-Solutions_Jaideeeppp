class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1){
            return 1;
        }

        int i =0;
        int j = i+1;
        int k = 1;

        while(i<nums.length && j<nums.length){
            if(nums[j]==nums[i]){
                j++;
            }
            else{
                i++;
                nums[i]=nums[j];
                k = k+1;
            }
        }
        return k;
    }
}