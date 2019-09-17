package scot.carricksoftware.hansen.passone;

import org.springframework.stereotype.Component;
import scot.carricksoftware.hansen.HansenPassImpl;
import scot.carricksoftware.hansen.factories.ApplicationFactory;
import scot.carricksoftware.hansen.logger.ApplicationLogger;

@Component
public class PassOneImpl extends HansenPassImpl implements PassOne {

    private final ApplicationLogger logger;

    public PassOneImpl(final ApplicationFactory applicationFactory) {
        super();
        logger = applicationFactory.getApplicationLogger();
    }

    @Override
    public final void compile(final String fileName) {
        logger.functionCall(this, "compile", fileName);
    }
}
