package scot.carricksoftware.hansen.logger;

public class ApplicationLoggerFactoryImpl implements ApplicationLoggerFactory {


    private static final ApplicationLogger THE_LOGGER = new ApplicationLoggerImpl();

    @Override
    public final Object getObject() {
        return THE_LOGGER;
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
