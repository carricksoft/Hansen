package scot.carricksoftware.hansen.passtwo;

import org.springframework.stereotype.Component;
import scot.carricksoftware.hansen.HansenPassImpl;
import scot.carricksoftware.hansen.factories.ApplicationFactory;
import scot.carricksoftware.hansen.logger.ApplicationLogger;

@Component
public class PassTwoImpl extends HansenPassImpl implements PassTwo {

    private final ApplicationLogger logger;

    public PassTwoImpl(final ApplicationFactory applicationFactory) {
        super();
        logger = applicationFactory.getApplicationLogger();
    }

    @Override
    public final void compile(final String fileName) {
        logger.functionCall(this, "compile", fileName);
    }

}
