package scot.carricksoftware.hansen;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HansenApplicationTest {

    @Test
    public void contextLoads() {
        HansenApplication.main(new String[]{});
        Assert.assertTrue(true);
    }


}