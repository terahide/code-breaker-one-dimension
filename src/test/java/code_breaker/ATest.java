package code_breaker;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class ATest {

    @Test
    public void 答えが102の時に102を予想したなら完全一致であるべき() {
        Answer sut = new Answer(102);
        assertThat(sut.match(102),is(true));
    }

}
