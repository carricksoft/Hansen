package scot.carricksoftware.hansen.passtwo;

import org.springframework.stereotype.Component;
import scot.carricksoftware.hansen.HansenPassImpl;

@Component
public class PassTwoImpl extends HansenPassImpl implements PassTwo {

    @Override
    public final void compile(final String inputFile) {
        throw new UnsupportedOperationException();
    }

}
