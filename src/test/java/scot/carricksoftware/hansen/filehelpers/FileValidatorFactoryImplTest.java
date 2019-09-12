package scot.carricksoftware.hansen.filehelpers;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import scot.carricksoftware.hansen.SimpleFactoryTests;

@SpringBootTest
public class FileValidatorFactoryImplTest extends SimpleFactoryTests {


    @Test
    public void whenICheckTheCommonFunctions_noProblemsAreFound() {
        FileValidatorFactory factory  = new FileValidatorFactoryImpl();
        Assert.assertTrue(checkFactoryOperation(factory, FileValidatorImpl.class, false));
    }


}