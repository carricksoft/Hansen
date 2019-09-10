package scot.carricksoftware.hansen;

public interface HansenPass {

    void compile(String inputFile);
    int getErrorsCount();
}
