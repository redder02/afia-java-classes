package Day2;
import java.util.*;
public class Functions {
    // this is a single line comment
    /*
        This is a multiline comment
     */

    // function definition
    public static void greetings(String PersonName){
        System.out.println("hello " + PersonName);
    }
//    xyz function_name(abc){
//         this the body of the function
//
//         code here
//    }
    public static void main(String[] args) {

//        System.out.println("Enter your number");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        if(num % 2 == 0){
//            System.out.println("even");
//        }else{
//            System.out.println("odd");
//        }
        String name = "Afia";
        greetings(name);    // parameter passing, at this moment name is our parameter
//        greetings();
//        greetings();
//        function_name();  // function call


    }
}
