package scot.carricksoftware.hansen.logger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import scot.carricksoftware.hansen.SimpleFactoryTests;

@SpringBootTest
public class ApplicationLoggerFactoryImplTest extends SimpleFactoryTests {

   private  ApplicationLoggerFactory factory;

    @Before
    public void setUp() {
        factory = new ApplicationLoggerFactoryImpl();
    }

    @Test
    public void whenICheckTheCommonFunctions_noProblemsAreFound() {
        Assert.assertTrue(checkFactoryOperation(factory, ApplicationLoggerImpl.class, true));
    }

    @Test
    public void whenIGetASecondObject_itIsTheSameOne() {
        try {
            Object ObjectOne = factory.getObject();
            Object ObjectTwo = factory.getObject();
            Assert.assertEquals(ObjectOne, ObjectTwo);
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void whenIGetASecondObjectFromASecondFactory_itIsTheSameOne() {
        ApplicationLoggerFactory factoryTwo = new ApplicationLoggerFactoryImpl();
        try {
            Object ObjectOne = factory.getObject();
            Object ObjectTwo = factoryTwo.getObject();
            Assert.assertEquals(ObjectOne, ObjectTwo);
        } catch (Exception e) {
            Assert.fail();
        }
    }


}