package scot.carricksoftware.hansen;

import scot.carricksoftware.hansen.factories.ApplicationFactory;
import scot.carricksoftware.hansen.logger.ApplicationLogger;

public class HansenPassImpl implements HansenPass {

    private final ApplicationLogger logger;

    protected HansenPassImpl(final ApplicationFactory applicationFactory) {
        logger = applicationFactory.getApplicationLogger();
    }

    @Override
    public final int getErrorsCount() {
        return 0;
    }

    @SuppressWarnings("CheckStyle")
    @Override
    public void compile(final String fileName) {
        logger.functionCall(this, "compile", fileName);
    }

}
