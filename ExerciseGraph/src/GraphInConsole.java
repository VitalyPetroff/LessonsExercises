public class GraphInConsole {

    private int numOfLine = 21;
    private int numOfColumn;
    private char[][] arrToConsole;

    // преобразование вектора y
    public int[] transformerY(double[] vectorY) {
        numOfColumn = vectorY.length;
        Extremum MiniMax = new Extremum();
        double minY = MiniMax.myMin(vectorY);
        double maxY = MiniMax.myMax(vectorY);
        double deltaY = (maxY - minY) / (numOfLine - 1);
        int[] yTransform = new int[numOfColumn];
        for (int i = 0; i < numOfColumn; i++) {
            yTransform[i] = (int) (Math.round((maxY - vectorY[i]) / deltaY));
        }
        return yTransform;
    }

    // формирование осей
    private void formAxis() {
        arrToConsole = new char[numOfLine][numOfColumn];
        for (int i = 0; i < numOfLine; i++) {
            arrToConsole[i][0] = '|';
            arrToConsole[i][numOfColumn - 1] = '|';
        }
        for (int j = 0; j < numOfColumn; j++) {
            arrToConsole[0][j] = '-';
            arrToConsole[numOfLine - 1][j] = '-';
        }
    }

    // преобразование вектора в массив для отображения
    public char[][] vectorToArray(int[] vector) {
        formAxis();
        for (int i = 0; i < numOfColumn; i++) {
            arrToConsole[vector[i]][i] = 'o';
        }
        return arrToConsole;
    }

    // вывод массива в консоль
    public void printArrInConsole(char[][] arr) {
        for (int x = 0; x < numOfLine; x++) {
            for (int y = 0; y < numOfColumn; y++) {
                if (arr[x][y] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(arr[x][y]);
                }
            }
            System.out.println();
        }
    }
}