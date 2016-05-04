package code_breaker;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class ATest {

    @Test
    public void test() {
        Answer sut = new Answer(102);
        assertThat(sut.match(102),is(true));
    }

}
