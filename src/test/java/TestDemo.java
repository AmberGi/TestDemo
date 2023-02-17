import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {

    @Test
    public void testIfNumber255DividesWith5() {
        // ko reikia testui
        // 1. Paduoti duomenis
        // 2. Testo veiksmai
        // 3. Rezultatu palyginimas
        // testas: patikrinti ar skaicius dalinasi is 5?

        // 1. Duomenys:

        int input = 255;
        int actualResult;
        int expectedResult = 0; //tikimes, kad dalinant su liekana, liekana bus 0

        // 2.Testo veiksmai:

        actualResult = input % 5;

        // 3. Palyginimas:

        Assert.assertEquals(actualResult, expectedResult);
    }

    //spaudziam @Test

    @Test
    public void testWithNegativeDataIf48DividesWith5AndReturnReminder3() {
        // kai daliname is 5, negatyvus scenarijus

        int input = 48;
        int actualResult;
        int expectedResult = 3; // nes 48 % 5 liekana yra 3

        // 2.Testo veiksmai:

        actualResult = input % 5;

        // 3. Palyginimas:

        Assert.assertEquals(actualResult, expectedResult);

    }
}
