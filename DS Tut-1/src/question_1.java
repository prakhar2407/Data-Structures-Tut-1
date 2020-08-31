import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class question_1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Elements in array:");
        int n=sc.nextInt();

        int []arr=new int[n];


        System.out.println("Enter "+n+" elements for array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        Arrays.sort(arr);

        System.out.println("Difference between max and min is:"+(arr[n-1]-arr[0]));
    }
}
