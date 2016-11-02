import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by ylyuan on 11/1/16.
 */
public class FirstClassTest {
    @Test
    public void testName() throws Exception {
        assertThat(1, is(2));

    }
}