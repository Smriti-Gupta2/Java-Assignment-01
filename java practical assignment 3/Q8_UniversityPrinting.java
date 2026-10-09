class PrinterJob implements Runnable {
    int job;
    String student;

    PrinterJob(int job, String student) {
        this.job = job;
        this.student = student;
    }

    public void run() {
        System.out.println("Printing job " + job + " by " + student);

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }
}

class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrinterJob(1, "Student A"));
        Thread t2 = new Thread(new PrinterJob(2, "Student B"));
        Thread t3 = new Thread(new PrinterJob(3, "Student C"));

        t1.start();
        t2.start();
        t3.start();
    }
}