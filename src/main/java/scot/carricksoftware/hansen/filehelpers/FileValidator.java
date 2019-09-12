package scot.carricksoftware.hansen.filehelpers;

interface FileValidator {
    boolean validForReading(String fileName);
    String getLastError();
}
