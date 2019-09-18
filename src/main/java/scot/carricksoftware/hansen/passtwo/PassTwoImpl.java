package scot.carricksoftware.hansen.passtwo;

import org.springframework.stereotype.Component;
import scot.carricksoftware.hansen.HansenPassImpl;
import scot.carricksoftware.hansen.factories.ApplicationFactory;

@Component
public class PassTwoImpl extends HansenPassImpl implements PassTwo {

    public PassTwoImpl(final ApplicationFactory applicationFactory) {
        super(applicationFactory);
    }

    @Override
    public final void compile(final String fileName) {
        super.compile(fileName);
    }

}
