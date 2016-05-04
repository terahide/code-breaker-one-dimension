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

    @Test
    public void _112を予想したなら例外を発生すべき() {
        expectedException.expect(IllegalStateException.class);
        
        answer102.match(112);
    }

    @Test
    public void _102を予想したなら同じ数字が3であるべき() {
        assertThat(answer102.countSameNumber(102),is(3));
    }

    @Test
    public void _765を予想したなら同じ数字が0であるべき() {
        assertThat(answer102.countSameNumber(765),is(0));
    }

    @Test
    public void _123を予想したなら同じ数字が2であるべき() {
        assertThat(answer102.countSameNumber(123),is(2));
    }

    @Test
    public void _102を予想したなら同じ場所が3であるべき() {
        assertThat(answer102.countSamePlace(102),is(3));
    }

    @Test
    public void _765を予想したなら同じ場所が0であるべき() {
        assertThat(answer102.countSamePlace(765),is(0));
    }

}
