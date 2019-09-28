package scot.carricksoftware.hansen;

public interface HansenPass {

    int getErrorsCount();

    void compile(String inputFileName, String outputFileName);

}
