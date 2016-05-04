package code_breaker;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CodeBreakerTest {
    
    Answer answer102;
    
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    
    @Before
    public void setup(){
        answer102 = new Answer(102);
    }

    @Test
    public void _102を予想したなら完全一致であるべき() {
        assertThat(answer102.match(102),is(true));
    }

    @Test
    public void _765を予想したなら完全一致でないべき() {
        assertThat(answer102.match(765),is(false));
    }

    @Test
    public void 答えが112ならば例外を発生すべき() {
        expectedException.expect(IllegalStateException.class);
        
        new Answer(112);
    }

}
