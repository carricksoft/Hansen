package scot.carricksoftware.hansen;

import org.junit.Assert;
import org.mockito.Mockito;
import scot.carricksoftware.hansen.factories.ApplicationFactory;
import scot.carricksoftware.hansen.filehelpers.FileValidator;
import scot.carricksoftware.hansen.logger.ApplicationLogger;

public class HansenPassBasicChecks extends TestConstants {

    protected ApplicationLogger loggerMock;
    protected ApplicationFactory factoryMock;
    protected FileValidator fileValidatorMock;

    protected void setUp() {
        loggerMock = Mockito.mock(ApplicationLogger.class);
        factoryMock = Mockito.mock(ApplicationFactory.class);
        fileValidatorMock = Mockito.mock(FileValidator.class);

        Mockito.when(factoryMock.getApplicationLogger()).thenReturn(loggerMock);
        Mockito.when(factoryMock.getFileValidator()).thenReturn(fileValidatorMock);
    }

    protected void checkNewObjectErrorCount(final HansenPass hansenPass) {
        Assert.assertEquals(0, hansenPass.getErrorsCount());
    }

    protected void checkLoggingOfCompile(final HansenPass hansenPass) {
        hansenPass.compile(RANDOM_TEST_STRING);
        Mockito.verify(loggerMock, Mockito.times(1)).functionCall(hansenPass, "compile", RANDOM_TEST_STRING);
    }
}
