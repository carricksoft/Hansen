package scot.carricksoftware.hansen;

import scot.carricksoftware.hansen.factories.SingleObjectFactory;

import java.util.Objects;

public class SimpleFactoryTests {

    protected boolean checkFactoryOperation(final SingleObjectFactory factory, final Class requiredClass, final boolean singletonRequired) {
        return checkSingleton(factory, singletonRequired)
                && checkCorrectObjectClass(factory, requiredClass)
                && checkCorrectObjectType(factory,requiredClass);
    }

    private boolean checkCorrectObjectType(final SingleObjectFactory factory, final Class requiredClass) {
        try {
            return requiredClass == Objects.requireNonNull(factory.getObject()).getClass();
        } catch (Exception e) {
            return false;
        }
    }

    private boolean checkCorrectObjectClass(final SingleObjectFactory factory, final Class requiredClass) {
        return requiredClass == factory.getObjectType();
    }

    private boolean checkSingleton(final SingleObjectFactory factory, final boolean singletonRequired) {
        return singletonRequired == factory.isSingleton();
    }

}
