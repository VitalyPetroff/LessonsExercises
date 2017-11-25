public class ExerciseString {

    // вывод строки в консоль
    public void printString(String str){
        System.out.print("Вывод строки: ");
        for (int index = 0; index < str.length(); index++){
            System.out.print(str.charAt(index));
        }
        System.out.print("\n");
    }

    // преобразование строки в массив символов
    public char[] stringToChar(String str){
        int lengthOfString = str.length();
        char[] result = new char[lengthOfString];
        for (int index = 0; index < lengthOfString; index++){
            result[index] = str.charAt(index);
        }
        return result;
    }

    // вывод массива символов в консоль
    public void printArrOfChar(char[] charArray){
        System.out.print("Вывод массива символов: ");
        for (char element : charArray){
            System.out.print(element);
        }
        System.out.print("\n");
    }

    // подсчёт количества различных символов в массиве
    public int countOfSymbol(char[] charArray){
        int counter = charArray.length;
        for (int index = 0; index < charArray.length; index++){
            for (int i = 0; i < index; i++){
                if (charArray[index] == charArray[i]){
                    counter--;
                    break;
                }
            }
        }
        System.out.println("Количество различных символов в массиве: " + counter);
        return counter;
    }

    // формирование массива с различными символами
    public char[] formArrOfSymbol(char[] charArray, int numOfSymbol){
        char[] arrOfSymbol = new char[numOfSymbol];
        int counter = 1;
        arrOfSymbol[0] = charArray[0];
        for (int index = 1; index < charArray.length; index++){
            for (int i = 0; i < index; i++){
                if (charArray[index] == charArray[i]){
                    break;
                }
                if (i == (index - 1)){
                    arrOfSymbol[counter] = charArray[index];
                    counter++;
                }
            }
        }

        return arrOfSymbol;
    }

    // подсчёт различных символов в массиве
    public void printNumOfSymbol(char[] charArray, char[] arrOfSymbols){
        int[] numOfSymbols = new int[arrOfSymbols.length];
        int len = arrOfSymbols.length;
        for (int index = 0; index < len; index++){
            for (int i = 0; i < charArray.length; i++){
                if (arrOfSymbols[index] == charArray[i]){
                    numOfSymbols[index]++;
                }
            }
            System.out.println(arrOfSymbols[index] + " - " + numOfSymbols[index]);
        }
    }
}