public class ExerciseMain {

    public static void main(String[] args) {

        // интервал задания функции и количество расчётных точек
        final double PI = 3.1415926536;
        double minX = 0;
        double maxX = PI * 10;
        int lengthX = 160;

        VectorXY func = new VectorXY();
        double[] vectorX = func.formVectorX(minX, maxX, lengthX);   // формирование вектора x
        double[] vectorY = func.calculationOfVectorY(vectorX);      // формирование вектора y

        GraphInConsole graph = new GraphInConsole();

        int[] yTransform = graph.transformerY(vectorY);
        char[][] arr = graph.vectorToArray(yTransform);
        graph.printArrInConsole(arr);
    }
}