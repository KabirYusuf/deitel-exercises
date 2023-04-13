package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasMileageTest {
    @Test
    void testThatMilesPerGallonForEachTripCanBeCalculated(){
        double milesPerGallon =GasMileage.calcMilesPerGallon(2,4);
        assertEquals(0.5, milesPerGallon);
    }

}