public class SkillDemo {

    public static int factorial(int n) {
        if (n <= 0) {
            System.out.println("Invalid input!");

            return -1;
        }

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = i * factorial;
        }

        return factorial;
    }
}
