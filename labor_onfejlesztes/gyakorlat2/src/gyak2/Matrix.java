package gyak2;

public class Matrix {

    private final int rows;
    private final int columns;
    private double[][] data;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }

    public Matrix(double[][] date) {
        this.rows = date.length;
        this.columns = date[0].length;
        this.data = new double[rows][columns];
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                this.data[i][j] = date[i][j];
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                System.out.printf("%.2f ",this.data[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public void fillRandom( double a, double b) {
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                data[i][j] = a + Math.random() * (b - a + 1);
            }
        }
    }

    //matrix elmeinek az osszeadasa
    public static Matrix add(Matrix m1, Matrix m2) {
        if (m1.rows != m2.rows || m1.columns != m2.columns) {
            System.out.println("Nem adhato ossze");
            return null;
        }
        Matrix sum = new Matrix(m1.rows, m1.columns);
        for (int i = 0; i < sum.rows; ++i) {
            for (int j = 0; j < sum.columns; ++j) {
                sum.data[i][j] = m1.data[i][j] + m2.data[i][j];
            }
        }
        return sum;
    }

    //matrix elemeinek az osszeszorzasa
    public static Matrix multiply(Matrix m1, Matrix m3) {
        if (m1.columns != m3.rows) {
            System.out.println("Nem szorozhato ossze");
            return null;
        }
        Matrix multi = new Matrix(m1.rows, m1.columns);
        for (int i = 0; i < multi.rows; ++i) {
            for (int j = 0; j <multi.columns; ++j) {
                multi.data[i][j] = m1.data[i][j] * m3.data[i][j];
            }
        }
        return multi;
    }

    //matrix transzponalasa
    public static Matrix transpose(Matrix m3) {
        if (m3.columns == 1 && m3.rows == 1) {
            System.out.println("nem lehet transzponalni");
        }
        Matrix trans = new Matrix(m3.rows, m3.columns);
        for (int j = 0; j < trans.columns; ++j) {
            for (int i = 0; i < trans.rows; ++i) {
                System.out.printf("%.2f ", m3.data[i][j]);
            }
            System.out.println("\n");
        }
        return trans;
    }


    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

}