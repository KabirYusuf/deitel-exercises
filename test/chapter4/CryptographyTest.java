package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CryptographyTest {
    @Test
    void testThatOnlyFourDigitIntegerIsAccepted(){
        //Given that I have a four digit integer value
        int data = 1234;
        // If I verify the data
        boolean isValidData = Cryptography.isValidData(data);
        //Assert true that the data is valid
        assertTrue(isValidData);
    }
    @Test
    void testThatDataLessThanFourDigitIsNotAccepted(){
        //Given that I have a four digit integer value
        int data = 0234;
        // If I verify the data
        boolean isValidData = Cryptography.isValidData(data);
        //Assert false that the data is valid
        assertFalse(isValidData);
    }
    @Test
    void testThatDataCanBeReplacedByAddingSevenToEachDataAndGettingRemainderAfterDivingByTen(){
        // Given that I have data
        int data = 1234;
        // If I replace the value of each digit by adding seven and getting remainder after dividing the value by ten
        int replacedData = Cryptography.replaceData(data);
        //Assert that replaced data = 8901
        assertEquals(8901, replacedData);
    }
    @Test
    void testThatDigitsInDataCanBeSwapped(){
        // Given that I have data
        int data = 1234;
        //If I swap first digit - third digit and second digit - fourth digit
        int swappedData = Cryptography.swappedData(data);
        //Assert equals that swapped data = 3412;
        assertEquals(3412, swappedData);
    }

    @Test
    void testThatDataCanBeEncrypted(){
        // Given that I have data
        int data = 1234;
        //If I encrypt the data
        int encryptedData = Cryptography.encryptData(data);
        //Assert equals that encrypted data = 0189;
        assertEquals(189, encryptedData);
    }
    @Test
    void testThatDigitsInEncryptedDataCanBeSwapped(){
        //Given that I have an encrypted data
        int encryptedData = 189;
        //If I swap third digit - first digit and fourth digit - second digit
        int swappedEncryptedData = Cryptography.swapEncryptedData(encryptedData);
        //Assert equals that swapped encrypted data = 8901
        assertEquals(8901, swappedEncryptedData);
    }

    @Test
    void testThatSwappedEncryptedDataDigitsCanBeReplacedByTheDigitPlusSevenAndTheRemainderWhenDividedByTen(){
        //Given that I have a swapped encrypted data
        int swappedEncryptedData = 8901;

        // If I replace each digit by the remainder of adding seven to the digit and dividing by 10;
        int replacedDigitData = Cryptography.replaceEncryptedData(swappedEncryptedData);

        //Assert equals that replacedDigitData = 1234;
        assertEquals(1234, replacedDigitData);
    }
    @Test
    void testThatDataCanBeDecrypted(){

    }

}