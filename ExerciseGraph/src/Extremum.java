public class Extremum {

    // вычисление максимального значения вектора
    public double myMax(double[] vector) {
        int lengthOfVector = vector.length;
        double max = vector[0];
        for (int i = 1; i < lengthOfVector; i++) {
            if (vector[i] > max) {
                max = vector[i];
            }
        }
        return max;
    }

    // вычисление минимального значения вектора
    public double myMin(double[] vector) {
        int lengthOfVector = vector.length;
        double min = vector[0];
        for (int i = 1; i < lengthOfVector; i++) {
            if (vector[i] < min) {
                min = vector[i];
            }
        }
        return min;
    }
}
