package scot.carricksoftware.hansen.passtwo;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import scot.carricksoftware.hansen.HansenPassBasicChecks;

@SpringBootTest
public class PassTwoImplTest extends HansenPassBasicChecks {


    private PassTwo passTwo;


    @Before
    public void setUp() {
        super.setUp();
        passTwo = new PassTwoImpl(factoryMock);
    }

    @Test
    public void whenICreatANewObject_theErrorCountIsZero() {
        checkNewObjectErrorCount(passTwo);
    }

    @Test
    public void whenICallCompile_theInputFileNameIsLogged() {
        passTwo.compile(RANDOM_TEST_STRING);
        Mockito.verify(loggerMock, Mockito.times(1)).functionCall(passTwo, "compile", RANDOM_TEST_STRING);
    }


}