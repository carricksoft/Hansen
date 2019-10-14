package scot.carricksoftware.hansen.passone;

import org.junit.Assert;
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

    @Test
    public void whenICallCompile_andValidateForReadingFailsThenTheSecondFileIsNotValidatedForWriting() {
        Mockito.when(fileValidatorMock.validForReading(RANDOM_TEST_STRING)).thenReturn(false);

        passOne.compile(RANDOM_TEST_STRING,RANDOM_TEST_STRING2 );
        Mockito.verify(fileValidatorMock, Mockito.times(0)).validForWriting(RANDOM_TEST_STRING2);
    }


    @Test
    public void whenICallCompile_andTheFirstFileIsEmptyItIsNotTestedForValidReading() {
        passOne.compile(EMPTY_STRING,RANDOM_TEST_STRING2 );

        Mockito.verify(fileValidatorMock, Mockito.times(0)).validForReading(Mockito.anyString());
    }

    @Test
    public void whenICallCompile_andTheFirstFileIsAPaddedEmptyStringItIsNotTestedForValidReading() {
        passOne.compile(PADDED_EMPTY_STRING,RANDOM_TEST_STRING2 );

        Mockito.verify(fileValidatorMock, Mockito.times(0)).validForReading(Mockito.anyString());
    }


    @Test
    public void whenICallCompile_andTheFirstFileIsNullIsNotTestedForValidReading() {
        passOne.compile(null,RANDOM_TEST_STRING2 );

        Mockito.verify(fileValidatorMock, Mockito.times(0)).validForReading(Mockito.anyString());
    }


    @Test
    public void whenICallCompileOnAPaddedValidInputFileName_theInputFileNameIsValidatedForReading() {
        passOne.compile("   " + RANDOM_TEST_STRING + "   ", RANDOM_TEST_STRING2);

        Mockito.verify(fileValidatorMock, Mockito.times(1)).validForReading(RANDOM_TEST_STRING);
    }

    @Test
    public void whenICreateAnewObject_theItemsReadCountIsZero() {
        Assert.assertEquals(0,passOne.getItemsRead());
    }

}