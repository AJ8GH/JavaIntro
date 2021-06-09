import java.util.Scanner;

public class ControlFlow {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String stringNum = scanner.nextLine();
        int intNum = Integer.parseInt(stringNum);
        if (isEven(intNum)) {
            System.out.println("Even!");
        } else {
            System.out.println("Odd!");
        }
    }

    private static boolean isEven (int input) {
        return(input % 2 == 0);
    }
}