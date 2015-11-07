import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dimandus on 07.11.2015.
 */
public class ArrayToolsTest {

    @Test
    public void testChangeLengthInc() throws Exception {

        assertArrayEquals(ArrayTools.changeLength(new int[]{1, 2, 3, 4, 5}, 7), new int[]{1, 2, 3, 4, 5, 0, 0});

    }

    @Test
    public void testChangeLengthDec() throws Exception {

        assertArrayEquals(ArrayTools.changeLength(new int[]{1, 2, 3, 4, 5}, 3), new int[]{1, 2, 3});

    }

    @Test
    public void testChangeLengthZero() throws Exception {

        assertArrayEquals(ArrayTools.changeLength(new int[]{1, 2, 3, 4, 5}, 0), new int[]{});

    }

    @Test
    public void testChangeLengthNull() throws Exception {
        assertNull(ArrayTools.changeLength(null, 7));

    }

    @Test
    public void testCompare() throws Exception {
        assertTrue("Not true",ArrayTools.compare(new int[]{1, 2, 3}, new int[]{3, 2, 1}));
        assertFalse("Not false", ArrayTools.compare(new int[]{1, 2, 3}, new int[]{4, 3, 2}));
    }

    @Test
    public void testCompareNull() throws Exception {
        assertFalse(ArrayTools.compare(null, new int[]{3, 2, 1}));
        assertFalse(ArrayTools.compare(new int[]{1, 2, 3}, null));
        assertFalse(ArrayTools.compare(null, null));
    }

    @Test
    public void testShuffle() throws Exception {

    }

    @Test
    public void testPrint() throws Exception {
        assertEquals(ArrayTools.print(new int[]{1,2,3}),"1 2 3");
    }
}