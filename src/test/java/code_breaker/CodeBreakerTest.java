package code_breaker;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class CodeBreakerTest {

    @Test
    public void 答えが102の時に102を予想したなら完全一致であるべき() {
        Answer sut = new Answer(102);
        assertThat(sut.match(102),is(true));
    }

    @Test
    public void 答えが102の時に765を予想したなら完全一致でないべき() {
        Answer sut = new Answer(102);
        assertThat(sut.match(765),is(false));
    }
}
