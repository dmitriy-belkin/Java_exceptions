/*
Задача 1.
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float) и возвращает введенное значение. 
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
*/

package HW_10_04_2023;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean valid;
        Float floatNumber = null;
        String inputData;
        do {
            System.out.print("Введите число: \t");
            try {
                inputData = scanner.nextLine();
                if (Float.parseFloat(inputData) > 0) {
                    floatNumber = Float.parseFloat(inputData);
                    valid = true;
                } else {
                    System.out.println("Неправильный ввод");
                    valid = false;
                }
            } catch (Exception ex) {
                valid = false;
            }
        } while (!valid);
        System.out.println("Вы ввели число: " + floatNumber);
    }
}