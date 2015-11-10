import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by nick on 10.11.15.
 */
public class TestErrything {

    @Test
    public void testStuff() {
       assertThat("This should be true", true, is(true));
    }

    @Test
    public void testWrongStuff() {
        assertThat("This is so not true", false, is(true));
    }
}
