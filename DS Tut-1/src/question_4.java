import java.util.Scanner;

public class question_4{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int[]ar = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        System.out.print("Enter element to be searched: ");
        int search = s.nextInt();
        int freq=0;
        for (int i = 0; i <ar.length ; i++) {
            if(ar[i]==search)
                freq++;
        }
        System.out.println("Frequency: "+freq);
    }
}
