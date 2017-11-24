public class MassiveComparsion {

    public static void main(String[] args) {
        MassiveComparsion ClassMass = new MassiveComparsion();
        int lenOfFirst = 10;    // размерность первого массива
        int lenOfSecond = 12;   // размерность второго массива
        int threshold = 3;      // порог схожести массивов

        // формирование массивов
        int[] array1 = ClassMass.formArray(lenOfFirst);
        int[] array2 = ClassMass.formArray(lenOfSecond);

        // вывод на экран массивов
        ClassMass.printArray(array1);
        ClassMass.printArray(array2);
        // считаем количество подобных элементов
        int N = ClassMass.comparsionOfArray(array1, array2);
        System.out.println("Количество совпадений - " + N);

        // сравниваем количество подобных с порогом
        if (N > threshold){
            System.out.println("Массивы похожи");
        }
    }

    // формирование массива
    public int[] formArray(int length) {
        int[] massive = new int[length];
        for (int index = 0; index < length; index++){
            massive[index] = (int)(Math.random() * 20);
        }
        return massive;
    }

    // вывод массива в консоль
    public void printArray(int[] massive){
        for (int element : massive) {
            System.out.print(element + "\t");
        }
        System.out.print("\n");
    }

    // сравнение массивов
    public int comparsionOfArray(int[] arr1, int[] arr2){
        int count = 0;
        for (int indArr1 = 0; indArr1 < arr1.length; indArr1++){
            for (int indArr2 = 0; indArr2< arr2.length; indArr2++){
                if (arr1[indArr1] == arr2[indArr2]){
                    count++;
                }
            }
        }
        return count;
    }
}