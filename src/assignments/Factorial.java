package assignments;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(addAll(4));
    }


    public static int factorial(int a){
        if(a==0) return 1;
        return a*factorial(a-1);
    }

    public static int addAll(int a){
        if(a==0) return 0;
        return a+addAll(a-1);
    }


}
