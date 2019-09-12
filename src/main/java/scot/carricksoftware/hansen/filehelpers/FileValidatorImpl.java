package scot.carricksoftware.hansen.filehelpers;

import org.springframework.stereotype.Component;

@Component
public class FileValidatorImpl implements FileValidator {

    @Override
    public final boolean validForReading(final String fileName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final String getLastError() {
        throw new UnsupportedOperationException();
    }
}
