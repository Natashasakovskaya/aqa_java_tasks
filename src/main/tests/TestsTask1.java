
import lesson1.Task1;
import lesson1.Task2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestsTask1 {

    @Test
    public void positiv() {
        int result = Task1.min(1, 2, 0);
        Assert.assertEquals(result, 0, "mini els");
    }





    @Test(dataProvider="dataTestMyName")
    public void testMyName(String name, String expectedResult) {
        Assert.assertEquals(
                Task2.myName(name),
                expectedResult
        );
    }

    @DataProvider(name="dataTestMyName")
    public Object[][] dataTestMyName() {
        return new Object[][] {
                {
                       "Serg", "My name is: Serg\n new line"
                },
        };

    }









// ===========================================================

    public static boolean min2(int a, int b) {
        return a < b;
    }

// ===========================================================


    @Test(dataProvider="dataMinDigitsChecking")
    public void minDigitsChecking(int one, int two, boolean expectedResult) {
        boolean result = TestsTask1.min2(one, two);
        Assert.assertEquals(result, expectedResult);

    }


    @DataProvider(name="dataMinDigitsChecking")
    public Object[][] dataMinDigitsChecking() {
        return new Object[][] {
                {
                    1, // one
                    0, // two
                    false // expectedResult
                },
                {
                    0, 1, true
                },
                {
                    0, 0, false
                }
        };

    }
}
