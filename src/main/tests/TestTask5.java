import lesson1.Task3;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTask5 {

    public void testHelloWord () {
        java.lang.String expectedResult = "Hello world!!!";
        String calMethodResult = Task3.buidRow("test");
        Assert.assertEquals(calMethodResult, expectedResult);
    }

}
