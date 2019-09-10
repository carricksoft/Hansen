package scot.carricksoftware.hansen.passone;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PassOneImplTest {

    @Test
    public void whenICreatANewObject_theErrorCountIsZero() {
        Assert.assertEquals(0, new PassOneImpl().getErrorsCount());
    }
}