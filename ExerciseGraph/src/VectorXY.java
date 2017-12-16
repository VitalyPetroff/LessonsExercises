public class VectorXY {

    // вычисление значения функции y = f(x)
    private static double valueOfFunction(double x) {
        return (x * x * x);
    }

    // формирование вектора X
    public static double[] formVectorX(double minX, double maxX, int lengthX) {
        double[] vectorX = new double[lengthX];
        double deltaX = (maxX - minX) / (lengthX - 1);
        vectorX[0] = minX;
        for (int i = 1; i < lengthX; i++) {
            vectorX[i] = vectorX[i - 1] + deltaX;
        }
        return vectorX;
    }

    // расчёт вектора Y
    public static double[] calculationOfVectorY(double[] vectorX) {
        int lengthOfVector = vectorX.length;
        double[] vectorY = new double[lengthOfVector];
        for (int i = 0; i < lengthOfVector; i++) {
            vectorY[i] = valueOfFunction(vectorX[i]);
            if ((vectorY[i] < 0.01) && (vectorY[i] > -0.01)) {
                vectorY[i] = 0;
            }
        }
        return vectorY;
    }
}