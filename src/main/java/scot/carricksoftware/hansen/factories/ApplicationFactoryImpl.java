package scot.carricksoftware.hansen.factories;

import org.springframework.stereotype.Component;
import scot.carricksoftware.hansen.filehelpers.FileValidator;
import scot.carricksoftware.hansen.filehelpers.FileValidatorFactoryImpl;
import scot.carricksoftware.hansen.logger.ApplicationLogger;
import scot.carricksoftware.hansen.logger.ApplicationLoggerFactoryImpl;

@Component
class ApplicationFactoryImpl implements ApplicationFactory {

    @Override
    public final ApplicationLogger getApplicationLogger() {
        return (ApplicationLogger) new ApplicationLoggerFactoryImpl().getObject();
    }

    @Override
    public final FileValidator getFileValidator() {
        return (FileValidator) new FileValidatorFactoryImpl().getObject();
    }
}
