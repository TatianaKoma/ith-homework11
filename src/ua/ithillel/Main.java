package ua.ithillel;

public class Main {
    public static void main(String[] args) {
        String[][] words = {{"1", "5", "7", "4"}, {"3", "0", "5", "3"},
                {"2", "5", "8", "1"}, {"3", "2", "7", "5"}};
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        System.out.println(arrayValueCalculator.doCal(words));
    }
}
