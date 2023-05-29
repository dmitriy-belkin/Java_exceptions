package HW_16_04_2023;

public class GenderException extends Exception {
    String data;

    public GenderException(String inputData) {
        this.data = inputData;
    }

    @Override
    public String getMessage() {
        return "Неправильно указан пол: '" + data + "'!\n" +
                "Формат ввода пола: M или F.";
    }
}