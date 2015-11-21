import java.util.Arrays;

public class Matrix implements Cloneable{

    final double[][] items;
    final int rowCount;
    final int columnCount;

    public Matrix(double[][] source) {

        if (source != null) {
            rowCount = source.length;
            columnCount = source[0].length;
        } else {
            rowCount = 0;
            columnCount = 0;
        }

        items = new double[rowCount][];

        for (int i = 0; i < rowCount; i++) {
            items[i] = Arrays.copyOf(source[i], source[i].length);
        }
    }

    public Matrix(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;

        items = new double[rowCount][columnCount];

    }

    public double getElementAt(int row, int column) {
        return items[row][column];
    }

    public void setElementAt(int row, int column, double value) {
        items[row][column] = value;
    }

    public String toString() {

        String res = "";
        if (!isCorrect(items)) {
            return "array has nulls";
        }
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length; j++) {
                {
                    res += items[i][j] + " ";
                }
            }
            res += "\r\n";
        }

        return res;
    }


    public boolean isCorrect(double[][] source) {

        if (source == null) {
            return false;
        }

        boolean allOk = true;
        for (int i = 0; i < source.length - 1; i++) {
            if (source[i] == null) {
                return false;
            }
        }

        return allOk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matrix matrix = (Matrix) o;

        if (rowCount != matrix.rowCount) return false;
        if (columnCount != matrix.columnCount) return false;
        return Arrays.deepEquals(items, matrix.items);

    }

    @Override
    public int hashCode() {
        int result = items != null ? Arrays.deepHashCode(items) : 0;
        result = 31 * result + rowCount;
        result = 31 * result + columnCount;
        return result;
    }

    public static Matrix add(Matrix first, Matrix second) {
        if (first.rowCount != second.rowCount || first.columnCount != second.columnCount)
            return null;

        Matrix res = new Matrix(first.rowCount, first.columnCount);

        for (int i = 0; i < res.rowCount; i++) {
            for (int j = 0; j < res.rowCount; j++) {
                res.setElementAt(i, j, first.getElementAt(i, j) + second.getElementAt(i, j));
            }
        }

        return res;
    }

    public static Matrix multiply(Matrix left, Matrix right) {

        if (left == null || right == null) {
            return null;
        }

        if (left.columnCount != right.rowCount) {
            return null;
        }

        Matrix res = new Matrix(left.rowCount, right.columnCount);
        for (int i = 0; i < left.rowCount; i++) {

            for (int j = 0; j < right.columnCount; j++) {
                double itemToWrite = 0;
                for (int k = 0; k < left.columnCount; k++) {
                    itemToWrite += left.getElementAt(i, k) * right.getElementAt(k, j);
                }
                res.setElementAt(i, j, itemToWrite);
            }

        }

        return res;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        double[][] newItems = new double[this.rowCount][];

        for (int i = 0; i < this.rowCount; i++) {
            newItems[i] = Arrays.copyOf(this.items[i], this.items[i].length);
        }

        return new Matrix(newItems);
    }
}
