package scot.carricksoftware.hansen.passone;

import org.springframework.stereotype.Component;
import scot.carricksoftware.hansen.HansenPassImpl;
import scot.carricksoftware.hansen.factories.ApplicationFactory;

@Component
public class PassOneImpl extends HansenPassImpl implements PassOne {

    public PassOneImpl(final ApplicationFactory applicationFactory) {
        super(applicationFactory);
    }

    @Override
    public final void compile(final String fileName) {
        super.compile(fileName);
    }
}
