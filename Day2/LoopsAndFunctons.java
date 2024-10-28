package Day2;

public class LoopsAndFunctons {
    public static int odd_even_checker(int num){

        if(num % 2 == 0){
            return 0;
        }else{
            return 1;
        }

    }

    public static void main(String[] args) {
        for(int i = 1;i <= 10; ++i){
            int val_ret = odd_even_checker(i);
            System.out.println(val_ret);
        }
    }
}
