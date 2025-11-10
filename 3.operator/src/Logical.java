import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        //logical part
        System.out.println("Enter your Value First Value (true/false) ");
        Scanner sc1 = new Scanner(System.in);
        boolean found1  = sc1.nextBoolean();

        System.out.println("Enter your  Second Value (true/false)");
        Scanner sc2 = new Scanner(System.in);
        boolean found2  = sc2.nextBoolean();

        //how output from here
        System.out.println("Your And Result:"+ (found1 && found2));
        System.out.println("Your OR Result:"+ (found1 || found2));
        System.out.println("Your NoT Result:"+ (!found1 && !found2));

    }
}
