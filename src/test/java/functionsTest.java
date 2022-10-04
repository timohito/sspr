import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class functionsTest {
    @Test
    public void sumTest() throws IOException {
        int a = 5;
        int b = 10;
        int sum = a + b;
        Assertions.assertEquals(15, sum);
    }

    @Test
    public void subTest() throws IOException {
        int a = 25;
        int b = 10;
        int sub = a - b;
        Assertions.assertEquals(15, sub);
    }

    @Test
    public void mulTest() throws IOException {
        int a = 25;
        int b = 10;
        int mul = a * b;
        Assertions.assertEquals(250, mul);
    }

    @Test
    public void divTest() throws IOException {
        int a = 55;
        int b = 5;
        int div = a / b;
        Assertions.assertEquals(11, div);
    }
}
