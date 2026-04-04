class FileProcessingSystem {
    public static void main(String[] args) {
        try {
            System.out.println("Reading file...");
        } catch (Exception e) {
            System.out.println("Error while reading file");
        } finally {
            System.out.println("Closing file resources");
        }
    }
}
