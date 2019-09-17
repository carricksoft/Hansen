package scot.carricksoftware.hansen.filehelpers;

public interface FileValidator {
    boolean validForReading(String fileName);
    String getLastError();
}
