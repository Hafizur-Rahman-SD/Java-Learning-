package loop;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your value:");
        int n = sc.nextInt();
        System.out.println("printing value 1 to "+n+":");


//        for(int i=1;i<=n;i++)
//        {
//            System.out.println(i);
//        }

        //for reverse print
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
}
