import java.util.*;
class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String original = "";
        String backward = "";
        
        for(int i = 0; i < s.length(); i++) {
            Character current = s.charAt(i);
            if(Character.isDigit(current) || Character.isLetter(current)) {
                original += current;
            }
        }
        
        for(int i = s.length()-1; i >= 0; i--) {
            Character current = s.charAt(i);
            if(Character.isDigit(current) || Character.isLetter(current)) {
                backward += current;
            }
        }
        original = original.toLowerCase();
        backward = backward.toLowerCase();
        
        if(original.equals(backward)) {
            return true;
        } else {
            return false;
        }
        
        
    }
}
