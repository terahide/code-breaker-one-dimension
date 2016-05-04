package code_breaker;

import java.util.HashSet;
import java.util.Set;

public class Answer {
    final int value; 
    public Answer(int value) {
        String s = String.valueOf(value);
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        if ( s.length() != set.size() ){
            throw new IllegalStateException("dupricated number");
        }

        this.value = value;
    }
    public boolean match(int input) {
        if( value == input ){
            return true;
        }
        return false;
    }
}
