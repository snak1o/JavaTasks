import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows?");
        String count = sc.nextLine();
        for (int rows = 1; rows <= Integer.parseInt(count); rows++) {
            for (int spaces = 0; spaces < Integer.parseInt(count) - rows; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= rows; stars++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
