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

    private static int isEven (Integer[] args, input) {
        return(input % 2 == 0);
    }
}
// find a way to read in user input

// write a method that will check if a number is odd or even
// (assume user only ever enters integers)

// print the answer to the console
