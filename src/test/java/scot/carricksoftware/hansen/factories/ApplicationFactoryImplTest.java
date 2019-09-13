package scot.carricksoftware.hansen.factories;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import scot.carricksoftware.hansen.logger.ApplicationLoggerImpl;

@SpringBootTest
public class ApplicationFactoryImplTest {

    private ApplicationFactory factory;

    @Before
    public void setUp() {
        factory = new ApplicationFactoryImpl();
    }

    @Test
    public void whenIAskForAToolBoxLogger_theCorrectObjectTypeIsReturned() {
        Assert.assertEquals(ApplicationLoggerImpl.class, factory.getApplicationLogger().getClass());
    }

}