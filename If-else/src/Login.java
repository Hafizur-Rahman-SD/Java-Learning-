import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String name = sc.nextLine().trim();  // trim() ফাঁকা স্পেস কাটে

        System.out.print("Enter password: ");
        String pass = sc.nextLine().trim();

        if (name.equalsIgnoreCase("admin")) {  // case-insensitive compare
            if (pass.equals("1234")) {
                System.out.println(" Login Successful!");
            } else {
                System.out.println(" Wrong Password!");
            }
        } else {
            System.out.println(" User not found!");
        }

        sc.close();
    }
}
