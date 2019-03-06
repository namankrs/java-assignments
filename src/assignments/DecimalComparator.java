package assignments;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.175,-3.1756));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        return (int)(firstNumber*100) == (int)(secondNumber*100);
    }

}
