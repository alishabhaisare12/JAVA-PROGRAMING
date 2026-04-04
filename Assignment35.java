class BankApplication {
    void processTransaction(int amount) throws Exception {
        if (amount > 10000) {
            throw new Exception("Transaction limit exceeded");
        } else {
            System.out.println("Transaction processed");
        }
    }

    public static void main(String[] args) {
        BankApplication b = new BankApplication();
        try {
            b.processTransaction(15000);
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}
