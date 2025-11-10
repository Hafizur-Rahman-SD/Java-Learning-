import java.util.Scanner;

public class ResultCard {
    public static void main(String[] args) {
        System.out.println("Enter Your Number:");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if(marks>=90&&marks<=100 ){
            System.out.println("Your Great is A+ "+marks+".");
        } else if(marks>=80&&marks<=90){
            System.out.println("Your Great is B+ "+marks+".");
        }else if(marks>=70&&marks<=80){
            System.out.println("Your Great is C+ "+marks+".");
        }else if(marks>=60&&marks<=70){
            System.out.println("Your Great is D+ "+marks+".");
        } else {
        System.out.println("Your Great is F+ "+marks+".");
        }
        }
    }

