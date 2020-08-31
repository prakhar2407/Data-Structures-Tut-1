import java.util.Arrays;
import java.util.Scanner;

public class question_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <ar.length; i++) {
            ar[i]=s.nextInt();
        }
        for (int i = 0; i <ar.length ; i=i+2) {
            if((i+1)!=ar.length)
            {
                swap(i,i+1,ar);
            }
        }
        System.out.println(Arrays.toString(ar));
    }

    private static void swap(int i, int i1,int[]ar) {
        int temp = ar[i];
        ar[i]= ar[i1];
        ar[i1]= temp;
    }
}