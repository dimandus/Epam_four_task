import java.util.Arrays;

/**
 * Created by Dimandus on 07.11.2015.
 */
public class Matrix {

    double[][] items;
    int rowCount;
    int columnCount;

    public Matrix(double[][] source) {
        items = source;
        if(source!=null) {
            rowCount = source.length;
            columnCount = source[0].length;
        }
        else
        {
            rowCount = 0;
            columnCount =0;
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

    /**
     * ѕроверка, все ли значени€ матрицы инициализированы
     * @param source матрица
     * @return результат
     */
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

    public static boolean isEqual(Matrix first, Matrix second) {
        boolean isEqual = true;

        if (first.rowCount != second.rowCount || first.columnCount != second.columnCount) {
            return false;
        }

        for (int i = 0; i < first.rowCount; i++) {
            if (!Arrays.equals(first.items[i], second.items[i])) {
                return false;
            }
        }

        return true;

    }
}
