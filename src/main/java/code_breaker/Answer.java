package code_breaker;

public class Answer {
    final int value; 
    public Answer(int value) {
        this.value = value;
    }
    public boolean match(int i) {
        if( value == i ){
            return true;
        }
        return false;
    }
}
