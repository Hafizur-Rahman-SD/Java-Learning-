import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Your Age:");
        Scanner age = new Scanner(System.in);
        int a = age.nextInt();

        if (a <=18) {
            System.out.println("Your Age is Under 18");
        } else {
            System.out.println("Your Age is not Under 18");
        }
    }
}