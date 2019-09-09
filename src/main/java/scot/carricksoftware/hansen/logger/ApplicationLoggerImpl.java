package scot.carricksoftware.hansen.logger;

import org.springframework.stereotype.Component;

@Component
public class ApplicationLoggerImpl implements ApplicationLogger {

    @Override
    public final void info(final String message) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void functionCall(final Object classCalled, final String methodName, final String parameter) {
        throw new UnsupportedOperationException();
    }
}
