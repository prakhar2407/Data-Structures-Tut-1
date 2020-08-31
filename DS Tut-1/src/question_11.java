import java.util.Scanner;

public class question_11 {
    static int factorial(int n) {
        int fact;

        for(fact = 1; n > 1; n--){
            fact *= n;
        }
        return fact;
    }
    static int ncr(int n,int r) {
        return factorial(n) / ( factorial(n-r) * factorial(r) );
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 0; i < n; i++) {

            for(int j = 0; j <= i; j++){
                System.out.print(" "+ncr(i, j));
            }
            System.out.println();
        }
    }
}