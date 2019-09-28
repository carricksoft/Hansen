package scot.carricksoftware.hansen.passone;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import scot.carricksoftware.hansen.HansenPassBasicChecks;

@SpringBootTest
public class PassOneImplTest extends HansenPassBasicChecks {

    private PassOne passOne;

    @Before
    public void setUp() {
        super.setUp();

        passOne = new PassOneImpl(factoryMock);
    }


    @Test
    public void whenICreatANewObject_theErrorCountIsZero() {
        checkNewObjectErrorCount(passOne);
    }


    @Test
    public void whenICallCompile_itIsLogged() {
        checkLoggingOfCompile(passOne);
    }

    @Test
    public void whenICallCompile_theInputFileNameIsValidatedForReading() {
        passOne.compile(RANDOM_TEST_STRING, RANDOM_TEST_STRING2);
        Mockito.verify(fileValidatorMock, Mockito.times(1)).validForReading(RANDOM_TEST_STRING);
    }


    @Test
    public void whenICallCompile_andValidateForReadingPassesThenTheSecondFileIsValidatedForWriting() {
        Mockito.when(fileValidatorMock.validForReading(RANDOM_TEST_STRING)).thenReturn(true);

        passOne.compile(RANDOM_TEST_STRING,RANDOM_TEST_STRING2 );
        Mockito.verify(fileValidatorMock, Mockito.times(1)).validForWriting(RANDOM_TEST_STRING2);
    }




}