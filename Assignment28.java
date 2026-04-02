class TextProcessingBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Welcome");
        sb.append(" to Java");

        System.out.println("Modified String: " + sb);
        System.out.println("StringBuilder is faster, StringBuffer is thread-safe.");
    }
}
