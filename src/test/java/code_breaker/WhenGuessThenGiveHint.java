package code_breaker;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class WhenGuessThenGiveHint {

    Answer answer102;
    
    @Before
    public void setup(){
        answer102 = new Answer(102);
    }

    @Theory
    public void test(int input,Hint expected) {
        Hint actual = answer102.guess(input);
        assertThat(actual.matched ,is(expected.matched));
        assertThat(actual.sameNumberCount ,is(expected.sameNumberCount));
        assertThat(actual.samePlaceCount ,is(expected.samePlaceCount));
    }
    
    @DataPoints
    public final static int[] inputs = {
        102,
//        765,
//        351,
//        193,
//        123,
    };

    @DataPoints
    public final static Hint[] expecteds = {
        new Hint(true,3,3),
//        new Hint(false,0,0),
//        new Hint(false,0,1),
//        new Hint(false,1,1),
//        new Hint(false,1,2),
    };
}
