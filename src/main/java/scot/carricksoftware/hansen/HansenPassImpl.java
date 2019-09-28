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

   @SuppressWarnings("checkstyle:DesignForExtension")
    public void compile(final String inputFileName, final String outputFileName) {
        logger.functionCall(this, "compile", inputFileName);
        if (fileValidator.validForReading(inputFileName)) {
            fileValidator.validForWriting(outputFileName);
        }
    }


}
