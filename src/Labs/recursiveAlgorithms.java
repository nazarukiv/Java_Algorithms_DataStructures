package Labs;

public class recursiveAlgorithms {
    public static void main(String[] args) {

        System.out.println(sum(3));

        System.out.println("<<<<<<<<>>>>>>>>>");

        System.out.println(multiply(5));

        System.out.println("<<<<<<<<>>>>>>>>>");

        //countDown(10);

        System.out.println("<<<<<<<<>>>>>>>>>");

        System.out.println(powerMyWay(2,4));

        System.out.println("<<<<<<<<>>>>>>>>>");

        System.out.println(powerRecursive(2,4));


    }

    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static int sum(int n){
        if (n < 0) return 0;
        return n + sum(n-1);
    }

    public static int multiply(int n){
        if (n <= 1) return 1;
        return n * multiply(n-1);
    }

    public static void countDown(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        countDown(n - 1);
    }

    public static int powerRecursive(int base, int exp){
        if (exp ==0)
            return 1;
        else{
            return base * powerRecursive(base, exp-1);
        }
    }

    public static int powerMyWay(int n, int exp){
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result = result * n;
        }
        return result;
    }

}
