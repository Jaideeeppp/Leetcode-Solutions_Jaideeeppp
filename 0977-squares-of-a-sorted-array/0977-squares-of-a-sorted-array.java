class Solution {
    public int[] sortedSquares(int[] nums) {
        int pos = 0;
                        int neg = 0;
                        for(int i : nums){
                                    if(i<0){
                                         neg++;       
                                    }
                                    else{
                                                pos++;
                                    }
                        }
                        int i = 0;
                        int j = neg - 1;
                        while(i<j){
                                    int temp = nums[i];
                                    nums[i]=nums[j];
                                    nums[j]=temp;
                                    i++;
                                    j--;
                        }
                        
                        for(int k =0;k<nums.length;k++){
                            nums[k]=nums[k]*nums[k];
                        }
                        int first = 0;
                int second = neg;
                int[] res = new int[nums.length];
                int count = 0;
                while(first<neg && second<nums.length){
                    if(nums[first]<=nums[second]){
                        res[count] = nums[first];
                        first++;
                        count++;
                    }
                    else{
                        res[count]=nums[second];
                        second++;
                        count++;
                    }
                }
                while(first<neg){
                    res[count]=nums[first];
                    first++;
                    count++;
                }
                while(second<nums.length){
                    res[count]=nums[second];
                    second++;
                    count++;
                }

                return res;
    }
}