import java.util.Random;
import java.util.Scanner;

class SquareCalculator extends Thread {
    int n;

    SquareCalculator(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Square: " + n * n);
    }
}

class CubeCalculator extends Thread {
    int n;

    CubeCalculator(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Cube: " + n * n * n);
    }
}

class RandomNumberGenerator extends Thread {
    public void run() {
        Random r = new Random();

        for (int i = 0; i < 3; i++) {
            int n = r.nextInt(10) + 1;
            System.out.println("Generated: " + n);

            if (n % 2 == 0)
                new SquareCalculator(n).start();
            else
                new CubeCalculator(n).start();

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Start Simulation");
        System.out.println("2. Exit");

        int choice = sc.nextInt();

        if (choice == 1)
            new RandomNumberGenerator().start();
    }
}