class BankTransaction extends Thread {
    String type;
    int amount;

    BankTransaction(String type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public void run() {
        System.out.println(type + " transaction processed");
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        BankTransaction high = new BankTransaction("High-value", 50000);
        BankTransaction low = new BankTransaction("Low-value", 5000);

        high.setPriority(Thread.MAX_PRIORITY);
        low.setPriority(Thread.MIN_PRIORITY);

        high.start();
        high.join();

        low.start();
        low.join();
    }
}