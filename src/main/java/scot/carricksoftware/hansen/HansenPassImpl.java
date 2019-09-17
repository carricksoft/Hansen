package scot.carricksoftware.hansen;

public class HansenPassImpl implements HansenPass {

    @Override
    public final int getErrorsCount() {
        return 0;
    }

    @Override
    public void compile(final String fileName) {
        // will always be over-ridden
    }

}
