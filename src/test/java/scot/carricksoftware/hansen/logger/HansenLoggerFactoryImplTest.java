package scot.carricksoftware.hansen.logger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import scot.carricksoftware.hansen.SimpleFactoryTests;

@SpringBootTest
public class HansenLoggerFactoryImplTest extends SimpleFactoryTests {


    private HansenLoggerFactory factory;

    @Before
    public void setUp() {
        factory = new HansenLoggerFactoryImpl();
    }

    @Test
    public void nothing() {
       Assert.assertTrue(true);
    }



}