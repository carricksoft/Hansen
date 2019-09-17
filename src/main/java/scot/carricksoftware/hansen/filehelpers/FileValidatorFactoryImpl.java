package scot.carricksoftware.hansen.filehelpers;

import org.springframework.stereotype.Component;

@Component
public
class FileValidatorFactoryImpl implements FileValidatorFactory {

    @Override
    public final Object getObject()  {
        return new FileValidatorImpl();
    }

    @Override
    public final Class<?> getObjectType() {
        return FileValidatorImpl.class;
    }

    @Override
    public final boolean isSingleton() {
        return false;
    }
}
