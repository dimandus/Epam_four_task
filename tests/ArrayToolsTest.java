import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayToolsTest {

    @Test
    public void testChangeLengthInc() throws Exception {

        assertArrayEquals(ArrayTools.changeLength
                        (new int[]{1, 2, 3, 4, 5}, 7),
                new int[]{1, 2, 3, 4, 5, 0, 0});

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
        assertTrue("Not true", ArrayTools.compare(new int[]{1, 2, 3}, new int[]{3, 2, 1}));
        assertFalse("Not false", ArrayTools.compare(new int[]{1, 2, 3}, new int[]{4, 3, 2}));
        assertTrue("Not false", ArrayTools.compare(new int[]{1, 1, 2, 3}, new int[]{1, 2, 3, 1}));
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
        assertEquals(ArrayTools.print(new int[]{1, 2, 3}), "1 2 3");
    }

    @Test
    public void testFilter() throws Exception {
        int[] source = new int[]{0, 10, 50, 105, 150, 155, 200, 255};
        int[] testMore100 = new int[]{105, 150, 155, 200, 255};
        int[] testTenFold = new int[]{0, 10, 50, 150, 200};

        assertArrayEquals(testMore100, ArrayTools.filter(source, new FilterMore100()));
        assertArrayEquals(testTenFold, ArrayTools.filter(source, new FilterTenFold()));

    }
}