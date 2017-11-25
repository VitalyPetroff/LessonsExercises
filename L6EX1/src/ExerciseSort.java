public class ExerciseSort {

    public int[] formMassive(int length){
        int[] mass = new int[length];
        for (int index = 0; index < length; index++){
            mass[index] = (int)(Math.random() * 10);
        }
        return mass;
    }

    public void printMassive(int[] mass){
        System.out.println("Вывод массива в консоль:");
        for (int element : mass){
            System.out.print(element + "\t");
        }
        System.out.println("\n");
    }

    public int[] sortMassive(int[] mass){
        int temp;
        for (int i = 0; i < mass.length - 1; i++){
            for (int j = 0; j < mass.length - 1; j++){
                if (mass[j] > mass[j + 1]){
                    temp = mass[j + 1];
                    mass[j + 1] = mass[j];
                    mass[j] = temp;
                }
            }
        }
        return mass;
    }
}