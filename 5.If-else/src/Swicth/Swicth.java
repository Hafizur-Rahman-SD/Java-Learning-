package Swicth;

import java.util.Scanner;

public class Swicth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chose option:1= + \nChose Option2= - \nChoise Option:3= * \nchoise Option4= /" +
                "\nChoose Option5= %");
        int choice = sc.nextInt();

        System.out.println("Enter number a and b:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        switch(choice){
            case 1: System.out.println("Ans is:" + (a+b)); break;
            case 2: System.out.println("Ans is:" + (a-b)); break;
            case 3: System.out.println("Ans is:" + (a*b)); break;
            case 4: System.out.println("Ans is:" + (a/b)); break;
            case 5: System.out.println("Ans is:" + (a%b)); break;
            default: System.out.println("Invalid choice"); break;
        }
        sc.close();
    }
}
