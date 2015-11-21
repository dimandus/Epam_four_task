import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void testGetElementAt() throws Exception {
        assertEquals("Сбой инициализации",(new Matrix(5, 5).getElementAt(3, 3)), 0, Double.MIN_VALUE);
        assertEquals(new Matrix(new double[][]{{1, 2}, {3, 4}}).getElementAt(1, 0), 3, Double.MIN_VALUE);
    }

    @Test
    public void testSetElementAt() throws Exception {
        Matrix matr = new Matrix(new double[][]{{1, 2}, {3, 4}});
        matr.setElementAt(1, 0, 6);
        assertEquals(matr.getElementAt(1, 0), 6, Double.MIN_VALUE);
    }

    @Test
    public void testAddition() throws Exception {
        Matrix matr1 = new Matrix(new double[][]{{1, 2}, {3, 4}});
        Matrix matr2 = new Matrix(new double[][]{{1, 2}, {3, 4}});
        assertTrue((Matrix.isEqual(Matrix.add(matr1, matr2), new Matrix(new double[][]{{2, 4}, {6, 8}}))));
    }

    @Test
    public void testMultiMatrNormal() throws Exception {
        assertArrayEquals("Не умножаются верно", Matrix.multiply(new Matrix(new double[][]{{1, 2}, {3, 4}}), new Matrix(new double[][]{{1, 2}, {3, 4}})).items,
                new Matrix(new double[][]{{7, 10}, {15, 22}}).items);

    }

    @Test
    public void testMultiMatrDimensionsNotMatch() throws Exception {
        assertNull("На выходе должен быть null", Matrix.multiply(new Matrix(new double[][]{{1, 2}}), new Matrix(new double[][]{{1}})));

    }

    @Test
    public void testMultiMatrOneOrMoreMatrixIsNull() throws Exception {
        assertNull("На выходе должен быть null", Matrix.multiply(new Matrix(null), new Matrix(new double[][]{{1, 2}, {1, 2}})));
        assertNull("На выходе должен быть null", Matrix.multiply(new Matrix(new double[][]{{1, 2}, {1, 2}}), null));
        assertNull("На выходе должен быть null", Matrix.multiply(null, null));

    }
}