import java.util.Scanner;

public class asg1 {
    static Scanner sc = new Scanner(System.in);

    public static void Question_1() {
        String studentName = "Smriti";
        int rollNum = 101;
        int javaMarks = 85;
        int pythonMarks = 90;
        int dbmsMarks = 88;

        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNum);
        System.out.println("Java Marks: " + javaMarks);
        System.out.println("Python Marks: " + pythonMarks);
        System.out.println("DBMS Marks: " + dbmsMarks);
    }

    public static void Question_2() {
        int celsius = 25;

        double fahrenheit = (celsius * 9.0 / 5) + 32;

        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

    public static void Question_3() {

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }

    static void Question_4() {

        System.out.println("Voting Eligibility Check");

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Are you a citizen? (true/false): ");
        boolean citizen = sc.nextBoolean();

        if (age >= 18 && citizen) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }

    static void Question_5() {

        System.out.println("5.Simple Calculator");

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        if (operator == '+') {
            System.out.println("Result: " + (num1 + num2));

        } else if (operator == '-') {
            System.out.println("Result: " + (num1 - num2));

        } else if (operator == '*') {
            System.out.println("Result: " + (num1 * num2));

        } else if (operator == '/') {

            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Cannot divide by zero.");
            }

        } else {
            System.out.println("Invalid operator.");
        }
    }

    static void Question_6() {

        System.out.println("6. Multiplication Table");

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    static void Question_7() {

        System.out.println("7. Sum of Even Numbers");

        int i = 1;
        int sum = 0;
        while (i <= 50) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("Sum of even numbers from 1 to 50: " + sum);
    }

    static void Question_8() {

        System.out.println("8. Store and Print Marks");

        int[] marks = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        System.out.println("Student Marks:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }
    }

    static void Question_9() {

        System.out.println("9. Find Maximum");

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        int max = numbers[0];
        for (int i = 1; i < 10; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum value: " + max);
    }

    static void Question_10() {

        System.out.println("10. Average and Grade");

        int[] marks = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            sum = sum + marks[i];
        }

        double average = sum / 5.0;

        System.out.println("Average Marks: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");

        } else if (average >= 75) {
            System.out.println("Grade: B");

        } else if (average >= 50) {
            System.out.println("Grade: C");

        } else {
            System.out.println("Grade: Fail");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question_1();
        Question_2();
        Question_3();
        Question_4();
        Question_5();
        Question_6();
        Question_7();
        Question_8();
        Question_9();
        Question_10();
    }
}
