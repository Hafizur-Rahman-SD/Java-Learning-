import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        System.out.println("Hi, this is yor calculation section");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Value a=");
        int a = sc.nextInt();
        System.out.println("Enter your Value b=");
        int b = sc.nextInt();

//        int a  = 1;
//       int b = 2;
        System.out.println("sum of result:"+(a+b) +
                "\n Substraction of result:" +(a-b)+
                "\n Into in result:" +(a*b)+
                "\n Division of this values:"+(a/b)
        );

//
//

//
//        // Comparison -> boolean
        System.out.println("a>b = " + (a>b));
        System.out.println("a==b = " + (a==b));



    }
}