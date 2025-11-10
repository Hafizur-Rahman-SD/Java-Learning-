public class Main {
    public static void main(String[] args) {

        // Here we learn about variable data type iin java and others
        //DataType---->Variable Name----->= sign must ---->value last use ; must
        String name= "Hafizur";
        int age=23;
        double salary=120.25;
        boolean studentStatus=true;
        char gender='M';

        //Last L must use
        long bigData=2022200000178L;
        //Last f must use
        float pi=3.1416f;

        //type cousting
        double avg= (age+salary)/2;
        int rounded =(int)avg;


        System.out.println("Name: "+name +"\nAge: "+age+
                "\nSalary: "+salary+
                "\nGender:  "+gender+
                "Student Status:\n "+studentStatus+
                "bigData:\n "+bigData +"Float Data:\n "+pi+
                "Avg Value: \n"+avg
                );


    }
}

