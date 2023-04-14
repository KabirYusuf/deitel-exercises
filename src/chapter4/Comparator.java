package chapter4;

public class Comparator {

    public static int compare(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber)return 1;
        else if(firstNumber < secondNumber)return -1;
        return 0;
    }
}
