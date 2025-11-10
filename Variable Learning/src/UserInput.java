import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String Name = input .nextLine();


        System.out.print("your Name " + Name);
    }
}
