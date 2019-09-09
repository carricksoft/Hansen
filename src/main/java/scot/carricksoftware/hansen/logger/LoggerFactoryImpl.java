package scot.carricksoftware.hansen.logger;

import org.springframework.stereotype.Component;

@Component
class LoggerFactoryImpl implements ApplicationLoggerFactory {

    private static final Object THE_ONE_LOGGER = new ApplicationLoggerImpl();

    @Override
    public final Object getObject()  {
        return THE_ONE_LOGGER;
    }

    @Override
    public final Class<?> getObjectType() {
        return ApplicationLoggerImpl.class;
    }

    @Override
    public final boolean isSingleton() {
        return true;
    }


}
