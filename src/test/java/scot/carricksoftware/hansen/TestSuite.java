package scot.carricksoftware.hansen;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import scot.carricksoftware.hansen.factories.FactoriesTestSuite;
import scot.carricksoftware.hansen.logger.LoggerTestSuite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

        FactoriesTestSuite.class,
        LoggerTestSuite.class,
        HansenApplicationTest.class,


})

public class TestSuite {
}
