package scot.carricksoftware.hansen.logger;

public interface HansenLogger {

    void info(String message);

    void functionCall(Object classCalled, String methodName, String parameter);
}
