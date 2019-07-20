
import lesson1.Task1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsTask1 {

    @Test
    public void positiv() {
        int result = Task1.min(1, 2, 0);
        Assert.assertEquals(result, 0, "mini els");
    }
}
