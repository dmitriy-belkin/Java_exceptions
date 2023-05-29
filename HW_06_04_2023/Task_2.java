//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.
package HW_06_04_2023;

import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        int[] firstValue = getFilledArray(10);
        int[] secondValue = getFilledArray(9);

        valuesArrays(firstValue, secondValue);
    }

    public static int[] valuesArrays(int[] firstValue, int[] secondValue) {
        if (firstValue.length != secondValue.length)
            throw new RuntimeException("Длины не совпадают");
        int[] resultArray = new int[firstValue.length];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = firstValue[i] - secondValue[i];
        }
        return resultArray;
    }

    public static int[] getFilledArray(int length) {
        int[] thirdValue = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            thirdValue[i] = rnd.nextInt(20);
        }
        return thirdValue;
    }
}