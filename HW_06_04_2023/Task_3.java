//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.
//Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

package HW_06_04_2023;

import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        int[] firstValue = getFilledArray(10);
        int[] secondValue = getFilledArray(10);

        int[] divArray = divArrays(firstValue, secondValue);
        printArray(divArray);

        divArrays(null, secondValue);
    }

    public static int[] divArrays(int[] firstValue, int[] secondValue) {
        if (firstValue == null || secondValue == null)
            throw new RuntimeException("Нет массивов");
        if (firstValue.length != secondValue.length)
            throw new RuntimeException("Длины массивов не равны");

        int[] resultArray = new int[firstValue.length];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = firstValue[i] / secondValue[i];
        }
        return resultArray;
    }

    public static int[] getFilledArray(int length) {
        int[] thirdValue = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            thirdValue[i] = random.nextInt(1, 20);
        }
        return thirdValue;
    }

    public static void printArray(int[] thirdValue) {
        for (int number : thirdValue) {
            System.out.println(number);
        }
    }

}