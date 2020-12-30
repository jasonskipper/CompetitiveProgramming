class Solution {
    public boolean isPalindrome(int x) {  
        String str = Integer.toString(x);
        String[] str1 = str.split("");
        
        int j = str1.length-1;
        
        for(int i = 0; i < str1.length; i++) {
            if(!str1[i].equals(str1[j]) ||  j < 0) {
                return false;
            }
            j--;
        }
        return true;
    }
}
