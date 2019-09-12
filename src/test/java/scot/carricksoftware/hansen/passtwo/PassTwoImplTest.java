package scot.carricksoftware.hansen.passtwo;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PassTwoImplTest {


    @Test
    public void whenICreatANewObject_theErrorCountIsZero() {
        Assert.assertEquals(0, new PassTwoImpl().getErrorsCount());
    }



}