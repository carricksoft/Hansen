package scot.carricksoftware.hansen.logger;

import org.springframework.stereotype.Component;

@Component
public class HansenLoggerFactoryImpl implements HansenLoggerFactory {

    private static final Object THE_ONE_LOGGER = new HansenLoggerImpl();

    @Override
    public final Object getObject()  {
        return THE_ONE_LOGGER;
    }

    @Override
    public final Class<?> getObjectType() {
        return HansenLoggerImpl.class;
    }

    @Override
    public final boolean isSingleton() {
        return true;
    }


}
