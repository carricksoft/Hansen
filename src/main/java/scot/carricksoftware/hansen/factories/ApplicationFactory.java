package scot.carricksoftware.hansen.factories;

import scot.carricksoftware.hansen.filehelpers.FileValidator;
import scot.carricksoftware.hansen.logger.ApplicationLogger;

public interface ApplicationFactory {

    ApplicationLogger getApplicationLogger();
    FileValidator getFileValidator();
}
