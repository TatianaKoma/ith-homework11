package ua.ithillel;

public class ArrayValueCalculator {
    private static final int NUMBER_OF_ELEMENTS = 16;
    private static final int SIZE_OF_ARRAY = 4;

    public int doCal(String[][] num) {
        int result = 0;
        try {
            checkIsDigit(num);
            checkSizeOfArray(num);
            for (String[] strings : num) {
                for (String string : strings) {
                    result += Integer.parseInt(string);
                }
            }
        } catch (MyArraySizeException ex) {
            ex.printStackTrace();
            System.out.println("SWW with size of array");
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println("Something went wrong with data in array");
        } catch (Exception e) {
            System.out.println("SWW");
        }
        return result;
    }

    public static void checkSizeOfArray(String[][] num) throws MyArraySizeException {
        int countElements = 0;
        for (String[] strings : num) {
            for (int j = 0; j < strings.length; j++) {
                countElements++;
            }
        }
        if (countElements != NUMBER_OF_ELEMENTS || num.length != SIZE_OF_ARRAY) {
            String message = "Array size is not appropriate";
            throw new MyArraySizeException(message);
        }
    }

    public static void checkIsDigit(String[][] num) throws MyArrayDataException {
        for (String[] strings : num) {
            for (String string : strings) {
                if (!string.matches("\\d+")) {
                    String message = "This is not a number: " + string;
                    throw new MyArrayDataException(message);
                }
            }
        }
    }
}
