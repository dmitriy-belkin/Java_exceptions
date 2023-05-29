//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

package HW_06_04_2023;

public class Task_1 {
    public static void main(String[] args) {
        String[] createdArray = { "One line", null, "two line" };
        int[] specifiedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        division(10, 0);
        printValueByIndex(specifiedArray, 12);
        printStringArray(createdArray);

    }

    // division by zero

    public static void division(double firstNumber, double secondNumber) {
        if (secondNumber == 0)
            throw new ArithmeticException("На ноль делить нельзя");
        double result = firstNumber / secondNumber;
        System.out.printf("Результат деления %f на %f равен %f.\n", firstNumber, secondNumber, result);
    }

    // out of bounds

    public static void printValueByIndex(int[] array, int index) {
        if (index > array.length - 1)
            throw new ArrayIndexOutOfBoundsException("Элемента под таким индексом не существует");
        else
            System.out.printf("Элемент с индексом %d равен %d.\n", index, array[index]);
    }

    // Null pointer exception

    public static void printStringArray(String[] createdArray) {
        for (String item : createdArray) {
            if (item == null)
                throw new NullPointerException("Элемент отсутствует");
            System.out.println(item);
        }
    }
}