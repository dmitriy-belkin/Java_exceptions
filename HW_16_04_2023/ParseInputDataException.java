package HW_16_04_2023;

public class ParseInputDataException extends Exception {
    String data;

    public ParseInputDataException(String inputData) {
        this.data = inputData;
    }

    @Override
    public String getMessage() {
        return this.data;
    }

}