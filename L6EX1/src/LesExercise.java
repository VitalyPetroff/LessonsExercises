public class LesExercise {


    public static void main(String[] args) {
        // === ЗАДАНИЕ 1 ===
        ExerciseSort Exercise = new ExerciseSort();
        int lengthOfMassive = 20;
        int[] array = new int[lengthOfMassive];

        array = Exercise.formMassive(lengthOfMassive);
        Exercise.printMassive(array);
        array = Exercise.sortMassive(array);
        Exercise.printMassive(array);

        // === ЗАДАНИЕ 2 ===
        String str = "ga gaga asf ddd345 dd44 d168";
        ExerciseString Ex2 = new ExerciseString();
        Ex2.printString(str);   // вывод строки в консоль

        char[] charArray = Ex2.stringToChar(str);   // преобразование строки в массив символов

        Ex2.printArrOfChar(charArray);   // вывод массива символов в консоль

        int numOfSymbol = Ex2.countOfSymbol(charArray); // подсчёт количества различных символов

        char[] arrOfSymbols = new char[numOfSymbol];
        arrOfSymbols = Ex2.formArrOfSymbol(charArray, numOfSymbol); // формирование массива с различными символами

        Ex2.printArrOfChar(arrOfSymbols); // вывод массива с различными символами в консоль

        Ex2.printNumOfSymbol(charArray, arrOfSymbols); // подсчёт количества различных символов
    }
}