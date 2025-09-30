public class Loops {
    public static void main(String[] args) {
        //Task 1
        System.out.println("# Task 1");
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }

        System.out.print("\n\n");

        //Task 2
        System.out.println("# Task 2");
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.print("\n\n");

        //Task 3
        System.out.println("# Task 3");
        for (int i = 0; i <= 18; i += 3) {
            System.out.print(i + " ");
        }

        System.out.print("\n\n");

        //Task 4
        System.out.println("# Task 4");
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }

        System.out.print("\n\n");

        //Task 5
        System.out.println("# Task 5");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n\n");

        //Task 6
        System.out.println("# Task 6");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 6 - row; col++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n\n");

        //Task 7
        System.out.println("# Task 7");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
