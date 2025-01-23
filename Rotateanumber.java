import java.util.Scanner;

public class Rotateanumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        String number = scanner.nextLine();

        System.out.print("Enter the rotate number: ");
        int rotateBy = scanner.nextInt();

        int length = number.length();

        rotateBy = rotateBy % length;

        if (rotateBy == 0) {
            System.out.println("Rotated Number: " + number);
        } else {
            String rotatedNumber = number.substring(length - rotateBy) + number.substring(0, length - rotateBy);
            System.out.println("Rotated Number: " + rotatedNumber);
        }

        scanner.close();
    }
}