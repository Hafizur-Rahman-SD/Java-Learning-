import java.util.Scanner;

public class UserInput {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String Name = input .nextLine();
        System.out.print("your Name " + Name);


        System.out.print("\nEnter your Age: ");
        int age = input .nextInt();
        System.out.print("your Age " + age);

        System.out.print("\nEnter your weight: ");
        double weight = input .nextDouble();
        System.out.print("your Weight "+weight);

        System.out.print("\nEnter your CGPA: ");
        double CGPA = input .nextDouble();
        System.out.print("your CGPA " + CGPA);

        System.out.print("\nEnter your Gender: ");
        char gender = input.next().charAt(0);



    }
}
