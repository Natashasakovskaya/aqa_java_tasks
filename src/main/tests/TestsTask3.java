import lesson1.Task3;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsTask3 {

    @Test
    public void testNameQuantity () {
        String expectedResult = "test test test test test test test test test test";
        String calMethodResult = Task3.buidRow("test");
        Assert.assertEquals(calMethodResult, expectedResult);
    }


    @Test
    public void testHomeWorkTask () {
        String expectedResult
                = "test test test test test test test test test test"
                + "\n"
                + "test test test test test test test test test test";
        String calMethodResult = Task3.homeWorkTask(2, "test");
        Assert.assertEquals(calMethodResult, expectedResult);
    }

}
