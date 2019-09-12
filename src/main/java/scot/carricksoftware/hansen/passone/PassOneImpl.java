package scot.carricksoftware.hansen.passone;

import org.springframework.stereotype.Component;
import scot.carricksoftware.hansen.HansenPassImpl;

@Component
public class PassOneImpl extends HansenPassImpl implements PassOne {

    @Override
    public final void compile(final String fileName) {
        throw new UnsupportedOperationException();
    }
}
