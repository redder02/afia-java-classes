package Day1;
import java.util.Scanner;
public class Ifelse {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if( age % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        // round brackets are called parenthesis
//        if (condition){
//            // if the condition evaluated as true
//        }else {
//            // if the condition evaluated as false
//        }
//        if(age < 0){
//            System.out.println("invalid age");
//        }
//        else if ( age < 18) {
//            System.out.println("you are under age!!!");
//        }
//        else if(age <= 60){
//            System.out.println("You are good to go!!!!");
//        }
//        else{
//            System.out.println("You are so old to drive!!!!");
//        }

//        if(age <= 60){ // -45, 5, 34
//            if(age < 0){
//                System.out.println("invalid age!!!");
//            }else if(age < 18){
//                System.out.println("you are under age!!!");
//            }else{
//                System.out.println("you are good to go!!!");
//            }
//        }else {
//            System.out.println("You are so old to drive!!!!");
//        }


    }
}
