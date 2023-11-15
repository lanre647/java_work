import java.util.Scanner;

enum Grade {
    DISTINCTION(80, 100),
    VERY_GOOD(60, 80),
    GOOD(40,60),
    PASS(20, 40),
    FAIL(0, 20);

    private final int minRange;
    private final int maxRange;

    Grade(int minRange, int maxRange) {
        this.minRange = minRange;
        this.maxRange = maxRange;
    }

    public static Grade getGrade(int result) {
        for (Grade grade : Grade.values()) {
            if (result >= grade.minRange && result <= grade.maxRange) {
                return grade;
            }
        }
        return null;
    }
}

public class Enum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the result: ");
        int result = scanner.nextInt();

        Grade grade = Grade.getGrade(result);

        if (grade != null) {
            switch (grade) {
                case DISTINCTION:
                    System.out.println("Distinction");
                    break;
                case VERY_GOOD:
                    System.out.println("Very Good");
                    break;
                case GOOD:
                    System.out.println("Good");
                    break;
                case PASS:
                    System.out.println("Pass");
                    break;
                case FAIL:
                    System.out.println("Fail");
                    break;
            }
        } else {
            System.out.println("Invalid result");
        }

        scanner.close();
    }
}