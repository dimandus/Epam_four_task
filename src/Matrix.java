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
}
