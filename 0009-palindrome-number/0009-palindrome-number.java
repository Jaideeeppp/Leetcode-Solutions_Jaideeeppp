class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder s = new StringBuilder(String.valueOf(x));
        int i = 0;
        int j = s.length()-1;
        boolean res = true;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                res = false;
                break;
            }
        }

        return res;

    }
}