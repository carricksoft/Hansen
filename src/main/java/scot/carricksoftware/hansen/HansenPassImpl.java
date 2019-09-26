package scot.carricksoftware.hansen;

import scot.carricksoftware.hansen.factories.ApplicationFactory;
import scot.carricksoftware.hansen.filehelpers.FileValidator;
import scot.carricksoftware.hansen.logger.ApplicationLogger;

public abstract class HansenPassImpl implements HansenPass {

    private final ApplicationLogger logger;
    private final FileValidator fileValidator;

    protected HansenPassImpl(final ApplicationFactory applicationFactory) {
        logger = applicationFactory.getApplicationLogger();
        fileValidator = applicationFactory.getFileValidator();
    }

    public final int getErrorsCount() {
        return 0;
    }

    /**
     * Designed to be subclassed (overridden)
     * Without this javadoc checkstyle throws a fault
     *
     */
    public void compile(final String fileName) {
        logger.functionCall(this, "compile", fileName);
        fileValidator.validForReading(fileName);
    }


}
