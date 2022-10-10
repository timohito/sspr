import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class functionsTest {
    @Test
    public void sumTest() {
        int a = 5;
        int b = 10;
        int sum = sum(a,b);
        Assertions.assertEquals(15, sum);
    }

    @Test
    public void subTest() {
        int a = 25;
        int b = 10;
        int sub = sub(a,b);
        Assertions.assertEquals(15, sub);
    }

    @Test
    public void mulTest() {
        int a = 25;
        int b = 10;
        int mul = mul(a,b);
        Assertions.assertEquals(250, mul);
    }

    @Test
    public void divTest() {
        int a = 55;
        int b = 5;
        int div = (int) div(a,b);
        Assertions.assertEquals(11, div);
    }
}
