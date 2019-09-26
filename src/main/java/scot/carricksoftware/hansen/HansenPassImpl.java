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
     * Must be subclassed
     */
    public void compile(final String fileName) {
        logger.functionCall(this, "compile", fileName);
        fileValidator.validForReading(fileName);
    }

}
