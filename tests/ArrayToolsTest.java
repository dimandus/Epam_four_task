import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dimandus on 07.11.2015.
 */
public class ArrayToolsTest {

    @Test
    public void testChangeLengthInc() throws Exception {

        assertArrayEquals(ArrayTools.changeLength(new int[] {1,2,3,4,5},7),new int[] {1,2,3,4,5,0,0});

    }

    @Test
    public void testChangeLengthDec() throws Exception {

        assertArrayEquals(ArrayTools.changeLength(new int[] {1,2,3,4,5},3),new int[] {1,2,3});

    }

    @Test
    public void testChangeLengthZero() throws Exception {

        assertArrayEquals(ArrayTools.changeLength(new int[] {1,2,3,4,5},0),new int[] {});

    }

    @Test
    public void testChangeLengthNull() throws Exception {
        assertNull(ArrayTools.changeLength(null,7));

    }

    @Test
    public void testCompare() throws Exception {

    }

    @Test
    public void testShuffle() throws Exception {

    }

    @Test
    public void testPrint() throws Exception {

    }
}