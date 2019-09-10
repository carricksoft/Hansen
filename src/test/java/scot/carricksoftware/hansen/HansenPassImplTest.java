package scot.carricksoftware.hansen;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HansenPassImplTest {

    @Test
    public void whenICreatANewObject_theErrorCountIsZero() {
        Assert.assertEquals(0, new HansenPassImpl().getErrorsCount());
    }
}