package chapter4;

public class Cryptography {

    public static boolean isValidData(int data) {
        int checkData = data / 1000;
        if (checkData  > 0 && checkData < 9)return true;
        return false;
    }

    public static int replaceData(int data) {
        int valueToMultiplyEachDigitBy = 1;
        int result = 0;
        for (int i = 1; i <= 4; i++) {
            int decimal = data / 10;
            int remainder = data % 10;;
            int remainderPlusSeven = remainder + 7;
            int remainderPlusSevenDividedByTen = remainderPlusSeven % 10;
            result = result + remainderPlusSevenDividedByTen * valueToMultiplyEachDigitBy;
            valueToMultiplyEachDigitBy *= 10;
            data = decimal;
        }

        return result;
    }

    public static int swappedData(int data) {
        int secondDigit = data % 10;
        data /= 10;

        int firstDigit = data % 10;
        data /= 10;

        int fourthDigit = data % 10;
        data /= 10;

        int thirdDigit = data;

        return firstDigit * 1000 + secondDigit * 100 + thirdDigit * 10 + fourthDigit;
    }

    public static int encryptData(int data) {
        if (isValidData(data)){
            return swappedData(replaceData(data));
        }
        return 0;
    }

    public static int swapEncryptedData(int encryptedData) {
        int secondDigit = encryptedData % 10;
        encryptedData /= 10;

        int firstDigit = encryptedData % 10;
        encryptedData /= 10;

        int fourthDigit = encryptedData % 10;
        encryptedData /= 10;

        int thirdDigit = encryptedData;
        return firstDigit * 1000 + secondDigit * 100 + thirdDigit * 10 + fourthDigit;
    }

    public static int replaceEncryptedData(int swappedEncryptedData) {
        int result = 0;
        int multiplyEachDigitBy = 1;
        for (int i = 0; i < 4; i++) {
            int digitAtEachPosition = swappedEncryptedData % 10;
            swappedEncryptedData /= 10;
            if (digitAtEachPosition < 7) result += multiplyEachDigitBy * (digitAtEachPosition + 10 - 7);
            else result += multiplyEachDigitBy * (digitAtEachPosition - 7);
            multiplyEachDigitBy *= 10;
        }
        return result;
    }

    public static int decryptData(int encryptedData) {
        int swappedEncryptedData = swapEncryptedData(encryptedData);
        return replaceEncryptedData(swappedEncryptedData);
    }
}
