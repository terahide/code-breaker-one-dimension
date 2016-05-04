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
    public void test(ExpectedHolder expectedHolder) {
        Hint expected = expectedHolder.hint;
        Hint actual = answer102.guess(expectedHolder.input);

        assertThat(actual.matched ,is(expected.matched));
        assertThat(actual.sameNumberCount ,is(expected.sameNumberCount));
        assertThat(actual.samePlaceCount ,is(expected.samePlaceCount));
    }
    
    @DataPoints
    public final static ExpectedHolder[] inputs = {
        new ExpectedHolder(102,true,3,3),
        new ExpectedHolder(765,false,0,0),
//        new ExpectedHolder(351,false,0,1),
//        new ExpectedHolder(193,false,1,1),
//        new ExpectedHolder(123,false,1,2),
    };

    public static class ExpectedHolder{
        final int input;
        final Hint hint;
        public ExpectedHolder(int input, boolean matched, int sameNumberCount, int samePlaceCount) {
            super();
            this.input = input;
            this.hint = new Hint(matched, sameNumberCount, samePlaceCount);
        }
    }
}
