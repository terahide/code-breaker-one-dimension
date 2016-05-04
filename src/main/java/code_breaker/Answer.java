package code_breaker;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Answer {
    final int value; 
    public Answer(int value) {
        validateDuplicate(value);
        this.value = value;
    }
    
    private void validateDuplicate(int value) {
        String s = String.valueOf(value);
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        if ( s.length() != set.size() ){
            throw new IllegalStateException("dupricated number");
        }
    }
    
    public boolean match(int input) {
        validateDuplicate(input);
        
        if( value == input ){
            return true;
        }
        return false;
    }

    public int countSameNumber(int input) {
        String s = String.valueOf(value);
        List<Character> l = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            l.add(s.charAt(i));
        }
        s = String.valueOf(input);
        int c=0;
        for(int i=0;i<s.length();i++){
            if( l.contains(s.charAt(i)) ){
                c++;
            }
        }

        return c;
    }
}
