package scot.carricksoftware.hansen.logger;

interface ApplicationLogger {

    void info(String message);

    void functionCall(Object classCalled, String methodName, String parameter);
}
