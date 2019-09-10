package scot.carricksoftware.hansen;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import scot.carricksoftware.hansen.factories.FactoriesTestSuite;
import scot.carricksoftware.hansen.logger.LoggerTestSuite;
import scot.carricksoftware.hansen.passone.PassOneTestSuite;
import scot.carricksoftware.hansen.passtwo.PassTwoTestSuite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

        FactoriesTestSuite.class,
        LoggerTestSuite.class,
        PassOneTestSuite.class,
        PassTwoTestSuite.class,

        HansenApplicationTest.class,
        HansenPassImplTest.class,



})

public class TestSuite {
}
