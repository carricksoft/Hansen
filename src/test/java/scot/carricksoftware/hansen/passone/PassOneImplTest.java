package scot.carricksoftware.hansen.passone;

import org.junit.Before;
import org.junit.Test;
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
    public void checkCompileLogsFileName() {
        checkLoggingOfFilename(passOne);
    }




}