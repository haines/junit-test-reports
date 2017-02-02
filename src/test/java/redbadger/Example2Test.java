package redbadger;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Example2Test {
    @Test
    public void shouldPass() {
        assertEquals(1, 1);
    }

    @Test
    public void shouldFail() {
        assertEquals(1, 2);
    }

    @Test
    @Ignore
    public void shouldBeSkipped() {

    }

    @Test
    public void shouldError() {
        throw new IllegalStateException();
    }
}
